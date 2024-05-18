"""
oop practicing with animals
"""


class Animal:
    """
    Animal class
    """

    # class variables (properties)
    name = "roy"
    species = "general"
    color = "black"
    has_tail = True

    def __init__(self, name, species, color, special):
        # instance variables
        self.name = name
        self.species = species
        self.color = color
        self._special = (
            special  # private property (only available inside of this class -sort of)
        )

    @property  # defines a getter
    def special(self):
        """
        a private property getter
        """
        return self._special

    @special.setter  # defines a setter
    def special(self, is_special):
        self._special = is_special

    def __del__(self):
        print(self.name + " object deleted @ address: " + self)


class Dog(Animal):
    """
    a dog from animal
    """

    number_of_legs = 4

    def __init__(self, name, color, is_special, is_egyptian):
        Animal.__init__(self, name, "dog", color, is_special)
        self.is_egyptian = is_egyptian


class Cat(Animal):
    """
    a cat from animal
    """

    number_of_legs = 4

    def __init__(
        self, name, color, is_special, is_cute
    ):  # self's lifetime is bounded by the method if the method finishes calling the self is destroyed
        Animal.__init__(self, name, "cat", color, is_special)
        self.is_cute = is_cute

    def meow(self):
        """
        meowing
        """
        print(self.name + " is meowing")


class DogCat(Cat, Dog):
    """
    mutant dog and cat
    """

    # 	def __init__(self, name, color, isBig):


my_dog_cat = DogCat("max", "red", False, True)

print(my_dog_cat)

# NOTE: this code has problems:
# 1. it is not DRY! (this can be solved using functions or better using class overriding methods)
# 2. The initialization method of the first inherited class the only one called:
# - my_dog_cat.getSpecies() # output: 'cat'
