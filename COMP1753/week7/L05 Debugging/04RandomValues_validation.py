from random import randint


try:
    minimum = int(input("Min: "))+1
    maximum = int(input("Max: "))-1

    if maximum > minimum:
        random1 = randint(minimum, maximum)
        random2 = randint(minimum, maximum)
        random3 = randint(minimum, maximum)
        random4 = randint(minimum, maximum)
        random5 = randint(minimum, maximum)
        print(str(random1) + " " + str(random2) + " " + str(random3) + " " + str(random4) + " " + str(random5))
    else:
        print(str(maximum) + " is less than " + str(minimum))

except:
    print("enter number")

print()
input("Press return to continue ...")
