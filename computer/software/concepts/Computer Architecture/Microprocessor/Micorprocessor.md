# Microprocessors

## Instruction Execution Cycle

1. (`.exe` file is binary) is loaded to memory
2. linking (searching for dependencies - most of the time: `.dll` files)
3. fetch
4. decode
5. execute
6. store output

## Registers

### INTRO

- General Purpose 
    + AX
    + BX
    + CX
    + DX

    + BP (Base Pointer)
    + SP (Stack Pointer)
    + SI (Source Index)
    + DI (Destination Index)

- Segement Registers
    + CS
    + SS    
    + DS
    + ES
    + FS
    + GS

- Processor Status Flags Register
    + FLAGS

- Instruction Pointer Register
    + IP    

> **Note**:    
> - Extended: EAX (E: 32bit)
> - X: AX (X: 16bit)
> - L: AL (L: 8bit)
> - H: AH (H: 8bit)

### INTENDED REGISTER USE

- General Purpose 
    - **EAX**: Accumulator
    - **ECX**: Loop Counter
    - **ESP**: Stack Pointer (TOS)
    - **ESI**, **EDI**: Index Registers (for arrays)
    - **EBP**: Extended Stack frame base Pointer
- Segment
    - **ECS**: Code Segement
    - **EDS**: Data Segement
    - **ESS**: Stack Segement

### SPECIALIZED REGISTERS

- **EIP**: Instruction Pointer   
    the address of the next instruction to be exectuted.

- **EFLAGS**:    
    status and flags (each flag is a single bit)

    + __CARRY__: when there is an overflow of an arithmatic operation.

> **Note**: all x86 (8086, 80386, 80486, P5) same architecture (same ISC)

## All About Abstract

### STEPS

- Assembling (produces obj file(binary) and listing file(text))
- Linking
- Loading
- Executing

## How to Write ASM Code

### INTEGER CONSTANTS (LITERALS)

```X86ASM
; {+/-}DIGITS[RADIX]
```
```X86ASM
+3B;
-2H;
2D;
-2;
```
- optional leading {-/+}
- binary(b), decimal(d), hexadecimal(h)
- common radix chars:
    + __(hexadecimal [_h_])__: Use as much as possible.
    + __(decimal [_d_])__: Use when the hexadecimal makes no sense (accrd. to the context).
    + __(binary [_b_])__: Use for bitwise clarity.
    + __(encoded real [_r_])__: Use for real.

> **Note**: in the 'MASM' if the radix is omitted, the number is considered a decimal.

### INTEGER EXPRESSIONS (EXPRESSIONS)

Operator | Name | Precedence Level
---------|------|-----------------
() | parenthises | 1
U{+,-} | unary plus,minus | 2
*,/ | multiply,div | 3
MOD | modulus | 4
+,- | add,subtract | 5

### CHARACTERS AND STRINGS

- Enclose Character in single or double quoutes 
    + 'A', "A".
    + ASCII character = 1byte.

- Enclose Strings in single or double quotes
    + "ABC"
    + 'ABC'
    + Each Character Occupies a single byte.

- Embedded Quotes are Allowed
    + 'Say, "Good", Mark'
    + "This's not a test"

> **Note**: all strings must endup with a zero: `"hello",0`.

> **Note**: The zero is not part of the string it is just there for functions to know where the string ends and that allows a ton of string operations.

> **Note**: strings can be enclosed in single (`''`) or double (`""`) quotations, to allow single quotes inside of strings (in words like `"isn't"`) and to allow double quotes too (`'I Love "Computers"'`).

```
I Wonder Why didn't they use the tick `` instead.
> `Minimal Approach` way of thinking
```

### RESERVED WORDS AND IDENTIFIERS

- Rserved words can't be used as identifiers
    + Instruction Mnemanics, directives(`.data`), type attributes, operators, predefined symbols.
    + See MASM refrence.

- Identifiers
    + 1-247 characters, including digits    
    + not case sensitive.
    + first character must be a letter, `_`    , `@`, `?`, or a `$`.
    + used for labels (procedure names, variables) and constants.

    > **Note**: the `_`,`@`,`?`, and `$` all have conventional meaning (not restricted but recommended). 

    > **Note**: `_` can be used if the identifer name is reserved (`mov` becomes `_mov`)

### INTEL INSTRUCTIONS

- Assembled into machine code by _assembler_.
- Executed @ runtime by _CPU_.
- An Instruction contains:
    - __Label (optional)__:
        + Act as a place marker (marks the address [offset] of code and data).
        + Follow Identifier rules.
        + Data Label (Variable Names) must be unique. Ex: `count DWORD 100` (NOT FOLLOWED BY COLON).
        + code label: targets loop and jump instuctions (`L1:`).
        ```x86asm
        start:
        MOV AX, 3;
        LOOP START
        ```
    - __Mnemonics/Instruction Formats (required)__:
        + No Operand: `stc; set carry flag`.
        + One Operand: `inc eax; register`, `inc myByte; memory`.
        + Two Operands: `add ebx, ecx; register, register`, `sub myByte, 24; memory, constant`, `add eax, 36*24; reg, const-expr`.
        + No Operations (NOP Instruction): The safest and most useless instruction, it uses one byte of storage, For CPU (reads it, decodes it, ignores it), usually used to align code to even-address boundaries (multiples of 4).
        > **Note**: x86 processors are designed to load code and data more quickly from even double word addresses.
    - Operand(s) (depends on the instruction)
    - Comment   (optional) - begins with `;`

    ```x86asm
    ; [label:] mnemonic [operands] [;comment]
    ```

    ```x86asm
    ; EX:
    LOOP1: MOV EAX, 32 ;COUNT OF ARRAY ELEMENTS
    ```