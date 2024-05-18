'''
tuples are immutable
'''
l = [1,2,3,4,5]

for i in l:
    print(i)

# c-code
# for (int counter=0; counter<l.length; counter++){
    # i = l[counter];
    # // code goes here =>> print(i) ..etc
# }

i = l[0]
i = l[1]
i = l[2]
#...


# tuples, lists, sets, dicts

lt = [(1,2),(3,4),(5,6)]

# method #1
for i in lt:
    print(i)

# c-code
# for (int counter=0; counter<lt.length; counter++){
    # i = lt[counter];
    # // code goes here =>> print(i) ..etc
# }

i = lt[0]    # (1,2)
i = lt[1]    # (3,4)
i = lt[2]    # (5,6)

# methond #2
for i,j in lt:
    print(i,j)

# c-code
# for (int counter=0; counter<l.length; counter++){
    # for (int counter2=0; counter2<lt[0].length; counter2++)
    #   i = l[counter][counter2];
    #   j = l[counter][counter2+2]
    #   // code goes here =>> print(i,j) ..etc
    #}
# }    

i = lt[0][0] # 1
j = lt[0][1] # 2

i,j = lt[0] # NOTE: variable unpacking
# ...

# NOTE: 
x = (3)  # <class 'int'>
x = (3.) # <class 'float'>
x = (3,) # <class 'tuple'>


