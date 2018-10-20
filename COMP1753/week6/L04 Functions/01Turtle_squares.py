from turtle import *

i=0
j=0
k=0
l=0

def line_and_angle(x,y) :
    forward(x)
    left(y)

while i<4:
    line_and_angle(100,90)
    i=i+1

penup()
goto(-25,-25)
pendown()

while j<4:
    line_and_angle(150,90)
    j=j+1

penup()
goto(-50,-50)
pendown()

while k<4:
    line_and_angle(200,90)
    k=k+1

penup()
goto(-75,-75)
pendown()
while l<4:
    line_and_angle(250,90)
    l=l+1
    

print()
input("Press return to continue ...")
