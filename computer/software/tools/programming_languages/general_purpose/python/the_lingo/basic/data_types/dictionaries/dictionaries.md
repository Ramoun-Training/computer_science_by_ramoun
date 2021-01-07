# dictionaries

## good tip

asort= [
    {'name': 'apple', 'price': 2.49},
    {'name': 'orange', 'price': 23.90},
    {'name': 'banana', 'price': 3.49},
]

Q) How to create the function that search the fruit and return the price. For example: client write input "apple" and function returns "2.49".

A- For this you would need to loop through the array and check if item['name'] == 'apple'... This would be quite inefficient because if you have 1,000 items and the one you need happens to be at index 999, you need to loop through each item to find the right one.

A more efficient approach would be to have a flat dictionary and use the name as the key... So:

{'apple': {'price': 2.49}, 'banana': {'price': 3.00}}

Then you can locate apple using: apple = fruits['apple']

> **Note**: how choosing the best fit data structuer for your data can save you alot.

> **Note**: a very good way to set a default value for a dict.(fall back)

```python
coco_fruit = fruit.get("coco", 0)
print(coco_fruit) # prints 0
```
