# ASM x8086

## Type and Variable Declaration

### DATATYPES IN X86ASM

- __DB__: (Defined Byte) - locates _1byte_ of memeory.
- __DW__: (Defined Word) - locates memory _depending on machine architecture_ (32bit - 64bit).
- __DD__: (Defined Doubleword) - locates double of __DW__.
- __DQ__: (Defined Quadword) - locates quadrouble of __DW__.

```x86asm
;VARNAME TYPE VALUE

A DB 9;
MESSAGE DB 'HELLO WORLD'; ONE BYTE FOR EACH CHAR IN THE STREAM

VAR DW 1122H;   
```

### STRINGS IN X86ASM

```x86asm
STR1 DB "HELLO WORLD";
STR2 DB "HELLO WORLD", '$'; '$' == '\0' in c
STR3 DB 10, 13, "HELLO WORLD", '$'; 10,13 == '\n'
```

## Arrays in x8086

### ARRAY DECLARATION

```X86asm
; NAME TYPE VALUE
A DB 1H, 2H, 3FH, 7FH;
B DW 1111H, 2222H, 3333H;

; ALL WITH SAME SIZE DB
```

### ACCESS VALUE FROM AND ARRAY

```x86asm
;A[0] = 1
;A[1] = 2
;A[2] = 3F
;A[3] = 7F
```

```X86asm
MOV VAR, A[2];

;OR USE INDEX REGISTERS
MOV SI, 2;
MOV VAR, A[SI]
```

### ARRAY DECLARATION USING DUB

```x86asm
; DUB OR DUP STANDS FOR DUPLICATE

X DB 3 DUP(7);
; SIMILAR TO
X DB 7, 7, 7;

Y DB 3 DUP(5, 6)
; SIMILAR TO
Y DB 5, 6, 5, 6, 5, 6;
```

### DECLARTIN AN EMPTY ARRAY

```x86asm
VAR DB 10 DUP(?);

; EQUIVLENT TO: INT VAR[10]={0};
```

### MOV INSTRUCTION

- **Purpose**: copy second operand called 'source' to first operand called 'destination'

  ```x86asm
  MOV CX, 33H;
  ```
- **Constraints**: types of operations supported.

    ```x86asm
    ;MOV OPERATIONS IS LIMITED BY OPERANDS
    MOV MEM, REG;
    MOV REG, MEM;
    MOV REG, REG;
    MOV MEM, IMM;
    MOV REG, IMM;
    ; NOTE:
    ; MOV MEM, MEM; IS NOT SUPPORTED
    ```

    ```x86asm
    ; EX: 
    ; REG: AX,BX, AH,BL, DI,SI ....ETC.
    ; IMMEDIATE: 7, -11, 4FH ...ETC.
    ; MEM: [BX], OR [BX+SI] + DISPLACMENT
    ```

- **Memory**: combination of (BX, SI, DI, BP) registers inside `[]` can be used to access memory.

### BASIC INSTRUCTIONS

- **Basic Operations**

    +  <a href="#add">addition</a>
    +  <a href="#sub">subtraction</a>
    +  <a href="#mul">multiplication</a>
    +  <a href="#div">division</a>
    +  <a href="#com">comparison</a>
    +  <a href="#neg">negation</a>
    +  <a href="#inc_dec">increment / decrement</a>
    
    ```c#
    # operations in c-like langs (c/c++/java/c#/javascript)
    int a = 11;
    int b = 14;
    b = 0;
    int sum;
    sum = b + 10;
    sum = 10 * c;
    ``` 

- **<span id="add"></span>Addition**

    ```x86asm
    ; ADD DESTINATION, SOURCE;
    MOV BX, 12H;
    ADD BX, BX; BX = BX + BX
    ; BX = 24H;
    ```

    ```x86asm
    ADD [BX], 7; [BX] = [BX] + 7
    ```
    > **Note**: RESult of __addition__ is stored in _DESTINATION_.

- **<span id="sub"></span>Subtraction**

    ```x86asm
    ; SUB DESTINATION, SOURCE;
    MOV BX, 12H;
    MOV CX, 11H;
    SUB BX, CX; BX = BX - CX
    ; BX = 1H;
    ```

    ```x86asm
    SUB [BX], 7; [BX] = [BX] - 7
    ```
    > **Note**: RESult of __subtraction__ is stored in _DESTINATION_.

    > **Note**: if Result is negative, you have to check the <a href="#flags">flags</a> register.

- **<span id="mul"></span>Multiplication**

    ```x86asm
    ; MUL SRC 
    ; ONLY ONE OPERAND
    ; SRC -> [MEM], REG
    
    ; THIS INSTRUCTION ASSUMES ONE OF THE OPERAND IS AL, AX.

    ; REPRESENTAION
    ; AL = AL * BL (8 BIT MUL) - DEPENDS ON 'BL'
    ; AX = AX * BX (16 BIT MUL) - DEPENDS ON 'BL'
    ```

    > **Note**: immediate mulitiplication is not allowed. Ex: `MUL 7`;

    ```x86asm
    MOV AL, 7H;
    MOV BL, 7H; KEEP IMMEDIATE DATA IN BL

    MUL BL; AL = AL * BL;
    ```

    > **Note**: There is some constraints for the `MUL` operation:        
        - Two 8-bit numbers multiplied generate 16-bit product.   
        - Two 16-bit numbers muliplied generate 32-bit product.   
        - In 16-bit muliplication 32-bit product appears in `DX-AX` instead of `AX`.
         
    ```x86asm
    MOV BX, 0070H;
    MOV AX, 3000H;

    MUL BX; RESULT: DX-AX CF = 0021-0000-1
    ```   

    > **Note**: `IMUL` is used for signed multiplication (uses the overflow flag).


- **<span id="div"></span>Division**
- **<span id="com"></span>Comparison**
- **<span id="neg"></span>Negation**
- **<span id="inc_dec"></span>Increment / Decrement**
- **<span id="flags"></span>Flags**

    Flags (Processor Status Register) Register is a 16-bits register. Each bit is called as a 'flag', and it can be `0` or `1`.

    - CARRY (CF):   
        Turn to `1` when there is unsigned overflow (result is not in range [0, 255]).

    - PARITY (PF):   
    - AUXILIARY CARRY (AF)
    - ZERO (ZF):   
        Set to `1` when result is `0` and `1` otherwise.

    - SIGN (SF):   
        Set to `1` when result is -ve and `0` otherwise.

    - TRAP (TF)
    - INTERRUPT ENABLE (IF)
    - DIRECTION (DF)
    - OVERFLOW (OF)

    > **Note**: podcastz - stdiocapsz.