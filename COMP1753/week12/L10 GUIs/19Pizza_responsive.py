from tkinter import *


def clicked():
    message = "Pizza chosen is " + pizzas[selected.get()]
    price = pizza_prices[selected.get()]
    extras_message = ""
    for e in range(len(extra_states)):
        if extra_states[e].get():
            if extras_message != "":
                extras_message += ", "
            extras_message += extras[e]
            price += extra_prices[e]
    if extras_message != "":
        message += " with extra " + extras_message
    print(message)
    output.set("Total price is £" + format(price, "4.2f"))


window = Tk()
window.geometry("250x400")
window.title("Python pizzas")

row_counter = 0

lbl0 = Label(window, text="Pizzas", font=("Arial Bold", 20))
lbl0.grid(column=0, row=row_counter, sticky="W")
row_counter += 1

selected = IntVar()
selected.set(0)

pizzas = ["margherita", "napoletana", "marinara"]
pizza_prices = [6.0, 7.0, 7.5]
for i in range(len(pizzas)):
    rad = Radiobutton(window, text=pizzas[i] +
        " - £" + format(pizza_prices[i], "4.2f"), value=i, variable=selected, command=clicked)
    rad.grid(column=0, row=row_counter, sticky="W")
    row_counter += 1

lbl1 = Label(window, text="Extras", font=("Arial Bold", 20))
lbl1.grid(column=0, row=row_counter, sticky="W")
row_counter += 1

extras = ["mushrooms", "cheese", "anchovies", "sausage"]
extra_prices = [0.5, 1.0, 1.5, 1.8]
extra_states = []
for i in range(len(extras)):
    extra_states.append(BooleanVar())
    chk = Checkbutton(window, text=extras[i] +
        " - £" + format(extra_prices[i], "4.2f"), var=extra_states[i], command=clicked)
    chk.grid(column=0, row=row_counter, sticky="W")
    row_counter += 1

output = StringVar()

txt = Entry(window, width=30, textvariable=output, state="readonly")
txt.grid(column=0, row=row_counter, sticky="W", padx=5, pady=5)
row_counter += 1

clicked()

window.mainloop()
