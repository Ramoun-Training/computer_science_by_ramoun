# OOP Python [1]

- why OOP?
    1. it allows us to logically group data and functions in a way that is easier to reuse and alos easy to build upon if we need.

- **class**: a blueprint for creating instances.

- **method**: a function that is associated with a class.

- **attribute**: a variable (data) that is associated with a class.

- **instance variables**: are variables that contain data that is unique to each instance.

- **class variables**: are variables that are shared among all instances of a class (class variables should be the same for each instance). class variables can be accessed through objects too (and not only class name).

> **Tip**: try creating an oop intensive app without the use of any oop paradigm (functional programming only) and see the result and compare.

## Creating Instances (objects)
- creating a dummy class

    ```python
    class Employee:
        pass
    ```

- creating an instance of the class
    
    ```python
    emp1 = Employee()
    ```

- creating an instance variable
    
    ```python
    emp1.name = 'ramoun'
    ```

## Creating Classes

> **Note**: each method within the class automatically (implicitly) takes the instance as the first argument.

- constructors/inititilizer

    ```python
    class Employee:
        def __init__(self, first, last, pay):
            self.first = first
            self.last = last
            self.email = f'{first}.{last}@company.com'
            self.pay = pay
    ```

- methods

    ```python
        def full_name(self):
            return f'{self.first} {self.last}'
    ```

- `self` mystery solved

    ```python
    emp1.fullname()
    # is the same as 
    Empolyee.fullname(emp1) # actually that's what happens in the bg when `emp1.fullname()` is executed
    ```

## Class variables

> **Note**: when you try to access an attribute on an instance, it will first check if the instance contains that attribute and if it doesn't it will see if the class or any class that it inherits from contnains that attribute.

> to get the name space of an object or a class
that helps in checking what are the class methods and what are the instance methods
```python
print(obj.__dict__)
print(cls.__dict__)
```

- updating a class variable

    ```python
    Employee.raise_amount = 1.05
    ```

- updating an instance variable

    ```python
    emp1.raise_amount = 1.08
    # this assignment created the raise_amount attribute within emp1 (overiding the class attribute)
    ```

## methods

- regular methods

    they take the instance as their first argument by default (automatically).

- class methods
    
    methods that take classes as their first args by default (automatically).
    ```python
    # it is as easy as adding a decorator to the method
    @classmethod
    def method(cls):
        pass
    ```

- static methods

    methods that don't take anything as their first args by default (automatically). They behave like ordinary functions. We include them in classes because they have some logical connection with a class but it doesn't actually depend on any specific instance or class varaible. 

    ```python
    @staticmethod
    def is_workday(day):
        if day.weekday() == 5 or day.weekday() == 6:
            return True

        return False
    ```
    > **Tip**: to know if the method is a static method and not a regular method or a class method (check for 'cls' & 'self' within your function because if you don't access the instance or the class anywhere within the function).

## Inheritance

inheritance allows us to inherit (copy) attributes and methods from a parent class.

```python
class A:
    def __init__(self, name):
        self.name = name
class B(A):
    pass

b = B('ramoun')
```

### How it works

1. when an object is instanciated, python looks in the class for the `__init__`().
1. if doesn't find it, it walks up the chain of inheritance until it finds what it is looking for.

```python
# more in depth look
print(help(B))
'''ouput
class B(A)
| method resuolution order
|    B
|    A
|    builtins.objects # the last place to look and every class in python inherits from this base object class
'''
```

# Resources

> **Note**: an Employee example python file that applies all paradigms in this md file is @: [this link]( https://github.com/Ramoun-Training/computer_science_training/blob/master/computer/software/tools/programming_languages/general_purpose/python/the_lingo/basic/oop/examples/employee/employee.py#L1)

- [[1] corey's video](https://www.youtube.com/watch?v=ZDa-Z5JzLYM&list=PL-osiE80TeTsqhIuOqKhwlXsIBIdSeYtc&index=2&t=0s&ab_channel=CoreySchafer)