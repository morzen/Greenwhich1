string = "COMP1753"

if string.isalnum():
    print(string + " is alpha-numeric (letters or numbers)")
else:
    print(string + " is not alpha-numeric (letters or numbers)")

if string.isalpha():
    print(string + " is alphabetic (just letters)")
else:
    print(string + " is not alphabetic (just letters)")

if string.isspace():
    print(string + " is whitespace")
else:
    print(string + " is not whitespace")

if string[:4].isalpha():
    print(string[:4] + " is alphabetic (just letters)")
else:
    print(string[:4] + " is not alphabetic (just letters)")

if string[4:].isdigit():
    print(string[4:] + " is numeric (just digits)")
else:
    print(string[4:] + " is not numeric (just digits)")

if string[:4].isupper():
    print(string[:4] + " is upper case")
else:
    print(string[:4] + " is not upper case")

if string[:4].islower():
    print(string[:4] + " is lower case")
else:
    print(string[:4] + " is not lower case")

if string[4:].islower():
    print(string[4:] + " is lower case")
else:
    print(string[4:] + " is not lower case")

print()
input("Press return to continue ...")
