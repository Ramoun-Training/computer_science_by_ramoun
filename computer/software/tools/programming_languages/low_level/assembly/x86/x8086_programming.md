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

### 