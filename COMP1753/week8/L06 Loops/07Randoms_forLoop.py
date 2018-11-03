from random import randint


minimum = int(input("Min: "))
maximum = int(input("Max: "))

n_randoms = int(input("How many random numbers? "))
output = ""

def reconstruction(x , output_list):
    randnum = ""
    j = 0
    while j < x :
        randnum = randnum + output_list[j]
        j = j + 1
    print(randnum)


for counter in range(n_randoms):
    output += " " + str(randint(minimum, maximum))
    len_output = len(output)

output_list = list(output)
x = len(output_list)
i = 0
l = 0
while i < x:
    if output_list[i] == '7':
        output_list[i] = ' '
    elif output_list[i] == '0':
        print("Bad luck, no random values for you")
        l = 1
        break
    i = i + 1

if l != 1:
    reconstruction(x , output_list)

print()
input("Press return to continue ...")
