"""
a car - what?
"""


class Car:
    """car class"""

    color = "red"

    def drive(self):
        """drive the car"""
        # self allows objects to use that method or it will be used by the class only like the next method

    @staticmethod
    def stop():
        '''stop the car'''
        print("stopping")


bmw = Car()

print(bmw.color)

bmw.color = "blue"

print(bmw.color)

mercedes = Car()

print(mercedes.color)

print(Car.color)

Car.stop()

print(bmw.stop)

print(bmw.stop())
