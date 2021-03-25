import urllib
class urlhandler:
    address = ''
    data = ''
    def __init__(self, url):
        self.address = url
    def openURL(self):
        self.data =  urllib.urlopen(self.address)
    def getURLdata(self):
        return self.data.read()
    def closeURL(self):
        self.data.close()


from tkinter import *
import urlhandler
def go():
    text.delete(1.0, END)
    conn = urlhandler.urlhandler(entry.get())
    conn.openURL()
    text.insert(INSERT, conn.getURLdata())
    conn.closeURL()
browserwindow = Tk()
browserwindow.title('knowpapa browser')
label = Label(browserwindow, text= 'url:')
entry = Entry(browserwindow)
button = Button(browserwindow, text='Go', command = go)
text = Text(browserwindow)
label.pack(side=TOP)
entry.pack(side=TOP)
button.pack(side=TOP)
text.pack(side= TOP)
browserwindow.mainloop()

input()