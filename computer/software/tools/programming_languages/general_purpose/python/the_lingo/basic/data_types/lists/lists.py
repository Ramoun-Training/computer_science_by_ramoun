# lists are mutable
lista = [1, 2, 3, 4, 5]
print(lista)

lista[0] = 6
print(lista)

# append vs extend
# lista.append([1,2,3]) # [6, 2, 3, 4, 5, [1, 2, 3]]
lista.extend([1, 2, 3]) # [6, 2, 3, 4, 5, 1, 2, 3]

###
###
## Problem 2 ##
# Given this nested List:

l = [3,7, [1,4, 'hello']]

# Reassign "hello" to be "goodbye"
l[2][2] = 'goodbye'
