from string import punctuation
from string import whitespace
import string

sentence = "Hello COMP1753!! How are you doing today?"
total = len(sentence)

def letter(s):
    for c in punctuation:
        if c in s:
            s = s.replace(c, "")
    for c in whitespace:
        if c in s:
            s = s.replace(c, "")
    s = ''.join([i for i in s if not i.isdigit()])

    letters = len(s)
    letters = str(letters)
    print(letters + " letters")

def digits(s):
    numbers = str(sum(c.isdigit() for c in s))
    print(numbers + " digits")

def space(s):
    spaces = str(sum(c.isspace() for c in s))
    print(spaces + " whitespaces characters")

def punctuation1(s):
    count = lambda l1, l2: sum([1 for x in l1 if x in l2])
    marks = count(s,set(string.punctuation))
    print(marks)


letter(sentence)
digits(sentence)
space(sentence)
punctuation1(sentence)

print()
input("Press return to continue ...")
