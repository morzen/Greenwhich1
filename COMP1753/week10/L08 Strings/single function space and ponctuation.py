from string import punctuation
from string import whitespace


def remove(s , k , l):
    print(s)
    for c in punctuation:
        if c in s:
            s = s.replace(c, "")
            k = k.replace(c, "")
    print(k)
    for c in whitespace:
        if c in s:
            s = s.replace(c, "")
            l = l.replace(c, "")
    print(l)
    print(s)
    return s


string = "Hello, world!! How are you doing today?"
remove(string , string , string)


print()
input("Press return to continue ...")
