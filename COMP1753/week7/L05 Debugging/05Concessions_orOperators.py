def get_message(name, student, age):

    """ work out the concession
        and construct the output message """

    message = "Hello " + name

    if student and age <= 18:
        message += " - congratulations, 20% discount"
    elif student or age <= 18:
        message += " - congratulations, 10% discount"
    else: # adult and not student
        message = " - sorry, regular price"
    return message


name = input("What is your name? ")

#gender = input("Female / Male / Neither? ")

student_str = input("Are you a student [y/n]?: " )
student = student_str.lower() in ("y", "yes","yea","yup","ye")

age_str = input("How old are you? ")
try:
    age = int(age_str) # convert to integer
except:
    print("enter a number")
    exit()

message = get_message(name, student, age)

print(message)

print()
input("Press return to continue ...")
