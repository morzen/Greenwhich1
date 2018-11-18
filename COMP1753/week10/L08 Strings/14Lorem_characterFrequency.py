from string import punctuation
from string import whitespace


def remove_punctuation(s):
    """Return copy of s with punctuation removed."""
    for c in punctuation:
        if c in s:
            s = s.replace(c, "")
    return s


def remove_whitespace(s):
    """Return copy of s with whitespace removed."""
    for c in whitespace:
        if c in s:
            s = s.replace(c, "")
    return s


def frequency(items):
    """Return count of each item in list of items."""
    count = {}
    for item in items:
        if item in count:
            count[item] += 1
        else:
            count[item] = 1
    return count


string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
string = string.lower()
string = remove_punctuation(string)
string = remove_whitespace(string)

characters = list(string)

count = frequency(characters)

print("CHARACTER FREQUENCY - unordered")
print(count)


for key in count:
    if count.get(key) < 9 :
        print(str(count.get(key)) + "  " + key)
    elif count.get(key) > 9 and count.get(key) < 99:
        print(str(count.get(key)) + " " + key)
    elif count.get(key) > 99 and count.get(key) < 1000:
        print(str(count.get(key)) + "  " + key)
    else:
        print(str(count.get(key)) + "   " + key)
print()

print("CHARACTER FREQUENCY - sorted by character")
sorted_keys = sorted(count)
for key in sorted_keys:
    if count.get(key) < 9 :
        print(str(count.get(key)) + "  " + key)
    elif count.get(key) > 9 and count.get(key) < 99:
        print(str(count.get(key)) + " " + key)
    elif count.get(key) > 99 and count.get(key) < 1000:
        print(str(count.get(key)) + "  " + key)
    else:
        print(str(count.get(key)) + "   " + key)

print()

print("CHARACTER FREQUENCY - sorted by decreasing frequency")
sorted_keys = sorted(count, key=count.get)
sorted_keys.reverse()
for key in sorted_keys:
    if count.get(key) < 9 :
        print(str(count.get(key)) + "  " + key)
    elif count.get(key) > 9 and count.get(key) < 99:
        print(str(count.get(key)) + " " + key)
    elif count.get(key) > 99 and count.get(key) < 1000:
        print(str(count.get(key)) + "  " + key)
    else:
        print(str(count.get(key)) + "   " + key)
print()

print()
input("Press return to continue ...")
