'''
list=['computer','science',1998,2001]
list1=['a','v','c']
list2=[1,9,0,12.4]
list3=['we',1990]

print(list1[1])>>>>v
print(list2[1:6])>>>[9,0,12.4]
list[2]=2050
print(list[2])>>>>2050
#######################################################
Deleting list elements:
=======================

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 Method(function) | Describtion
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 del()            |:delets a list or list elements
                  | if you know exactly which ele-
                  | ments you are deleting.
 remove(obj)      |:removes (one)obj from list.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

#######################################################
Basic list operations:
======================
lists respond to all of the general sequence operations
we used on strings in the prior chapter.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Python expression|   Results   | Describtion
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
len([1,2,3])     |      3      | length of list
                 |             |
[1,2]+[3,4]      |  [1,2,3,4]  | concatenation
                 |             |
['HI']*2         | ['HI','HI'] | repetition
                 |             |        
2 in [1,2,3]     |    True     | membership
                 |             |   
for x in [1,2]:  |      1      | iteration
	print(x)     |      2      | 
	             |             |
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

#######################################################
Indexing,slicing and matrixes:
==============================
assuning the following list:
l=['python','we','care']
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
cmp(list1,list2)|:compares elements of both lists.
                |              
len(list1)      |:gives the number of elements of 
                | list1.
max(list1)      |:returns the item of the list of 
                | max value.
min(list1)      |:returns the item of the list of 
                | min value.
list(seq)       |:converts a tuple to a list.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Method           | Description
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
list.append(obj) |:appends object obj to list.
                 |
list.count(obj)  |:returns count of how many times
                 | obj occurs in list.
list.extend(seq) |:appends the contents of seq to 
                 | list.
list.index(obj)  |:returns the lowest index in list
                 | that obj appears.
list.insert(     |:inserts object obj into list at 
index,obj)       | offset index.
                 | 
list.pop(        |:removes and returns last object
obj=list[-1])    | obj from list.
                 |
list.remove(obj) |:removes obj from list
                 |
list.reverse()   |:reverses objects of list in place
                 |
list.sort([func])|:sort objects of lists alphabetical,
                 | use compare func if given
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
'''
#the append method changes the given list in-out side
#the function.

#the reassignment of a list in-side a function doesnt affect
#the original list if it was created outside the func.

Best wishes R}am#un>