def add (num1,num2):
    total=num1+num2
    return total

w=eval(input('Width:'))
h=eval(input('Hight:'))
area=w*h
circum=2*add(w,h)

print('The Area=%s'%area)
print('The circumfurence=%s'%circum)
