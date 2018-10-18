

print(" choose what type of calcul you want to do ")

calcul_choosen = input(" 1)addition 2)subtraction 3)multiplication 4)division 9)exit : ")
calcul_choosen = int(calcul_choosen)

def addition (x,y):
    result = x + y
    print(result)

def subtraction (x,y):
    result = x - y
    print(result)

def multiplication (x,y):
    result = x * y
    print(result)

def division (x,y):
    result = x / y
    print(result)



if calcul_choosen == 1 :
    numb1 = input("choose your first number: ")
    numb1 = int(numb1)
    numb2 = input("choose your second number: ")
    numb2 = int(numb2)
    addition(numb1,numb2)


if calcul_choosen == 2 :
    numb1 = input("choose your first number: ")
    numb1 = int(numb1)
    numb2 = input("choose your second number: ")
    numb2 = int(numb2)
    substraction(numb1,numb2)

if calcul_choosen == 3 :
    numb1 = input("choose your first number: ")
    numb1 = int(numb1)
    numb2 = input("choose your second number: ")
    numb2 = int(numb2)
    multiplication(numb1,numb2)

if calcul_choosen == 4 :
    numb1 = input("choose your first number: ")
    numb1 = int(numb1)
    numb2 = input("choose your second number: ")
    numb2 = int(numb2)
    division(numb1,numb2)

if calcul_choosen == 9 :
    exit




