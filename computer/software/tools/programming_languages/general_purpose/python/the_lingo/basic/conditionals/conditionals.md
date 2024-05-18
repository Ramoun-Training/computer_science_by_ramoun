---
runme:
  id: 01HWRD2Q3SCGS8YJJS10NNVH8F
  version: v3
---

# conditionals

a conditional statement is a statement where you check againist a condition to execute a certain piece of code.

## Comparison Operators

`>`
`<`
`>=`
`<=`
`==`
`!=`

## Logical Operators

- `(33 > 11) and (12 > 10)`
- `(33 > 11) or (12 > 10)`
- `not True`

## For loops

```python {"id":"01HWRDWCSFS43J2B7P3DGM9N0X"}
for key in {'key1': 33, 'key2': 44, 'key3': 55}:
    print(key)
```

```python {"id":"01HWRDYETDD2Q6H9DBRFZ6S2J8"}
for value in {'key1': 33, 'key2': 44}.values():
    print(value)
```

```python {"id":"01HWRDZ944NGKKFEFNB6PYVKAJ"}
for k,v in {'key1': 33, 'key2': 44}.items():
    print(k,v)
```

```python {"id":"01HWRE3AH6Y2HPQTS79YCT3A8Z"}
# tuple unpacking
for (t1, t2) in [(1, 2), (3, 4), (5, 6)]: # the parentheses are optional
    print(t1, t2)
```

# In operator

```python {"id":"01HWRF0BGH7ZTHNPDDW0N72WDB"}
print('x' in 'xyz')
print('x' in ['x', 'y', 'z'])
```

## lambdas

```python {"id":"01HWRF2VDJTDE3TJ8MYGAYWSN5"}
evens = [x for x in range(10) if x % 2 == 0]
evens2 = filter(lambda x: x % 2 == 0, range(10))

print(evens)
print(evens2)
```

# refrences

- [London App Academy](https://www.youtube.com/watch?v=yF6tR9uuOJQ&list=PL8GFhcuc_fW7cbKJuVkRMATVD-Fd4gcrd&index=4)
