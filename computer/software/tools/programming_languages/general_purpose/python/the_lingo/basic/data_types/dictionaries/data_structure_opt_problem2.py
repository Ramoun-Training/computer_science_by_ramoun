>>> stock = {
...   "Apples": 15,
...   "Banana": 20,
...   "Cherries": 19,
...   "Strawberries": 10,
... }
>>> price = {
...   "Apples": 4.99,
...   "Banana": 2.99,
...   "Cherries": 3.99,
...   "Strawberries": 6.99,
... }
>>> for stock_key, stock_value in stock.items():
...     for price_key, price_value in stock.items():
...             if stock_key == price_key:
...                     print(stock_key + ": ", stock_value*price_value)
... 
Apples:  225
Banana:  400
Cherries:  361
Strawberries:  100
>>> 15*5
75
>>> stock = {}
>>> stock = {
...     "Apples": {"number": 15, "price": 4.99},
...     "Banana": {"number": 20, "price": 2.99},
...     "Cherries": {"number": 19, "price": 3.99},
...     "Strawberries": {"number": 10, "price": 6.99}
... }
>>> stock
{'Apples': {'number': 15, 'price': 4.99}, 'Banana': {'number': 20, 'price': 2.99}, 'Cherries': {'number': 19, 'price': 3.99}, 'Strawberries': {'number': 10, 'price': 6.99}}
>>> for k,v in stock.items():
...     print(k, v)
... 
Apples {'number': 15, 'price': 4.99}
Banana {'number': 20, 'price': 2.99}
Cherries {'number': 19, 'price': 3.99}
Strawberries {'number': 10, 'price': 6.99}
>>> stock['Apples']
{'number': 15, 'price': 4.99}
>>> stock['Apples']['number'] * stock['Apples']['price']
74.85000000000001
>>> stock.keys()
dict_keys(['Apples', 'Banana', 'Cherries', 'Strawberries'])
>>> [k for k in stock.keys()]
['Apples', 'Banana', 'Cherries', 'Strawberries']
>>> for k in stock.keys():
...     print(k, ": " + stock[k]['number'] * stock[k]['price'])
... 
Traceback (most recent call last):
  File "<stdin>", line 2, in <module>
TypeError: can only concatenate str (not "float") to str
>>> for k in stock.keys():
...     print(k, ": " + float(stock[k]['number'] * stock[k]['price']))
... 
Traceback (most recent call last):
  File "<stdin>", line 2, in <module>
TypeError: can only concatenate str (not "float") to str
>>> for k in stock.keys():
...     print(k, ": " + str(stock[k]['number'] * stock[k]['price']))
... 
Apples : 74.85000000000001
Banana : 59.800000000000004
Cherries : 75.81
Strawberries : 69.9
