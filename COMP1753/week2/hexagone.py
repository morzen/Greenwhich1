from turtle import *

i=0
o=0

def line_and_angle(x,y) :
    forward(x)
    left(y)

color("orange")
begin_fill()
while o<6:
    line_and_angle(120,60)
    o=o+1
end_fill()


penup()
goto (10,19)
pendown()

color("green")
begin_fill()
while i<6:
    line_and_angle(100,60)
    i=i+1
end_fill()
