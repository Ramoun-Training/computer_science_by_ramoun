# Scopes

basically every method/function in python got its own scope and that means variables defined within that scope are only known for members of that scope.

## how python works with scopes

1. pyhon searches for the refrenced variable in the scope of the method, if it finds it then this variable is a local variable (you can say it's environment aware)

2. if python doesn't find the variable declared elsewhere in the body of the function, it searches in the global scope, if it finds it in the global scope, then that is a global variable.

3. if python doesn't find the variable in the global scope, then the variable doesn't exist.


> **Note**: any refrencing to a global variable in a function works smoothly, unless you assign the refrenced global varaible inside of the function (python considers that a declaration of a local variable).

> **Tip**: to change a global variable in another scope, use the `global` keyword.

```python
x = 3
def method():
    global x = 33
method()
print(x) # 33
```

> **Note**: it is considered good practice not using the `global` keyword, instead use the passing args way.

```python
x = 3
def method(x):
    print(x)
    x = 3
    return x

method(x)
```