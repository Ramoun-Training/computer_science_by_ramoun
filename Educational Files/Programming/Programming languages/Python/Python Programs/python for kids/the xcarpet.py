import turtle
t=turtle

def square (r,g,b,size,color):
    t.color(r,g,b)
    if color==True:
        t.begin_fill()
    for x in range(0,4):
        t.left(90)
        t.forward(size)
    if color==True:
        t.end_fill()
	
for y in range(0,4):
    if y%2==0:
        square(0.3,0.4,0.5,125,True)
        square(0.5,0.4,0.3,100,True)
        square(0.4,0.5,0.3,75,True)
        square(0.9,0.75,0,50,True)
        square(0.9,0.5,0.15,25,True)
    else:
##        square(0.9,0,0.3,125,False)
##        square(0.5,0,0.5,100,False)
##        square(0.2,0,0.5,75,False)
##        square(0,0.4,0.7,50,False)
##        square(0,0.6,0.2,25,False)
            square(0.3,0.4,0.5,125,False)
            square(0.5,0.4,0.3,100,False)
            square(0.4,0.5,0.3,75,False)
            square(0.9,0.75,0,50,False)
            square(0.9,0.5,0.15,25,False)
    
    t.left(90)
