asort= [
        {'name': 'apple', 'price': 2.49},
        {'name': 'orange', 'price': 23.90},
        {'name': 'banana', 'price': 3.49},
]


def search(listy):
...     for i in listy:
...             if i['name'] == 'apple':
...                     return i['price']
...
>>> search(asort)
2.49

# better way

fruits = {
...     'apple': {'price': 2.49},
...     'orange': {'price': 23.90},
...     'banana': {'price': 3.49}
... }
>>>
>>> fruits
{'apple': {'price': 2.49}, 'orange': {'price': 23.9}, 'banana': {'price': 3.49}}
>>> fruits['apple']
{'price': 2.49}

