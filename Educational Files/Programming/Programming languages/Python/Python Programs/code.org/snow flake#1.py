import turtle
turtle.speed(10)
turtle.pensize(1)

def branch():
      turtle.penup()
      turtle.right(90)
      turtle.forward(100)
      turtle.pendown()
      for i in range(3):
          turtle.backward(25)
          turtle.right(45)
          turtle.forward(25)
          turtle.backward(25)
          turtle.left(45)
          turtle.forward(25)
          turtle.backward(25)
          turtle.left(45)
          turtle.forward(25)
          turtle.backward(25)
          turtle.right(45)
      turtle.backward(25)

for i in range(8):
    branch()
    turtle.right(360/8)
      

    

