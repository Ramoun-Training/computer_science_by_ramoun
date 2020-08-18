class Iterable:
    def __init__(self, start, end):
        self.value = start
        self.end = end

    def __iter__(self):
        def __next__():
            while self.value < self.end:
                current = self.value
                self.value += 1
                yield current                
            else:
                raise StopIteration
        return __next__()

i = Iterable(1,10)    
iterator = iter(i)

for item in iterator:
    print(item)


# man just study the topic agian to understand how iterators are made    
