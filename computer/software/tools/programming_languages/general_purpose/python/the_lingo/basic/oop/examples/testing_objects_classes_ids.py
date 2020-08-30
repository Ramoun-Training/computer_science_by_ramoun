class c:
    def __init__(self):
        
        print("self: ", str(self) + " from __init__")
        self = 'hi'
        print("address of self: ",hex(id(self)))
        print("self: ", self + " from __init__")
    def addr(self):
        print("self: ", self)
        print("addr of self", hex(id(self)))
    def __del__(self):
        print(str(self) + ' deleted')


c1 = c()

print("c1: ", c1)
print("c1 addr: ", hex(id(c1)))
# TypeError: __init__() should return None, not 'str'
