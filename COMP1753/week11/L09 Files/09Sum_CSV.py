def readlines(filename):
    """Return contents of text file as a list of lines."""
    with open(filename) as file:
        return file.readlines()


contents = readlines("data.csv")
n_columns = len(contents[0].split(","))
while True:
    column = int(input("Which column 0,...,"
                       + str(n_columns-1) +"; -1 to cancel? "))
    if column == -1:
        break
    total = 0
    for row_string in contents[1:]:
        row = row_string.split(",")
        cell = row[column]
        total += int(cell)
    print("The total of column " + str(column) + " = " + str(total))

print()
input("Press return to continue ...")
