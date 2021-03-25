'''
to create a tuple with single value ,you have to include
a comma even though there is only one value.

tup1=(50,)
*slicing a tuple is just like slicing a list.
*tuples are immutable so u can't change them ,update them
 or add elements to them though u can do a trick to
 add new elements to tuples like:concatenation
 and repition
 *u can't delete or remove an element of a tuple
  but u can delete the whole tuple.
 *
#######################################################
Basic tuples operations:
======================
tuples respond to all of the general sequence operations
we used on strings in the string part.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Python expression|   Results   | Describtion
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
len(1,2,3)       |      3      | length of tuple
                 |             |
(1,2)+(3,4)      |  [1,2,3,4]  | concatenation
                 |             |
('HI')*2         | ['HI','HI'] | repetition
                 |             |        
2 in (1,2,3)     |    True     | membership
                 |             |   
for x in (1,2):  |      1      | iteration
	print(x)     |      2      | 
	             |             |
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

#######################################################
Indexing,slicing and matrixes:
==============================
assuning the following tuple:
l=('python','we','care')
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Python expression|   Results   | Descibtion
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
l[2]             |    care     | index position
                 |             |
l[-2]            |     we      | negative count 
                 |             | from the right
                 |			   |
l[1:]            |['we','care']| slicing from the 
                 |             | second element to
                 |             | the last element
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

#######################################################
Functions:
==================

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Function        | Decription
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
cmp(tuple1,     |:compares elements of both tuples.
tuple2)         |              
len(tuple1)     |:gives the number of elements of 
                | tuple1.
max(tuple1)     |:returns the item of the tuple of 
                | max value.
min(tuple1)     |:returns the item of the tuple of 
                | min value.
tuple(seq)      |:converts a list to a tuple.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
'''
#Remember:
#c=2,x=3 >>> raises exception
#c,x=2,3 >>> is the right way

Best wishes R}am#un>