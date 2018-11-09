from random import randint

def print_list(items, header=None):
    if header != None:
        print(header)
    for item in items:
        print(str(item))
    print()


fruits = ["Banana","Orange","Apple","Mango"]

maximum = len(fruits)-1
random1 = randint(0, maximum)


name = input("what is your name? ")

print("hello " + name + " your favorite fruit is " + fruits[random1])

number = input("if you want to stop here press enter if you want to add more fruit to the list enter 1: ")


print()
input("Press return to continue ...")
