---
runme:
  id: 01HWTQTBA5GFA7G5898N719DK4
  version: v3
---

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
- __class variables__: are variables that are shared among all instances of a class (class variables should be the same for each instance). class variables can be accessed through objects too (and not only class name due to __method resolution order__).

## Class-Object Relationship

an object is an instance (like a copy) of a class.

![class_object_relationship](https://i.imgur.com/0dvVfUD.png)

## Creating Classes

- constructors/inititilizer

is a method called automatically whenever an object is created.[2]

`__init__()` is used to set attributes for newly created objects.[1]

```python {"id":"01HWTQTBA4PF4X3PC73RGGVA8E"}
class Employee:
    def __init__(self, first, last, pay):
        self.first = first
        self.last = last
        self.email = f'{first}.{last}@company.com'
        self.pay = pay
```

> __Note__: `__init__()` is a special method that python looks for when a class is created to execute code inside of it.[2]

> __Note__: if the `__init__()` is not found, then the original one defined by python in the _builtins_ is invoked.[2]

> __Tip__: `__init__()` should be as thin as possilble. Its soul purpose is to basically take passed-in args & assign them to the object.

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

```python {"id":"01HWTQTBA4PF4X3PC73V3WV237"}
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

We put the variable 'self' as parameter for any method that we create to enable it to work with individual objects.

```python {"id":"01HWTQTBA4PF4X3PC73X5JAPVN"}
emp1.fullname()
# is the same as
Employee.fullname(emp1) # actually that's what happens in the bg when `emp1.fullname()` is executed
```

> **Note**: the `self` is always implicit, you never have to pass anything for that.

> **Note**: python is more dynamic language than c# or Java, because you can add attributes and methods(that works differently) on the fly (like JS). but it's recommended to not do that.

> __Note__: It's considered best practice to put any data that you expect an object to have inside the `__init__()` method.

## Creating Instances (objects)

- creating a dummy class

```python {"id":"01HWTQTBA4PF4X3PC73YBCPF8X"}
class Employee:
    pass
```

- creating an instance of the class

```python {"id":"01HWTQTBA4PF4X3PC741CRFXSG"}
emp1 = Employee()
```

- creating an instance variable

```python {"id":"01HWTQTBA4PF4X3PC743YJRWZ9"}
emp1.name = 'ramoun'
```

## Class variables

> **Note**: when you try to access an attribute on an instance, it will first check if the instance contains that attribute and if it doesn't it will see if the class or any class that it inherits from contains that attribute.

> use `dir` to get the name space of an object or a class
> that helps in checking what are the class methods and what are the instance methods

```python {"id":"01HWTQTBA4PF4X3PC744TDFZW1"}
print(obj.__dir__) # dir(obj) will do too
print(cls.__dir__)
```

```python {"id":"01HWTSDBKQACEAKFEV4Z6QP9V2"}
class Employee:
    def __init__(self, name, pay) -> None:
        self.name = name
        self.pay = pay

emp1 = Employee('soso', 4000)

print(dir(emp1))
print(dir(Employee)) # notice that name and pay are not in the list

print(emp1.name) #=> 'soso'
# print(Employee.name) #=> AttributeError: type object 'Employee' has no attribute 'name'

# define a new class variable
Employee.age = 22

print(Employee.age) #=> 22
print(emp1.age) #=> 22 Note: the object inherits the 'age' property from the class automatically
```

- updating a class variable

```python {"id":"01HWTQTBA4PF4X3PC7454NJYR7"}
# adding a new property (aka: class variable) to the Employee class
Employee.raise_amount = 1.05

print(emp1.raise_amount) #=> 1.05
# here the emp1 will inherit the new `raise_amount` from class without he need to assign it to the object manually
```

- updating an instance variable

```python {"id":"01HWTQTBA4PF4X3PC745F4TQ1Q"}
emp1.raise_amount = 1.08
# this assignment created the raise_amount attribute within emp1 (overriding the class attribute)
```

## methods

python got multiple types of methods

- regular methods

   they take the instance as their first argument by default (automatically).

   > **Note**: if an object is passed to a method in python, then this method can apply multiple changes to that object (it can Create/Edit/Remove/Access the object's properties and methods).

   ![regualr methods](https://i.imgur.com/k0O5i9Q.png)

- class methods

methods that take classes as their first args by default (automatically).

```python {"id":"01HWTQTBA4PF4X3PC746FHNSZP"}
# it is as easy as adding a decorator(you have to research that or search for inside of the repo) to the method
@classmethod
def method(cls):
    pass
```

- static methods

methods that don't take anything as their first args by default (automatically). They behave like ordinary functions. We include them in classes because they have some logical connection with a class but it doesn't actually depend on any specific instance or class varaible.

static methods are invoked on the class itself.

```python {"id":"01HWTQTBA4PF4X3PC749JBKKTP"}
@staticmethod
def is_workday(day):
    if day.weekday() == 5 or day.weekday() == 6:
        return True

    return False
```

> **Tip**: to know if the method is a static method and not a regular method or a class method (check for 'cls' & 'self' within your function because if you don't access the instance or the class anywhere within the function, then you need to convert the function to a static method).

> **Warn**: Be aware that in other languages (`static` is used to refer to `classmethod`s)

- other

```python {"id":"01HWTQTBA4PF4X3PC74C1G51K8"}
def method():
    return 'method'
```

## Inheritance (subclassing)

inheritance allows us to inherit (copy) attributes and methods from a parent class.

```python {"id":"01HWTQTBA4PF4X3PC74CD31224"}
class A:
    def __init__(self, name):
        self.name = name
class B(A): # this allows B to inherit all of A methods and properties
    def __init__(self):
        A.__init__(self) # this will call the __init__ method of the A class
    pass

b = B('ramoun')
print(b.name)
```

### How it works (Method Resolution Order)

1. when an object is instanciated, python looks in the class for the `__init__`().
2. if doesn't find it, it walks up the chain of inheritance until it finds what it is looking for.

> __Note__: that chain of inheritance is called _method resolution order_.

```python {"id":"01HWTQTBA4PF4X3PC74G8FKBR7"}
# more in depth look
print(help(B))
'''ouput
class B(A)
| method resolution order
|    B
|    A
|    builtins.objects # the last place to look inside and every class in python inherits from this base object class
'''
```

if used correctly, subclassing can help us reuse our code nicely.

> **Tip**: python has builtin functions that can help us with inheritance and oop in general like `isinstance()` & `issubclass()`

```python {"id":"01HWTTMS1EZSHQG4Q316DBTT19"}
class X:
  pass
class Y(X):
  pass

y = Y() # python will crawl that tree (from Y to X to builtins.object) until it finds an `__init__`

print(isinstance(y, Y)) #=> True
print(issubclass(Y, X)) #=> True
```

## Special (Magic/dunder) Methods

special methods are methods that already exist (whenever you create a new class it inherits those methods from the `builtins.object` class) and we can override to perform specific tasks .They also allow us to emulate some built-in behavior within python and it is also how we implement operator over-loading.

- Examples of Operator overloading
- adding 2 strings together

```python {"id":"01HWTQTBA4PF4X3PC74JKQTQDS"}
print('hi' + ' Guys') # 'hi Guys'
```

- addding 2 ints together

```python {"id":"01HWTQTBA4PF4X3PC74K4N0KMZ"}
print(3 + 2) # 5
```

**Note**: although we are using the same operator we get different results (computational, concatenation) depending on objects passed.

- Example of paramater overloading
- printing an integer object

```python {"id":"01HWTQTBA4PF4X3PC74PG5W7QC"}
x = 3
print(x) # 3
```

- printing an employee object

```python {"id":"01HWTQTBA4PF4X3PC74S8TCV4H"}
emp = Employee()
print(emp) # <__main__.Employee object at 0x232312123>
```

> **Note**: using special methods, we can change some of these built-in behaviour and operations.

### why use the dunder (`__`)?

1. to distinguish the method from other methods in the class (i.e: telling python, this is the special method that you're looking for).
2. dunder methods can't be called by objects (they are like private methods in other languages that are only called by the class itself).

> __Note__: `cls.__init__(obj)`, `obj.__init__()` works.

### `__repr__`

`__repr__()` is implicitly called whenever we call `repr()` on our objects or `print()`.

> __Note__: `__repr__()` is meant to be an unambiguous representation of the object and it should be used for debugging and logging...etc. It's really meant to be seen by other developers.

### `__str__`

`__str__()` is implicitly called whenever we call `str()` on our objects (whenever you try to convert an object to a string).

we override the `__str__()` because sometimes we need to know the data itself instead fo knowing the address of the data.

> __Note__: `__str__()` is meant to be more of a readable representation of the object and it's meant to be used as a display for the **end-user**. And this is the difference between `__str__()` and `__repr__()`

> __Tip__: you first wanna make sure to at least have an `__repr__()` in your class because if you only have `__repr__()` and don't have a `__str__()`. Then calling `str()` on an object will just use `__repr__()` as a fall back. So it's good to have `__repr__()` as a minimum.

> __Note__: when you try to `print()` an object, it is going to automatically invoke the `__str__()` method and if doesn't find it will look for it in the parent class and if still doesn't find it it will try to use the `__repr__()` of the class itself, and if it doesn't find it will follow the same chain in-order (HEADACHE).

> __Note__: anytime you override the `__str__()`, you need to return a string. isn't that obvious??

> **Tip**: a good rule of thumb is to try to place something that you could copy and paste back to your python code that would recreate that same object.

### special arithmetic methods (and operators overloading)

- the plus operator (+)

when you add 2 ints together `print(2+2)`, what happens in the background is that it's using a special method in the background called `__add__()` and you can access it directly using the `int.__add__(1,2)` and it will give you the same result.

```python {"id":"01HWTQTBA5GFA7G58985HV814R"}
print(2 + 3)
```

```python {"id":"01HWTQTBA5GFA7G58986WAW9SV"}
print(int.__add__(2, 3))
```

- the concatenation operator (+)

when you add 2 strs together `print('a'+'b')`, what happens in the background is that it's using a special method in the background called `__add__()` and you can access it directly using the `str.__add__('a','b')` and it will give you the same result.

```python {"id":"01HWTQTBA5GFA7G58988WP9HM6"}
print('a' + 'b')
```

```python {"id":"01HWTQTBA5GFA7G5898C50ZV5B"}
print(str.__add__('a', 'b'))
```

- real world example (datetime)
   in the datetime module we have a `__add__()`

```python {"id":"01HWTQTBA5GFA7G5898D4VAWYC"}
def __add__(self, other):
    if isinstance(other, timedelta):
        return timedelta(
            self._days + other._days,
            self._seconds + other._seconds,
            self._microseconds + other._microseconds
        )
    return NotImplemented # read note below 
```

> **Note**: when a method/function returns `NotImplemented`, that means it doesn't want to through an Error because the other object might know how to handle that operation, So returning `NotImplemented` is a way to fallback on the other object to see if it knows how to handle the operation and if doesn't know how to handle it, it will eventually throw an error.

> **Note**: when you create an `int`, `float`, `str` ...etc object in python, what happens in the  background is that the class is called to create a new object as like any other python obj.

```python {"id":"01HWTQTBA5GFA7G5898E7EJGTK"}
n = 3
# same as
n = int(3) # instantiating `class int`
# because python is a dynamically typed PL.
```

> **Note**: for more special methods : [python docs](https://docs.python.org/3/reference/datamodel.html#special-method-names)

### `__len__()`

another special method is `len()` and that uses `__len__()` in the background

```python {"id":"01HWTQTBA5GFA7G5898GD1E7ET"}
print(len('test'))
```

```python {"id":"01HWTQTBA5GFA7G5898K51GDTS"}
print('test'.__len__())
```

> **Note**: there's a ton of methods that you can go over: so you can use these to customize how objects are compared, how to check for equality, ..etc. You can check out the documentation for more.

## property decorators

property decorators enhance properties (attributes) of an object in python by adding a layer of advanced functionality like getters, setters, deleters ...etc.

### setters and getters

- a real world problem that needs setters and getters to solve

```python {"id":"01HWTQTBA5GFA7G5898MFHYTT4"}
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

> __Note__: you can create an email method like the full_name() method but that will break the code for people using the class, they will have to go through and change each email attrib with email mehtod.

> **Note**: in languages like java: the solution is very simple -> getters and setters.

- the solution

   the use of property decorators allows us to define a method but we can access it as an attribute

### deleters

a deleter is used to run clean up code after a property is deleted

> **Tip**: be carefull when people are already using your class.

# Resources

> __Note__: an Employee example python file that applies all paradigms in this md file is @: [this link](https://github.com/Ramoun-Training/computer_science_training/blob/master/computer/software/tools/programming_languages/general_purpose/python/the_lingo/basic/oop/examples/employee/employee.py#L1)

- [[1] corey's oop playlist](https://www.youtube.com/playlist?list=PL-osiE80TeTsqhIuOqKhwlXsIBIdSeYtc)
- [[2] caleb python oop]()