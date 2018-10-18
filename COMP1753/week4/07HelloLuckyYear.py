from random import randint

name = input("what is your name ?: ")
year = input("what is your year of birth?: ")

minimum = int(year)
maximum = int(year)+70
lucky = randint(minimum, maximum)
lucky = str(lucky)

print()
print("hello " + name + " your lucky number is " + lucky)
input("press enter to end")
