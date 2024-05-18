'''
sets are "unordered" collections of "unique" elements
'''

s = set()
s.add(1)
s.add(2)
s.add(3)
s.add(3)

# trick to remove duplicates from a list
l = [1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9]
s = set(l)
l = list(s)
print(l) # [1, 2, 3, 4, 5, 6, 7, 8, 9]
