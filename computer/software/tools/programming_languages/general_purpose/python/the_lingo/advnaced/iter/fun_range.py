"""
Functional Range
"""

from functools import reduce
from iterators import for_fun


class FunRange:
    """
    a custom range class which is iterable and can return an iterator
    """

    def __init__(self, start, end, step=1) -> None:
        self.value = start
        self.end = end
        self.step = step

    def __iter__(self):
        """
        for this to be an iterable, it has to have the __iter__ method
        """
        return self

    def __next__(self):
        """
        for this to be an iterator it has to have the __next__ method
        """
        if self.value >= self.end:
            raise StopIteration

        curr = self.value
        self.value += self.step
        return curr


def fun_range(start, end, step=1):
    """
    fun range function
    """
    curr = start
    while curr < end:
        yield curr
        curr += step


def get_power(i):
    """
    get the twos power based on i
    """
    twos_power = 1
    for _ in range(i):
        twos_power *= 2
    return twos_power


for_fun(
    # lambda i: print(reduce(lambda prev, curr: prev * curr, [2] * i)), FunRange(1, 21)
    lambda i: print(reduce(lambda prev, curr: prev * curr, [2] * i)),
    fun_range(1, 21),
)

"""
# alternative syntax

range(1, 21): i
|
reduce(prev, curr, [2] * i): res = prev * curr
|
print(res)
"""


