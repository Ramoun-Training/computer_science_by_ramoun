# OOP Python 

## What is OOP? [2]

oop is a logical way (or paradigm) for representing data in an encapsulated form (attributes[properties] - methods[actions]).

## Data representation [2]

in almost every programming language ever (including python) data can be represented in one of 3 forms [primitive, collectioin, more complex (json, xml, numerous collections, __oop__, ...etc)]

![data reprsentation illustration](https://i.imgur.com/xBwpufW.png)


## why OOP? [1]

it allows us to logically group data and functions in a way (logical unit) that is easier to reuse and also easy to build upon if we need.

> **Tip**: try creating an oop intensive app without the use of any oop paradigm (functional programming only) and see the result and compare.


## Terminology [1]

- **class**: a blueprint for creating instances (grouping of data [vars, methods]).

- **object**: an instance of a class (it has all class methods and attributes) with the a bility to be modified without affecting the original class.

- **method**: a function that is associated with a class (i.e: provides the functionality, what the objects can do, or what can we do with the objects).

- **attribute**: a variable (data) that is associated with a class (i.e: provides the data we need to store).

- **instance variables**: are variables that contain data that is unique to each instance (object).

- **class variables**: are variables that are shared among all instances of a class (class variables should be the same for each instance). class variables can be accessed through objects too (and not only class name due to __method resolution order__).

## Class-Object Relationship

an object is an instance (like a copy) of a class.

![class_object_relationship](https://i.imgur.com/0dvVfUD.png)


## Creating Classes

- constructors/inititilizer

    is a method called automatically whenever an object is created.[2]

    `__init__()` is used to set attributes for newly created objects.[1]

    ```python
    class Employee:
        def __init__(self, first, last, pay):
            self.first = first
            self.last = last
            self.email = f'{first}.{last}@company.com'
            self.pay = pay
    ```

    > **Note**: `__init__()` is a special method that python looks looks for when a class is created to execute code inside of it.[2]

    > **Note**: if the `__init__()` is not found, then the original one defined by python in the _builtins_ is invoked.[2]   

    > **Tip**: `__init__()` should be as thin as possilble. Its soul purpose is to basically take passed-in args & assign them to the object.

    
    |redundent way|optimal solution|
    |---------|---------|
    |obj1 = Cls()| def func(obj, name, age):|
    |obj1.name=""| obj.name= name|
    |obj1.age=25 | obj.age= age|
    |obj2 = Cls()| |
    |obj2.name=""| |
    |obj2.age=22 | |

<br>

- methods

    ```python
        def full_name(self):
            return f'{self.first} {self.last}'
    ```
    
    > **Note**: each method within the class automatically (implicitly) takes the instance as its first argument.

        > Note: 
            params: are the names listed in the function defination.
            args: are the real values passed to the function.
        so we can say: params are initialized to the values of the args supplied. 

- `self` mystery solved

    __`self`__: refers to the object itself. In python, objects are passed by refrence.It's more like `this` in other languages.

    We put the variable 'self' as paramater for any method that we create to work with individual objects.

    ```python
    emp1.fullname()
    # is the same as 
    Empolyee.fullname(emp1) # actually that's what happens in the bg when `emp1.fullname()` is executed
    ```
    > **Note**: the `self` is always implicit, you never have to pass anything for that.

> **Note**: python is more dynamic language than c# or Java, because you can add attributes and methods(that works differently) on the fly (like JS). but it's recommended to not do that.

> **Note**: It's considered best practice to put any data that you expect an object ot have inside the `__init__()` method.

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

python got multiple types of methods

- regular methods

    they take the instance as their first argument by default (automatically).

    > **Note**: if an object is passed to a method in python, then this method can apply multiple changes to that object (it can Create/Edit/Remove/Access the object's properties and methods).

    ![regualr methods](https://i.imgur.com/k0O5i9Q.png)


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

    static methods are invoked on the class itself.

    ```python
    @staticmethod
    def is_workday(day):
        if day.weekday() == 5 or day.weekday() == 6:
            return True

        return False
    ```
    > **Tip**: to know if the method is a static method and not a regular method or a class method (check for 'cls' & 'self' within your function because if you don't access the instance or the class anywhere within the function).

- other 

    ```python
    def method():
        return 'method'
    ```

## Inheritance (subclassing)

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

> **Note**: that chain of inheritance is called _method resolution order_.

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
if used correctly, subclassing can help us reuse our code nicely.

> **Tip**: python has builtin functions that can help us with inheritance and oop in general like `isinstance()` & `issubclass()`

## Special (Magic/dunder) Methods

special methods are methods that already exist and we can overide to perform specific tasks .They also allow us to emulate some built-in behaviour within python and it is also how we implement operator over-loading.

- Examples of Operator overloading

    - adding 2 strings together
        ```python
        print('hi' + ' Guys') # 'hi Guys'
        ```
    - addding 2 ints together
        ```python
        print(3 + 2) # 5
        ```

    **Note**: although we are using the same operator we get different results (computational, concatenation) depending on objects passed.

- Example of paramater overloading
    
    - printing an integer object
        ```python
        x = 3
        print(x) # 3
        ```
    - printing an employee object
        ```python
        emp = Employee()
        print(emp) # <__main__.Employee object at 0x232312123>
        ```
    > **Note**: using special methods, we can change some of these built-in behaviour and operations. 

### why use the dunder (`__`)?

1. to distinguish the method from other methods in the class (i.e: telling python, this is a special method that you're looking for).
1. dunder methods can't be called by objects (they are like private methods in other languages that are only called by the class itself).

> **Note**: `cls.__init__(obj)`, `obj.__init__()` works.

### `__repr__`

`__repr__()` is implicitly called whenever we call `repr()` on our objects or `print()`.

> **Note**: `__repr__()` is meant to be an unambigous representation of the object and it should be used for debuging and loggin...etc. It's really meant to seen by other developers.

### `__str__`

`__str__()` is implicitly called whenever we call `str()` on our objects (whenever you try to convert an object to a string).

we override the `__str__()` because somethimes we need ot know the data iteself instead fo knowing the address of the data.

> **Note**: `__str__()` is meant to be more of a readable representation of the object and it's meant to be used as a display for the end-user.

> **Tip**: you first wanna make sure to at least have an `__repr__()` in your class because if you only have `__repr__()` and don't have a `__str__()`. Then calling `str()` on an object will just use `__repr__()` as a fall back. So it's good to have `__repr__()` as a minimum.

> **Note**: when you try to `print()` an object, it is going to automatically invoke the `__str__()` method and if doesn't find it will look for it in the parent class and if still doesn't find it it will try to use the `__repr__()` of the class itself, and if it doesn't find it will follow the same chain in-order.

> **Note**: anytime you overide the `__str__()`, you need to return a string.

> **Tip**: a good rule of thumb is to try to place something that you could copy and paste back to your python code that would recreate that same object.

### special arithmatec methods

- the plus operator (+)

    when you add 2 ints together `print(2+2)`, what happens in the background is that it's using a special method in the background called `__add__()` and you can access it directly using the `int.__add__(1,2)` and it will give you the same result.
    
    ```python
    print(2 + 3)
    ```
    ```python
    print(int.__add__(2, 3))
    ```

- the concatenation operator (+)

    when you add 2 strs together `print('a'+'b')`, what happens in the background is that it's using a special method in the background called `__add__()` and you can access it directly using the `str.__add__('a','b')` and it will give you the same result.
    
    ```python
    print('a' + 'b')
    ```
    ```python
    print(str.__add__('a', 'b'))
    ```

- real world example (datetime)
    in the datetime module we have a `__add__()`
    ```python
    def __add__(self, other):
        if isinstance(other, timedelta):
            return timedelta(
                self._days + other._days,
                self._seconds + other._seconds,
                self._microseconds + other._microseconds
            )
        return NotImplemented 
    ```
    > **Note**: when a method/function returns `NotImplemented`, that means it doesn't want to through an Error because the other object might know how to handle that operation, So returning `NotImplemented` is a way to fallback on the other object to see if it knows how to handle the operation and if doesn't know how to handle it, it will eventually throw an error.

> **Note**: when you create an int,float,str ...etc object in python, what happens in the  background is that the class is called to create a new object as like any other python obj.

```python
n = 3
# same as
n = int(3)
# because python is a dynamically typed PL.
```

> **Note**: for more special methods : [python docs](https://docs.python.org/3/reference/datamodel.html#special-method-names)

### `__len__()`

another special method is `len()` and that uses `__len__()` in the background

```python
print(len('test'))
```
```python
print('test'.__len__())
```

> **Note**: there's a ton of methods that you can go over: so you can use these to customize how objects are compared, how to check for equality, but you can check out the documentation for more.


## property decorators

property decorators enhance properties (attributes) of an object in python by adding a layer of advanced functionality like getters, setters, deleters ...etc.

### setters and getters

- a real word problem that needs setters and getters to solve
    ```python
    class User:
        
        def __init__(self, first, last):
            self.first = first
            self.last = last
            self.email = f'{first}.{last}@company.com'

        def full_name(self):
            return f'{self.first} {self.last}'

    user = User('ramoun', 'python')        
    
    user.last = 'Ruby'
    
    print(user.first)
    print(user.email) # the email is not updated
    print(user.full_name())
    ```
    > **Note**: you can create an email method like the full_name() method but that will break the code for people using the class, they will have to go through and change each email attrib with email mehtod.

    > **Note**: in languages like java: the solution is very simple -> getters and setters.

- the solution 
    
    the use of property decorators allows us to define a method but we can access it as an attribute

### deleters

a deleter is used to run clean up code after a property is deleted

> **Tip**: be carefull when people are already using your class.

# Resources

> **Note**: an Employee example python file that applies all paradigms in this md file is @: [this link]( https://github.com/Ramoun-Training/computer_science_training/blob/master/computer/software/tools/programming_languages/general_purpose/python/the_lingo/basic/oop/examples/employee/employee.py#L1)

- [[1] corey's oop playlist](https://www.youtube.com/playlist?list=PL-osiE80TeTsqhIuOqKhwlXsIBIdSeYtc)
-  [[2] caleb python oop]()