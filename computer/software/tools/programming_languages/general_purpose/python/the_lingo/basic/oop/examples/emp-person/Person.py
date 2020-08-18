class Person:

    def __init__(self, name, age, hobbies):
        self.name = name
        self.age = age
        self.hobbies = hobbies

    def get_name(self):
        print(self.name)

    def get_age(self):
        print(self.age)

    def get_hobbies(self):
        print(self.hobbies)


if __name__ == '__main__':
    mike = Person('mike', 23, ['computers', 'computers', 'computers'])

    mike.get_name()
    mike.get_age()
    mike.get_hobbies()
