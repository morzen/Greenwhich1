import os

def read_contents(filename):
    """Return contents of text file as a list of lines."""
    with open(filename) as f:
        return f.readlines()

def index_and_count_lines(dirname, root_path_length):
    filenames = os.listdir(dirname)
    for filename in filenames:
        path = dirname + "\\" + filename
        if os.path.isdir(path):
            index_and_count_lines(path, root_path_length)
        elif path.endswith(".py"):
            lines = read_contents(path)
            count = 0
            for line in lines:
                if len(line.strip()) > 0:
                    count += 1
            print(format(count, "3") + " " + path[root_path_length:])

try:
    root_path = os.path.abspath(os.path.join(os.path.curdir, os.pardir))
    if os.path.isdir(root_path):
        index_and_count_lines(root_path, len(root_path) + 1)
except OSError as err:
    print(err)
    print("Stopping, unable to read dictionary file.")
