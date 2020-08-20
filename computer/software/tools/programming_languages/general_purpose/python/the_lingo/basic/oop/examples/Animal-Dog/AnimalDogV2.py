class Animal:

	name = 'roy'
	species = 'general'
	color = 'black'
	has_tail = True
	
	def __init__(self, name, species, color):
		self.name = name
		self.species = species
		self.color = color
	
	def getName(self):
		return self.name

	def getSpecies(self):
		return self.species

	def getColor(self):
		return self.color

	def __del__(self):
		print(self.name + " object deleted @ address: " + self)


class Dog(Animal):

	number_of_legs = 4
	
	def __init__(self, name, color, isBig):
		Animal.__init__(self, name, 'dog', color)
		self.isBig = isBig


class Cat(Animal):
	
	number_of_legs = 4

	def __init__(self, name, color, isCute): # self's lifetime is bounded by the method if the mehtod finishes calling the self is destroyed
		Animal.__init__(self, name, 'cat', color)
		self.isCute = isCute

	def meow(self):
		print(self.name + " is meowing")

class DogCat(Cat, Dog):
	def __init__(self, name, color, isBig, isCute):
            Cat.__init__(self, name, color, isCute)
            Dog.__init__(self, name, color, isBig)
            self.species = 'CatDog'

my_dogcat = DogCat('max', 'red', False, True)

print()

# NOTE: this code has problems:
# 1. it is not DRY! (this can be solved using funcitos or better using class overriding methods)
