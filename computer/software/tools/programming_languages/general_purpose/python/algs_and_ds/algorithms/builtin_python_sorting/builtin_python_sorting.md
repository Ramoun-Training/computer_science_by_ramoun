# built-in sorting in python

## sorting lists

### Ascending Order

- `sorted`

    returns a sorted copy of the list but doesn't affect the list itself.

    ```python
    l = [9,1,2,4,6,7,8]
    sorted_l = sorted(l)
    
    print(l)
    print(sorted_l)
    ```

- `.sort()`

    sorts the list itself and returns `None`.

    ```python
    l = [9,1,2,4,6,7,8]
    
    print(l)
    l.sort()
    print(l)
    ```

### Descending Order

- `sorted()`

    ```python
    sorted_l = sorted(l, reverse=True)
    ```

- `sort()`

    ```python
    l.sort(reverse=True)
    ```

> **Tip**: better use the `sorted` method because it works on any iterable vs the `sort()` method that only works on specific data structures.

## sorting tuples

### Ascending Order

- `sorted`

    returns a sorted copy of the tuple but doesn't affect the tuple itself.

    ```python
    t = (9,1,2,4,6,7,8)
    sorted_t = sorted(t)
    
    print(t)
    print(sorted_t)
    ```

- `.sort()`

    tuples has no `.sort()` method.

### Descending Order

- `sorted()`

    ```python
    sorted_t = sorted(t, reverse=True)
    ```

## sorting dictionaries

### Ascending Order

- `sorted`

    returns a sorted copy of the dictionary but doesn't affect the dictionary itself. It sorts only the keys.

    ```python
    d = {'name': 'ramoun', age: 22}
    sorted_d = sorted(d)
    
    print(d)
    print(sorted_d)
    ```

- `.sort()`

    dictionaries has no `.sort()` method.

### Descending Order

- `sorted()`

    ```python
    sorted_d = sorted(d, reverse=True)
    ```

## sorting objects based on criteria

### `sorted` keys

```python
l = [-5,-2,-1,1,2,3]
sorted_l = sorted(l, key=abs)
# output: [-1,1,-2,2,3,-5]
```

### programming example

```python
class Employee:
    def __init__(self, name, age, salary):
        self.name = name
        self.age = age
        self.salary = salary

    def __repr__(self):
        return f'{self.name}, {self.age}, ${self.salary}'

emp1 = Employee('ramoun', 23, 5000)        
emp2 = Employee('steve', 28, 4000)        
emp3 = Employee('micke', 33, 8000)        

employees = [emp1, emp2, emp3]

sorted_employees = sorted(employees) # sorting objects without providing the sorting creteria is not possible in python

print(sorted_employees)
# output: TypeError: '<' not supported between instances of 'Employee' and 'Employee'
```

```python
# custom sorting function for the Employee objs
# better use functions for complex sorting for objects
def sort_emps_name(emp):
    return emp.name
def sort_emps_age(emp):
    return emp.age
def sort_emps_salary(emp):
    return emp.salary


sorted_employees = sorted(employees, key=sort_emps_name)
print(sorted_employees)

# use lambda functions for easy tasks
sorted_employees = sorted(employees, key=lambda x:x.age)
print(sorted_employees)

sorted_employees = sorted(employees, key=sort_emps_salary, reverse=True)
print(sorted_employees)
```

```python
# when working with operators of objects, it is better use the operator module
from operator import attrgetter
sorted_employees = sorted(employees, key=attrgetter('name'))
print(sorted_employees)
```

> **Note**: for simple tasks its better use things like attrgetter. but for complex stuff use the other 2 ways.

# Refrences
[1] corey (https://www.youtube.com/watch?v=D3JvDWO-BY4&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=19)