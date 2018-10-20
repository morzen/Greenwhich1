def input_and_convert(prompt, conversion_fn):
    string = input(prompt)
    number = conversion_fn(string)
    return number

def calculate(number1, number2, operation):
    if operation == "+":
        combination = number1 + number2
        return combination
    elif operation == "-":
        if number2 > number1 :
            print("number2 higher than number1 so result is going to be negative")
            combination = number1 - number2
        else:
            combination = number1 - number2
        return combination
    else:
        print("the calcule you choose is not avaible or what you intered was incorrect")

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
