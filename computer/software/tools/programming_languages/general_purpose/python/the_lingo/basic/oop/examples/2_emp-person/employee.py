"""employee module"""

from person import Person


class Employee(Person):
    """employee class"""

    def __init__(self, emp_id, name, age, hobbies):
        Person.__init__(self, name, age, hobbies)
        self.id = emp_id

if __name__ == "__main__":
    emp1 = Employee("123", "mike", 23, ["computers", "computers", "computers"])
