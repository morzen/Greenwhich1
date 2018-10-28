def input_and_convert(prompt, conversion_fn):
    try:
        object = input(prompt)
        number = conversion_fn(objec)
        return number
    except:
        print("enter a number")


def calculate(x , y , z):
    if z == "+":
        result = x + y
        return result
    elif z == "-":
        result = x - y
        return result
    else:
        print("what you enteredd is not avaible or not relevant")


def output(parameter1, parameter2):
    parameter1_str = str(parameter1)
    parameter2_str = str(parameter2)
    print(parameter1_str + parameter2_str)


number1 = input_and_convert(" First number: ", int)

number2 = input_and_convert("Second number: ", int)

operation = input_and_convert("Operation [+, -]: ", str)

combination = calculate(number1, number2, operation)

output("Answer: ", combination)

print()
input("Press return to continue ...")
