import turtle
from turtle import *


i=0
p=0


def line_and_angle(x,y) :
    forward(x)
    left(y)


color('black' , 'red')
begin_fill()
while i<4:
    line_and_angle(100,90)
    i=i+1
end_fill()

penup()
goto(0,100)
pendown()

color('black' , 'yellow')
begin_fill()
while p<3:
    line_and_angle(100,120)
    p=p+1
end_fill()
