x = 'hi'
y = 'hi'

print(x == y)
print(id(x))
print(id(y))
print(id(x) == id(y))

#####
# PART 6: EXERCISE REVIEW
###
# Time to review all the basic data types we learned! This should be a
# relatively straight-forward and quick assignment.

## Problem 1 ##
####.
# Given the string:
S = 'django'
# Use indexing to print out the following:

# Use indexing to print out the following:
# 'd'
print(S[0])

# 'o'
print(S[-1])

# 'djan"
print(S[:4])

# 'jan'
print(S[1:4])

# go
print(S[-2:])

# Bonus: Use indexing to reverse the string
print(S[::-1])


name = 'soso'
word = 'love'

print('i love {name} and she is {word}'.format(name=name, word=word))
