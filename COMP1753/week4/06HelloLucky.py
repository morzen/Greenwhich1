from random import randint

name = input("what is your name ?: ")

minimum = 1
maximum = 100
lucky = randint(minimum, maximum)
lucky = str(lucky)

print()
print("hello " + name + " your lucky number is " + lucky)
input("press enter to end")
