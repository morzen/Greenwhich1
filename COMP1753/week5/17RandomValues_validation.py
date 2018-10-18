from random import randint


min_str = input("Min: ")
max_str = input("Max: ")
minimum = int(min_str)
maximum = int(max_str)

if maximum > minimum:
    random1 = randint(minimum, maximum)
    random2 = randint(minimum, maximum)
    random3 = randint(minimum, maximum)
    random4 = randint(minimum, maximum)
    print(str(random1) + " " + str(random2) + " " + str(random3) + " " + str(random4))
else:
    print(str(maximum) + " is less than " + str(minimum))

print()
input("Press return to continue ...")
