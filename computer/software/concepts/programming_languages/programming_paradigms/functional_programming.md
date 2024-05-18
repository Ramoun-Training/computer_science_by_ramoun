---
runme:
  id: 01HVV9NWHM8PQ26V97VF4XFC2K
  version: v3
---

# Functional Programming

## Overview
- Functions
- Referential Transparency
- Side Effects
- Pure Functions

## Essential Terminology

### Functions

a unit of computation that takes an input (`i/p`) and produces an output (`o/p`).

```js
const compute = (a, b) => a + b;
```

### Referential Transparency

an **expression** is **referentially transparent** if it can be replaced with its **value** without changing to program's behavior.

#### Expression

an arrangement of values (literals), variables, constants, functions as operands and operators that produce a single value.

```js
/* referentially transparent */ const exp1 = 1 + 2;
/* referentially transparent */ const exp2 = exp1 * 33;
/* referentially transparent */ const exp3 = exp2 + exp1 * (2 + 3);
```

#### Value

there are multiple definitions:

- the worth of something
- a numerical quantity that is assigned or determined by calculation or measurement

> **Note**: Values are meant to be transparent.

#### Transparent

it means "**readily understood**".

#### Referential

it means pointing to something or having a reference. 

### State

the status of the program at any point in given time. it is the union (or set) of all the variables in the program.

### Side Effects

a change to the state of the system that occurs during the computation of a value (result).

#### Example .1: generate output beyond the return value

```js
const compute = (a, b) => {
  /* | */ const r = a + b;
  /* - */ /* side effect */ console.log(r); // do something outside of me (something that has to do a change to another system outside of me)

  /* | */ return r;
}
```

#### Example .2: Setters: they change an object's internal state

```js
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  /* setter */ changeAge(age) {
    this.age = age // changing the state of the object
  }
}
```

> **Note**: invoking methods on objects causes side-effects

> **Note**: a side effect happens when a function performs a computation that affects the external world (something changes somewhere else because of this function (e.g: a thing shows on the screen))

### Pure Functions