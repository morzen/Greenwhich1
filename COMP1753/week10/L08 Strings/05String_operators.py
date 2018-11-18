s1 = "Hello"
s2 = "World"

print("s1: " + s1)
print("s2: " + s2)
print()
print("SLICES")
print("s1[1:4]: " + s1[1:3])
print(" s1[3:]: " + s1[3:])
print(" s1[:2]: " + s1[:2])
print()
print("ADD & MULTIPLY")
print("s1 + s2: " + s1 + s2)
print(" 2 * s1: " + (2 * s1))
print()
print("ADD & MULTIPLY ASSIGNMENT")
s1 += s2
print("s1 += s2; s1: " + s1)
s2 *= 3
print("s2 *= 3;  s2: " + s2)
print()

print()
input("Press return to continue ...")
