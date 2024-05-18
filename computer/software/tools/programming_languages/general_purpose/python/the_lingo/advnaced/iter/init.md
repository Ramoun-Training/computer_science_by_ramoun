---
runme:
  id: 01HWSZC4DC8KV06GQRT9V6J8DF
  version: v3
---

# Iterables & Iterators

## Iterables

on a higher level, an iterable is something that can be looped over (e.g lists).

### How can we tell if something is iterable (can be looped over)?

1. it needs to have a special method named `__iter__()` (dunder, magic, special method)

```python {"id":"01HWSZKCBJF4JQ37A5SW8H9PB9"}
nums = [1,2,3]
print(dir(nums)) # prints all the methods that can be used with the list object
print('__iter__' in dir(nums)) # prints True if the __iter__ method is in the list of methods that can be used with the list object
# print(help(nums.__iter__)) # prints the help for the __iter__ method
```

> __Note__: in a `for` loop what happens is: the for loop calls the function `__iter__()` on our object returning an iterator that we can loop over.

## Iterators

an iterator is an object with a state that remembers where it is during an iteration. Iterators also know how to get their **next** value.

### How can we tell if something is an iterator?

1. an iterator must have a `__next__()` method to get the next value.

> __Note__: iterators are also iterables but their `__iter__()` method returns `self` instead of generating a new iterable.

## Resources

to know more about generators, iterators, and iterables:

- [ritvikmath - youtube](https://www.youtube.com/watch?v=j4l2FKEvbHY&ab_channel=ritvikmath)
- [pythonist - youtube](https://www.youtube.com/watch?v=Zt2P4yf8Nks&ab_channel=Pythonist)
- [realpython - youtube](https://www.youtube.com/watch?v=L4v9gKC7QxY&ab_channel=RealPython)
- [programiz - youtube](https://www.youtube.com/watch?v=C_rhipZonok&ab_channel=Programiz)
- [coreyshafer - youtube](https://www.youtube.com/watch?v=C3Z9lJXI6Qw&ab_channel=CoreySchafer)
- [datadaft - youtube](https://www.youtube.com/watch?v=QmcpDSFzsAA&ab_channel=DataDaft)
- [arjancodes - youtube](https://www.youtube.com/watch?v=CvQ7e6yUtnw&ab_channel=ArjanCodes)
- [arjancodes - youtube](https://www.youtube.com/watch?v=aumxFs2DO5o&ab_channel=ArjanCodes)
- [youtube search - generators](https://www.youtube.com/results?search_query=iterators+and+generators+in+python)
- []()