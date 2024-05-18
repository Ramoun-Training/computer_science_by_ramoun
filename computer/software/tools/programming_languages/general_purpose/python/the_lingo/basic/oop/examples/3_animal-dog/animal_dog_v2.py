"""
animal is enhanced
"""


class Animal:
    """
    a better Animal
    """

    name = "roy"
    species = "general"
    color = "black"
    has_tail = True

    def __init__(self, name, species, color):
        self.name = name
        self.species = species
        self.color = color

    def __del__(self):
        print(self.name + " object deleted @ address: " + self)


class Dog(Animal):
    """
    better dog
    """

    number_of_legs = 4

    def __init__(self, name, color):
        Animal.__init__(self, name, "dog", color)


class Cat(Animal):
    """
    better Cat
    """

    number_of_legs = 4

    def __init__(self, name, color):
        Animal.__init__(self, name, "cat", color)

    def meow(self):
        '''mewooooooo'''
        print(self.name + " is meowing")


class DogCat(Cat, Dog):
    '''better dog cat'''

    def __init__(self, name, color):
        Cat.__init__(self, name, color)
        Dog.__init__(self, name, color)
        self.species = "CatDog"


my_dog_cat = DogCat("max", "red")

print()

# NOTE: this code has problems:
# 1. it is not DRY! (this can be solved using functions or better using class overriding methods)
