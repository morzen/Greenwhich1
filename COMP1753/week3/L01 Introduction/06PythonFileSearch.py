import os

def read_contents(filename):
    """Return contents of text file as a string."""
    with open(filename) as f:
        return f.read()

def index_and_search(dirname, root_path_length, search_string):
    filenames = os.listdir(dirname)
    for filename in filenames:
        path = dirname + "\\" + filename
        if os.path.isdir(path):
            index_and_search(path, root_path_length, search_string)
        elif path.endswith(".py"):
            string = read_contents(path)
            occurrences = string.count(search_string)
            if occurrences > 0:
                print(format(occurrences, "4") + " " + path[root_path_length:])

try:
    while True:
        search_string = input("Search string (case sensitive; hit return to cancel): ")
        if search_string == "":
            break
        root_path = os.path.abspath(os.path.join(os.path.curdir, os.pardir))
        if os.path.isdir(root_path):
            index_and_search(root_path, len(root_path) + 1, search_string)
except OSError as err:
    print(err)
    print("Stopping, unable to read dictionary file.")
