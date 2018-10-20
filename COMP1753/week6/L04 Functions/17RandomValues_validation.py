from random import randint

def random():
    min_str = input("Min: ")
    max_str = input("Max: ")
    if min_str == "" :
        min_str = 1
    if max_str == "" :
        max_str = 100
    minimum = int(min_str)
    maximum = int(max_str)

    if maximum > minimum:
        random1 = randint(minimum, maximum)
        print(str(random1))
    else:
        print(str(maximum) + " is less than " + str(minimum))

random()
print()
input("Press return to continue ...")
