from random import randint

name = input("what is your name ?: ")

minimum = 3
maximum = 9
lucky = randint(minimum, maximum)
lucky = str(lucky)

if lucky == "7" :
    print("hello " + name + " your lucky number is " + lucky + " you hit the jackpot")

elif lucky == "3" or lucky == "9" :
    print("hello " + name + " your lucky number is " + lucky + " and you have won the prize")

else:
    print("hello " + name + " your lucky number is " + lucky)


input("press enter to end")
