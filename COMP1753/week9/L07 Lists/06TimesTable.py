from random import randint


def print_list(items, header=None):
    if header != None:
        print(header)
    for item in items:
        print(str(item))
    print()

n_randoms = int(input("which time table? "))

while n_randoms > 10 or n_randoms <1:
    n_randoms = int(input("which time table? "))

print("the " + str(n_randoms) + " times table")

def even():
    x = 0
    if n_randoms == (2 , 4 , 6 , 8 , 10):
        print_list(randoms)
    else:
        print(randoms[0])
        while True :
            x = x + 2
            print(randoms[x])
            if x == 12 :
                break

def odd():
    y = 1
    if n_randoms == (2 , 4 , 6 , 8 , 10 ):
        print("no odd number in the list ")

    else:
        print(randoms[1])
        while True :
            y = y + 2
            print(randoms[y])
            if y == 11 :
                break


randoms = []
i = 0
for i in range(13):
    randoms.append(i*n_randoms)
    i = i + 1

print("even")
even()
print("odd")
odd()
print("list full")
print_list(randoms)

print()
input("Press return to continue ...")
