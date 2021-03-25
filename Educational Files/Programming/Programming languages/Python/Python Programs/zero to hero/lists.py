for x in range(5):
    print(x)

i=0
while i<5:
    print(i)
    i+=1

wes=['sports','banks','red']
ococ=len(wes)
i=0
while i<ococ:
    print(wes[i])
    i=i+1

colors=[]
num=eval(input('Please Enter number\
of items: '))
for numitems in range(1,num+1):
      item1=input('Please,Enter the num %s\
 item: '%numitems)
      colors.append(item1)

colors.sort()
print(colors)

colors=[]
num=eval(input('Please,Enter number of \
items: '))
counter=1
while counter<=num:
    item=input('Enter item number %s: '%counter)
    colors.append(item)
    counter+=1
colors.sort()
for steps in colors:
    print(steps)



