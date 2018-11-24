i = 0
while True:
    user_input = input("enter something: ")

    if user_input == "":
        print(i)
        break

    else:
        with open("log file.txt", "a")  as text_file:
            print(user_input, file=text_file)
    i = i + 1