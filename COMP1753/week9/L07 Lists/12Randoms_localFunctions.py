from random import randint


def print_list(items, header=None):
    if header != None:
        print(header)
    for item in items:
        print(str(item))
    print()


def get_min_v1(items):
    items.sort()
    return items[0]


def get_min_v2(items):
    smallest = items[0]
    for item in items[1:]:
        if item < smallest:
            smallest = item
    return smallest


def get_sum(items):
    total = 0
    for item in items:
        total += item
    return total


# temporarily fix the list parameters
minimum = 1
maximum = 50
n_randoms = 7

randoms = []
for counter in range(n_randoms):
    randoms.append(randint(minimum, maximum))
print_list(randoms)

print("get_min_v1 = " + str(get_min_v1(randoms)))
print("get_min_v2 = " + str(get_min_v2(randoms)))
print("       min = " + str(min(randoms)))
print("get_sum = " + str(get_sum(randoms)))
print("    sum = " + str(sum(randoms)))

print()
input("Press return to continue ...")
