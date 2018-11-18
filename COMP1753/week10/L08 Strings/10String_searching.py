string = "Hello world!"

if string.find("or") != -1:
    print("'" + string + "' contains 'or'")
else:
    print("'" + string + "' does not contain 'or'")

if string.startswith("He"):
    print("'" + string + "' starts with 'He'")
else:
    print("'" + string + "' does not start with 'He'")

if string.endswith("world"):
    print("'" + string + "' ends with 'world'")
else:
    print("'" + string + "' does not end with 'world'")

print("'" + string + "' contains " + str(string.count("l")) + " 'l' characters")
print("'" + string + "' contains " + str(string.count("or")) + " 'or' substrings")

print()
input("Press return to continue ...")
