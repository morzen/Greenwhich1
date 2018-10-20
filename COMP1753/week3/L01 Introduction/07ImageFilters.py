# blend.py

from PIL import Image

def avg(x, y):
    """Return average of x and y."""
    return (x + y)/2

def merge_values(tuple1, tuple2, multiplier):
    r = tuple1[0] + multiplier * tuple2[0]
    g = tuple1[1] + multiplier * tuple2[1]
    b = tuple1[2] + multiplier * tuple2[2]
    return r, g, b

def edge_filter(img, i, j):
    r, g, b = merge_values((0, 0, 0), img.getpixel((i, j)), 4)
    r, g, b = merge_values((r, g, b), img.getpixel((i-1, j)), -1)
    r, g, b = merge_values((r, g, b), img.getpixel((i+1, j)), -1)
    r, g, b = merge_values((r, g, b), img.getpixel((i, j-1)), -1)
    r, g, b = merge_values((r, g, b), img.getpixel((i, j+1)), -1)
    return r, g, b

def blur_filter(img, i, j):
    r, g, b = merge_values((0, 0, 0), img.getpixel((i, j)), 0)
    r, g, b = merge_values((r, g, b), img.getpixel((i-1, j-1)), 1/8)
    r, g, b = merge_values((r, g, b), img.getpixel((i-1, j)), 1/8)
    r, g, b = merge_values((r, g, b), img.getpixel((i-1, j+1)), 1/8)
    r, g, b = merge_values((r, g, b), img.getpixel((i, j-1)), 1/8)
    r, g, b = merge_values((r, g, b), img.getpixel((i, j+1)), 1/8)
    r, g, b = merge_values((r, g, b), img.getpixel((i+1, j-1)), 1/8)
    r, g, b = merge_values((r, g, b), img.getpixel((i+1, j)), 1/8)
    r, g, b = merge_values((r, g, b), img.getpixel((i+1, j+1)), 1/8)
    return int(r), int(g), int(b)

def sharpen_filter(img, i, j):
    r, g, b = merge_values((0, 0, 0), img.getpixel((i, j)), 5)
    r, g, b = merge_values((r, g, b), img.getpixel((i-1, j)), -1)
    r, g, b = merge_values((r, g, b), img.getpixel((i+1, j)), -1)
    r, g, b = merge_values((r, g, b), img.getpixel((i, j-1)), -1)
    r, g, b = merge_values((r, g, b), img.getpixel((i, j+1)), -1)
    return r, g, b

def emboss_filter(img, i, j):
    r, g, b = merge_values((0, 0, 0), img.getpixel((i, j)), -1)
    r, g, b = merge_values((r, g, b), img.getpixel((i-1, j-1)), 2)
    r, g, b = merge_values((r, g, b), img.getpixel((i+1, j+1)), -1)
    return r, g, b

def apply(filter_fn, img):
    """Return image with filter applied."""
    width, height = img.size
    newimg = Image.new("RGB", (width, height))
    for j in range(1, height - 1):
        for i in range(1, width - 1):
            newimg.putpixel((i, j), filter_fn(img, i, j))
    return newimg

def main():
    try:
        img = Image.open("lake.jpg")
        img.show()

        print("detecting edges ...")
        newimg = apply(edge_filter, img)
        newimg.show()
        newimg.save("tmp_lake_edge.jpg")

        print("blurring ...")
        newimg = apply(blur_filter, img)
        newimg.show()
        newimg.save("tmp_lake_blur.jpg")

        print("sharpening ...")
        newimg = apply(sharpen_filter, img)
        newimg.show()
        newimg.save("tmp_lake_sharpen.jpg")

        print("embossing ...")
        newimg = apply(emboss_filter, img)
        newimg.show()
        newimg.save("tmp_lake_emboss.jpg")

    except (OSError, ValueError) as err:
        print("Error:", err)
        print("Unable to process blending.")

main()
