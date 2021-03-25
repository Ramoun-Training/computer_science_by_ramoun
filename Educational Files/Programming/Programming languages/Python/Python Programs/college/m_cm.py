a=eval(input('Enter:'))
b='centimeter'
if a>0 and a<100 and a!=1:
    print( str(a),b+"s")
elif a>100:
    a=a/100
    b='meter'
    print (a,b+"s")
elif a==100:
    a=a/100
    b='meter'
    print (a,b)
elif a==1:
    print (a,b)
else:
    print("Sorry,Enter +ve numbers only")
