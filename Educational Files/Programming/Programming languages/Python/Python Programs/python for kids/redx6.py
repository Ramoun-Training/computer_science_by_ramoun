import turtle
import time

redx6=turtle
redx6.reset()

#drawing the body of the car
redx6.color(1,1,0)
redx6.begin_fill()
redx6.forward(100)
redx6.left(90)
redx6.forward(20)
redx6.left(90)
redx6.forward(20)
redx6.right(90)
redx6.forward(20)
redx6.left(90)
redx6.forward(60)
redx6.left(90)
redx6.forward(20)
redx6.right(90)
redx6.forward(20)
redx6.left(90)
redx6.forward(20)
redx6.end_fill()

#drawing the first wheel
redx6.color(0,0,0)
redx6.up()
redx6.left(90)
redx6.forward(10)
redx6.right(90)
redx6.down()
redx6.begin_fill()
redx6.circle(10)
redx6.end_fill()

#drawing the second wheel
redx6.setheading(0)
redx6.up()
redx6.forward(70)
redx6.right(90)
redx6.forward(10)
redx6.setheading(0)
redx6.begin_fill()
redx6.down()
redx6.circle(10)
redx6.end_fill()
