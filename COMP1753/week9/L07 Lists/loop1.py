def print_list(items, header=None):
    if header != None:
        print(header)
    for item in items:
        print(str(item))
    print()


fruit = []

while True :

    fruit_name_str = input("Guess another fruit? if you have no more idea enter done ")
    fruit_name = (fruit_name_str.lower()).title()

    if fruit_name in fruit:
        print("this fruit is allready in the list")

    elif fruit_name == "Done":
        print_list(fruit , "FRUITS")
        print("your score is " + str(len(fruit)))
        break

    elif fruit_name not in fruit:
        fruit.append(fruit_name)

    else:
        print("i don't anderstand an error must have been made by me or you ")
