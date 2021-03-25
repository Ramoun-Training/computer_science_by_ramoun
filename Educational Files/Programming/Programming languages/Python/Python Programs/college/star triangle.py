lev=int(input('Enter the levels: '))
sum='*'
raw1=' '*(lev)+"*"
print(raw1)
for i in range(1,lev):
    sum=sum+'**'
    full=" "*((lev)-i)+sum
    
    print(full)
