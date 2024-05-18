"""a circle module"""

import math


class Circle:
    """
    a circle class
    """

    pi = math.pi

    def __init__(self, radius=1):
        self._radius = radius

    @property
    def radius(self):
        """get radius fo circle"""
        return self._radius

    @radius.setter
    def radius(self, new_radius):
        if new_radius <= 0:
            raise ValueError("Radius must be a positive number")

        self._radius = new_radius

    @property
    def area(self):
        """get area of a circle"""
        return self.radius**2 * Circle.pi

my_circle = Circle()

print(my_circle.radius)

# my_circle.radius = -2
my_circle.radius = 2
print(my_circle.radius)
print(my_circle.area)
