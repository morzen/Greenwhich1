s1 = "Hello"
s2 = "World"

print("s1: " + s1)
print("s2: " + s2)
print()
if "He" in s1:
    print("'He' is a substring of '" + s1 + "'")
else:
    print("'He' is not a substring of '" + s1 + "'")

if "He" not in s2:
    print("'He' is not a substring of '" + s2 + "'")
else:
    print("'He' is a substring of '" + s2 + "'")

if "wor" in s2:
    print("'word' is a substring of '" + s2 + "'")
else:
    print("'word' is not a substring of '" + s2 + "'")

print()
input("Press return to continue ...")
