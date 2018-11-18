from string import punctuation
from string import whitespace


Words = []



def ponctuation(s):
    for c in punctuation :
        if c in s:
            s = s.replace(c, "")

    return s

def space(s):
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


def listing():
    i = 0
    j = 0
    while True:

        try:
            if Words[i] != " ":
                i = i + 1

            elif Words[i] == " ":
                #print(Words[j: i])
                Words[j:i] = [''.join(Words[j:i])]
                neword = Words[j:i]
                Words.remove(" ")
                #print(Words)
                j = j + 1
                i = 1
        except IndexError:
            break

    try :
        Words.remove('')
    except ValueError:
        print(Words)
    count = frequency(Words)
    for key in count:
        print(str(count.get(key)) + " " + key)
    word = len(Words)
    print("number of word")
    print(word)













while True :
    sentence = str(input("enter a sentence please: ")) + " "


    if sentence == " ":
        break
    else:
        character_count = str(len(sentence))
        sentence = ponctuation(sentence)
        sentence2 = space(sentence)
        letter_count = str(len(sentence2))
        Words = list(sentence)
        print("number of character: " + character_count)
        print("number of letter: " + letter_count)
        listing()




print()
input("Press return to continue ...")
