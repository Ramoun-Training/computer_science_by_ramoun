import turtle

length=eval(input('Enter the length: '))
angle=eval(input('Enter the angle: '))
color=input('Enter the color: ')
repeat=int(input('Enter the number of \
steps to repeat\n("0"=no repeat): '))
turtle.speed(50)
for steps in range (repeat):
    turtle.color(color)
    turtle.forward(length)
    turtle.right(angle)
    for steps in range(repeat):
        turtle.color(color)
        turtle.forward(length/2)
        turtle.right(angle)
