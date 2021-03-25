while(True):
    add=input('Enter somthing to the list:')
    lis=['apples','thongs','good']
    lis.append(add)
    length=len(lis)
    for x in range(0,length):
        print('%s:%s'%(x,lis[x]))
