def print_list(items, header=None):
    if header != None:
        print(header)
    for item in items:
        print(str(item))
    print()


fruits = ["Banana","Orange","Apple","Mango"]

favourite_str = str(input("What is your favourite fruit? if none just hit enter "))
favourite = (favourite_str.lower()).title()

least_favourite_str = str(input("what is your least favourite fruit ? if none just hit enter "))
least_favourite = (least_favourite_str.lower()).title()

fruits.append(favourite)
fruits.append(least_favourite)
print_list(fruits)
fruits.remove(favourite)
fruits.remove(least_favourite)


def fav():

    if favourite == "":
        print("you have not favourite fruits here are some regular one ")
    elif favourite in fruits:
        fruits.remove(favourite)
        fruits.insert(0, favourite)
    elif favourite != "":
        fruits.insert(0, favourite)
    else:
        print("i don't anderstand")

def least_fav():

    if least_favourite == "":
        print("you have no least favourite fruit")
    elif least_favourite in fruits:
        fruits.remove(least_favourite)
        fruits.append(least_favourite)
    elif least_favourite != "":
        fruits.append(least_favourite)
    else:
        print("i don't anderstand")


fav()
least_fav()

print_list(fruits)



print()
input("Press return to continue ...")
