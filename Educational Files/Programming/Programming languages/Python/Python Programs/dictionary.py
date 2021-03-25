'''
*each key is separated from its value by a colon(:)
*the items are seprated by commas
*the whole thing is enclosed in curly braces

To create an empty dictionary :
d={}

*keys are important in dictionary while values may not be
*the vlues of a dictionary can be of any type.
*the keys of a dictionary must be of an immutable type
 like:strings ,numbers or tuples.

d={'name':'zara','age'=15}
*to obtain a value u use its key:
d['name']>>> 'zara'
#######################################################
Updating a dictionary:
======================
you can update a dictionary by:
1-adding a new entry or key-value
2-deleting an existing entry
ex:
===
d['age']=8 #update existing entry
d['job']='engineer' #add new entry
#######################################################
Deleting dictionary elements:
=============================
del d['name'] #remove entry with key 'name'
d.clear()     #remove all entries in d
del d         #delete the entire dictionary
#######################################################
Properties of dictoinary keys:
==============================
Two important  points to remember about dictionary keys:
(a)more than one entry per key is not allowed.
   that means :no duplicate key is allowed.
   when duplicate keys encountered during assignment the last 
   assignment wins.

   ex:
   ===
   names={'name1':'jack','name1':'ramoun'}
   print(names['name1']) >>> ramoun

(b)keys are immutable which means that you can use 
   strings,numbers or tuples but lists are not allowed.
#######################################################
Functions:
==================

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Function        | Decription
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
cmp(dict1,dict2)|:compares elements of both dicts.
                |              
len(dict1)      |:gives the number of elements of 
                | dict1.
str(dict1)      |:returns a printable string  
                | representation of dict1.
type(var)       |:returns the type of the passed 
                | variable if the var is dictionary.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Method           | Description
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
dict.clear()     |:removes all elements of dict.
                 |
dict.copy()      |:returns a shallow copy of dict.
                 | 
dict.fromkeys()  |:create a new dictionary with keys  
                 | from seq and values set to value.
                 |
dict.get(key,    |:for key key returns a value or 
default=None)    | default if key not in dictionary.
                 |
dict.has_keys(   |:returns true if key in dictionary
key)             | dict,false otherwise.
                 | 
dict.items()     |:returns a list of dict's(key value)
                 | tuple pairs.
                 |
dict.update(di2) |:adds dictionary di2's key values to
                 | dict.
dict.keys()      |:returns a list of dictioary keys.
                 |
dict.setdefault( |:similar to get() but will set dict
key,default=None)| [key]=default if key is not alredy.
                 |
dict.values()    |:returns a list of dictioary values.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
'''
Best wishes R}am#un>