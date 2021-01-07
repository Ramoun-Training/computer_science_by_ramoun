from Person import Person

class Employee(Person):
    
    def __init__(self, emp_id, name, age, hobbies):
        self.id = emp_id
        Person.__init__(self, name, age, hobbies)

    def get_id(self):
        print(self.id)


if __name__ == '__main__':
    emp1 = Employee('123', 'mike', 23, ['computers', 'computers', 'computers'])
    

    emp1.get_id()

    emp1.get_name()
    emp1.get_age()
    emp1.get_hobbies()
