def print_list(items, header=None):
    if header != None:
        print(header)
    for item in items:
        print(str(item))
    print()

fruits = ["Banana","Orange","Apple","Mango"]

def first():
    print(fruits[0])

def last():
    longeur = len(fruits)-1
    print(fruits[longeur])

if fruits == []:
    print("list is empty ")
else:  
    first()
    last()

print()
input("Press return to continue ...")
