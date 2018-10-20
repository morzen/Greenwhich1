from turtle import *

shape = input("what shape do you want ? ")
shape =shape.lower()
i=0

if shape == str("cube"):

    

    def line_and_angle(x,y) :
        forward(x)
        left(y)

    while i<4:
        line_and_angle(100,90)
        i=i+1

elif shape == str("triangle"):
    

    def line_and_angle(x,y) :
        forward(x)
        left(y)

    while i<3:
        line_and_angle(100,120)
        i=i+1

else :
    print(" the shape you want to draw is not recognize or avaible we can draw only triangle and cube for now ")
