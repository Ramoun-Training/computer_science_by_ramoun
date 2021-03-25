import turtle
##print('\t\tprogram to draw shape inside shape')
##
##length=eval(input('Enter the Length: '))
##sides=int(input('Enter the number of sides of the shape: '))
##color=input('Enter the color of the shape: ')
##
##    
##for steps in range(sides):
##    turtle.color(color)
##    turtle.forward(length)
##    turtle.left(360/sides)
##    for steps in range (sides):
##        turtle.color(color)
##        turtle.forward(length/2)
##        turtle.left(360/sides)

turtle.speed(10)
print("\t\tCreating Snow Flakes")
length=eval(input("Enter the length: "))
sides=int(input('Enter number of sides: '))
shapes=int(input('Enter number of shapes: '))
color=input('Enter color: ')

turtle.speed(1000)
for steps in range(shapes):
    for steps in range(sides):
        turtle.forward(length)
        turtle.right(360/sides)
    turtle.right(360/shapes)
        

