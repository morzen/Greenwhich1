name = input("What is your name? ")

student_str = input("Are you a student [y/n]? ")
student = student_str.lower() in ("y", "yes")

age_str = input("How old are you? ")
age = int(age_str)

message = "Hello " + name

if student:
    if age <= 18 or age > 65:
        message += " - congratulations, you are entitled to a 20% discount"
    else:
        message += " - congratulations, you are entitled to a 10% discount"
else:
    if age <= 18 or age > 65:
        message += " - congratulations, you are entitled to a 10% discount"
    else:
        message += " - sorry, you must pay the regular price"

print(message)

print()
input("Press return to continue ...")
