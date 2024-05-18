"""person module"""


class Person:
    """Person class"""

    def __init__(self, name, age, hobbies):
        self.name = name
        self.age = age
        self.hobbies = hobbies


if __name__ == "__main__":
    mike = Person("mike", 23, ["computers", "computers", "computers"])
