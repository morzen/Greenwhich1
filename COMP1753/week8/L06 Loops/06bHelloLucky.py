from random import randint


name =str(input("What is your name? "))
minimum = 1
maximum = 10
lucky_number = randint(minimum, maximum)
message = "Hello " + name + ", your lucky number is " + str(lucky_number)
i = 0
while i < 1:
    if lucky_number == 3 or lucky_number == 9:
        message += " and you have won a prize"
        print(message)
    elif lucky_number == 7:
        message += " and you have hit the jackpot"
        print(message)
    elif name == "":
        break
    else:
        name2promt = input("what s your name again ?")
        if name2promt == "":
            break
        else:
            print(message)

    i = 1


#print(message)

print()
input("Press return to continue ...")
