#%%
from datetime import datetime

class Employee:

    num_of_employees = 0
    raise_amount = 1.04

    def __init__(self, first, last, pay):
            self.first = first
            self.last = last
            self.email = f'{first}.{last}@company.com'
            self.pay = pay

            Employee.num_of_employees += 1 # didn't use self.num_of_employees because there is no use case where the num_of_employees should be different for each instance

    def full_name(self):
        return f'{self.first} {self.last}'
    
    def apply_raise(self):
        # self.pay = int(self.pay * Employee.raise_amount)
        self.pay = int(self.pay * self.raise_amount) # using self.raise_amount will allow us to overide the class attribute freely for each instance as we want

    # creating a class method for cases where we want something to be the same for are instances
    @classmethod
    def change_raise_amount(cls, amount):
        cls.raise_amount = amount

    # creating an alternative constractor
    @classmethod
    def from_string(cls, emp_str): # using 'from_' is a convension
        '''construct an Employee object from a string'''
        first, last, pay = emp_str.split('-')
        return cls(first, last, pay)

    @staticmethod
    def is_workday(day):
        if day.weekday() == 5 or day.weekday() == 6:
            return False

        return True

    def __str__(self):
        return f'{self.first} {self.last} {self.email} {self.pay}'

    __repr__ = __str__
    
            
# creating emp objects
emp1 = Employee('ramoun', 'python', 15000)
emp2 = Employee('mike', 'schafer', 19000)

# testing the apply_raise method on the pay 
print(emp1.pay)
emp1.apply_raise()
print(emp1.pay)

#%%
#=== === === === ===
# testing class varaibles
Employee.raise_amount = 1.05

print(Employee.raise_amount)
print(emp1.raise_amount)
print(emp2.raise_amount)

#%%
#============
emp1.raise_amount = 1.02

print(Employee.raise_amount)
print(emp1.raise_amount)
print(emp2.raise_amount)

#%%
#=============
print(Employee.num_of_employees)

#%%
#=============
print(dir(Employee))
print(Employee.__dict__)

print(dir(emp1))
print(emp1.__dict__)

#%%
#==============
# using change_raise_amount with a class
Employee.change_raise_amount(1.25)

print(Employee.raise_amount)
print(emp1.raise_amount)
print(emp2.raise_amount)

# using change_raise_amount with a class
emp2.change_raise_amount(1.21) # useless, why would you even do that

print(Employee.raise_amount)
print(emp1.raise_amount)
print(emp2.raise_amount)

#%%
# checking to see
print(Employee.__dict__)
print(emp1.__dict__)
print('-.'*20)
print(dir(Employee))
print(dir(emp2))
#%%
# alternative constructor
emp3 = Employee.from_string('john-doe-50000')
print(emp3)

#%%
#==============
day = datetime.date(2020, 9, 6)
print(Employee.is_workday(day))

#%%
class Developer(Employee):
    raise_amount = 1.5

    def __init__(self, first, last, pay, prog_lang):
        Employee.__init__(self, first, last, pay)
        self.prog_lang = prog_lang

#%%
# =====================
dev1 = Developer('ramoun', 'python', 80000, 'Ruby')
print(dev1)

print(dev1.pay)
dev1.apply_raise()
print(dev1.pay)
print(dev1.raise_amount)
print(emp1.raise_amount)

