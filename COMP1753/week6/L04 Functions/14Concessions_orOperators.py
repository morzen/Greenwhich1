name = input("What is your name? ")
student_str = input("Are you a student [y/n]? ")
student = student_str.lower() in ("y", "yes", "yea", "ye", "yep")
age_str = input("how old are you ?")
age = int(age_str)

def get_message(name ,student ,age):
    if name == str("Chris"):
        message =" - congratulations, you are entitled to a 30% discount"
        return message
    else :
        message = "Hello " + name

        if student and (age <= 18 or age > 65):
            message += " - congratulations, you are entitled to a 20% discount"
        elif student or (age <= 18 or age > 65):
            message += " - congratulations, you are entitled to a 10% discount"
        else:
            message += " - sorry, you must pay the regular price"
        return message

message = get_message(name ,student ,age )
print(message)

print()
input("Press return to continue ...")
