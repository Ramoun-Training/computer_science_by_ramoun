from tkinter import *
import random

canvas=Canvas(width=400,height=400)
canvas.pack()

def random_rect(w,h):
    x1=random.randrange(w)
    y1=random.randrange(h)
    x2=random.randrange(w)
    y2=random.randrange(h)
    canvas.create_rectangle(x1,y1,x2,y2)
    

for x in range(0,1000):
    random_rect(200,400)
    
