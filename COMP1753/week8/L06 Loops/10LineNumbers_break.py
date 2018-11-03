n_lines = int(input("How many lines? "))
for counter in range(1, n_lines+1):
    if counter == 3:
        break
    print("This is line " + str(counter))

print()
input("Press return to continue ...")
