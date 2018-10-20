
number1_str = input(" First number: ")
number1 = int(number1_str)

number2_str = input("Second number: ")
number2 = int(number2_str)



def input_and_convert():

    operation = input("Operation [+, -, *, /]: ")

    if operation == "+":
        combination = number1 + number2
        return combination
        
    elif operation == "-":
        combination = number1 - number2
        return combination
       
    elif operation == "*":
        combination = number1 * number2
        return combination
         
    elif operation == "/":
        if number2 == 0:
            combination = print("you can’t divide by zero")
            return combination
           
        else:
            combination = number1 / number2
            return combination
             
    else:
        combination = "ERROR ... '" + operation + "' unrecognised"
        return combination
         

def output(combination):
    combination_str = str(combination)
    print("Answer: " + combination_str)

combination = input_and_convert()
output(combination)

print()
input("Press return to continue ...")
