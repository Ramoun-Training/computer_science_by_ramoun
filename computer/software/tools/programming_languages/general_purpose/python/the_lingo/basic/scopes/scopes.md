---
runme:
  id: 01HWTMW6CGW4B8JC6EA203BQTD
  version: v3
---

# Scopes

basically every method/function in python got its own scope and that means variables defined within that scope are only known for members of that scope (scopres determine where variables can be accessed from within the program and what values those variables hold in different contexts).

## understanding scopes in pyhon [2]

**`LEGB`**

|L  |E  |G  |B  |
|---------|---------|---------|---------|
|Local     |Enclosing Function Locals |Global(module)         |Built-in         |
|variables assigned within a function(`def` or `lambda`). |variables in the local scope of an enclosing function(`def` or `lambda` - inner to outer). |variables assigned at the top-level of a module or explicitly defined using the `global` keyword. |names preassigned in built-in names module in python.

> **Note**: python first checks for the variables in the local scope, then the enclosing scope, then the global scope and finally the built-in.[2]

## how python works with scopes

1. [**`L`**] python searches for the referenced variable in the scope of the method, if it finds it then this variable is a local variable (you can say it's environment aware)
2. [**`G`**] if python doesn't find the variable declared elsewhere in the body of the function, it searches in the global scope, if it finds it in the global scope, then that is a global variable.
3. [**`B`**] if python doesn't find the variable in the global scope, then the variable doesn't exist.

> **Note**: any refrencing to a global variable in a function works smoothly, unless you assign the refrenced global varaible inside of the function (python considers that a declaration of a new local variable).

> **Tip**: to change a global variable in another scope, use the `global` keyword. Imagine how it would be difficult to maintain the code if using theses `global` statements and having to worry about vars in functions overriding values outside that function.

> **Note**: if you are overusing the `global` keyword then you are probably doing somehting wrong.[2]

> **Note**: the difference between local vars and paramters is that paramters can be assigned values from outside the scope of the function (they are the i/p gate of the function).[2]

```python {"id":"01HWTMW6CF378QCAP3C7TYPMJR"}
x = 3
def method():
    global x = 33
method()
print(x) # 33
```

> **Note**: it is considered good practice not using the `global` keyword, instead use the passing args way.

```python {"id":"01HWTMW6CF378QCAP3C88H0V35"}
x = 3
def method(x):
    print(x)
    x = 3
    return x

method(x)
```

## built-ins:

to view buit-in vars in python

```python {"id":"01HWTMW6CF378QCAP3CB4CYBH0"}
import builtins

print(dir(builtins))
```

> **Note**: be carefull not to override builtins. Python gives the programmer the power to overide bultins.[2]

```python {"id":"01HWTMW6CGW4B8JC6E9T73X68T"}
import builtins

def min():
    pass

m = min([1,2,3])

# output: Error

'''
python found the min function in the global scope so it fell back for the built-in scope.
'''
```

## Enclosing scope

it has to do with nested functions and closures.

```python {"id":"01HWTMW6CGW4B8JC6E9TN7SK93"}
def outer():
    x = 'outer x'
    def inner():
        x = 'inner x'
        print(x)

    inner()
    print(x)
outer()
```

```python {"id":"01HWTMW6CGW4B8JC6E9TSZ6VTT"}
def outer():
    x = 'outer x'
    def inner():
        # x = 'inner x'
        print(x)

    inner()
    print(x)
outer()
```

### What happens with the Enclsing scope:[2]

1. python looks in the local scope for the variable.
2. then python looks in the local scope of an enclosing function.

> **Note**: the local scope and the enclosing scope is just like the local and global scope but inside of functions.[2]

### and as with the global scope...the `nonlocal` statement [2]

```python {"id":"01HWTMW6CGW4B8JC6E9TWQC5VH"}
def f1():
    x = 'hi'
    def f2():
        nonlocal x
        x = 'no'
        print(x)
    f2()
    print(x)

f1()
```

> **Note**: `nonlocal` is used more often than the `global`. Because `nonlocal` can be useful in order to change the state of closures, decorates and things like that.[2]

## Final thoughts

```python {"id":"01HWTMW6CGW4B8JC6E9Y9CTP61"}
# global_0
def f_1():
    # local_1
    # enclosing_1
    def f_2():
        #local_2
```

```python {"id":"01HWTMW6CGW4B8JC6E9Z0V02G2"}
# just follow the LEGB
x = 'global x'

def outer():
    x = 'outer x'
    def inner():
        x = 'inner x'
        print(x)
    inner()
    print(x)

outer()
print(x)
```

```python {"id":"01HWTQ7JRE283JW20RG0GX6NK6"}
x = 22
def func(x):
    print("x is:", x)
    x = 1000
    print("local x changed to:", x)

func(x)
print(x)
```

```python {"id":"01HWTQJSHMMNPWHY5CPBTHCFY1"}
x = 22

def change_x():
  global x
  x = 2000

print(x)
change_x()
print(x)

```

```python {"id":"01HWTQNZ9484WHEBGM0TSPYA92"}
# better way
x = 1000
change_x(x):
  x = 20000
  return x

x = change_x(x)
```

```python {"id":"01HWTQKX4N0RQNAEQ3J7207BGE"}

```

## benifits of knowing about scopes

- helps in the debugging process when a variable may not have the value that you expected.[2]

![scopes](./scopes.png)

# Refrences

[1] video of that guy that i donp't remember his name

[2] [corey schafer](https://www.youtube.com/watch?v=QVdf0LgmICw&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=19&t=0s)
