'''
Iterables and Iterators
'''
def for_fun(cb, iterable):
    '''
    a for loop function
    '''
    iterator = iter(iterable) # an iterable contains '__iter__'
    while True:
        try:
            next_item = next(iterator) # an iterator contains '__next__'
            cb(next_item)
        except StopIteration:
            break

# for_fun([1,2,3,4], lambda i: print(i * i))
