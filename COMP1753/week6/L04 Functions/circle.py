from turtle import *

setheading(0)

print("put the biggest circle first")
i=0
number_of_circle_str = input("how many supperposed circle do you want: ")
number_of_circle = int(number_of_circle_str)
startx = int(input("where do u want the circle to start on the x axe: "))
starty = int(input("where do u want the circle to start on the y axe: "))

def circle_ar(x ,y ,r ,colorF):
    
    penup()
    goto(x,y)
    goto (x,y-r)
    pendown()

    if colorF == 0:
        color("black","white")
        begin_fill()
        circle(r)
        end_fill()
        
    elif colorF == 1:
        color("black")
        begin_fill()
        circle(r)
        end_fill()
        
    elif colorF == 2:
        color("red")
        begin_fill()
        circle(r)
        end_fill()
        
    elif colorF == 3:
        color("blue")
        begin_fill()
        circle(r)
        end_fill()
        
    elif colorF == 4:
        color("green")
        begin_fill()
        circle(r)
        end_fill()
        
    elif colorF == 5:
        color("yellow")
        begin_fill()
        circle(r)
        end_fill()
    else:
        print(" the color you asked is not avaible or what you typed was incorrect")
        

while i<number_of_circle :

    radius = int(input("what radius do you want: "))
    color_choice = int(input("what color do you want : 0)white 1)black 2)red 3)blue 4)green 5)yellow : "))
    circle_ar(startx,starty,radius,color_choice)
    i = i+1
   

print()
input("Press return to continue ...")
