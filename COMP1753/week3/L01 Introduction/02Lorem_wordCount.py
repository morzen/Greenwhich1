# from https://www.lipsum.com/feed/html
string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "\
    "Proin sit amet nulla scelerisque, ultrices enim sed, pretium mi. "\
    "Aenean neque orci, maximus quis risus quis, blandit rutrum purus. "\
    "Etiam varius dui eget justo tempor elementum. "\
    "Duis finibus felis a dapibus tincidunt. "\
    "Nam quis dui tempus, tristique tortor a, vehicula odio. "\
    "Sed ac dolor vel augue imperdiet placerat. "\
    "Donec malesuada erat sapien, molestie convallis nisl iaculis a. "\
    "Donec turpis mi, tincidunt at dolor sit amet, pulvinar commodo justo. "\
    "Proin rutrum nisl et sollicitudin tincidunt. "\
    "Maecenas ut diam ac justo consectetur tincidunt. "\
    "Phasellus pulvinar lectus ut orci finibus aliquam. "\
    "Cras sit amet urna laoreet, aliquet ipsum ut, vulputate odio. "\
    "Vestibulum consectetur, tortor et consectetur gravida, dui nulla dapibus mauris, ac dapibus metus neque nec odio. "\
    "Aliquam at molestie ipsum."
print(string)
print("character count = " + str(len(string)))
print("     word count = " + str(len(string.split(" "))))
