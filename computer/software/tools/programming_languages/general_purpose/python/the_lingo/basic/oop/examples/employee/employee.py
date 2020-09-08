#%%
import datetime

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

    def __len__(self):
        return len(self.full_name())

    # this was __str__ but it was changed for testing purposes
    def __repr__(self):
        return f'{self.first} {self.last} {self.email} {self.pay}'

    # __repr__ = __str__
    
            
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
        # super().__init__(first, last, pay)
        self.prog_lang = prog_lang

    def __repr__(self):
        # trying to return a string that could be used to recreate the object
        return f'Developer({self.first},{self.last},{self.pay},{self.prog_lang})'


#%%
# =====================
dev1 = Developer('ramoun', 'python', 80000, 'Ruby')
print(dev1)

print(dev1.pay)
dev1.apply_raise()
print(dev1.pay)
print(dev1.raise_amount)
print(emp1.raise_amount)


#%%
#= ==========================================
class Manager(Employee):

    def __init__(self, first, last, pay, employees=None):
        super().__init__(first, last, pay)
        if employees is not None:
            self.employees = employees
        else:
            print("emp_list address: " ,hex(id(employees)))
            print("None address: " ,hex(id(None)))
            self.employees = []

    def add_emp(self, emp):
        if emp not in self.employees:
            self.employees.append(emp)

    def remove_emp(self, emp):
        if emp in self.employees:
            self.employees.remove(emp)

    def print_emps(self):
        for emp in self.employees:
            print('==> ' + emp.full_name())


# %%
# ==================================
mng1 = Manager('ramoun', 'python', 90000)

mng1.print_emps()
mng1.add_emp(emp1)
mng1.print_emps()


# %%
# ==============================
mng2 = Manager('mike', 'wasaoski', 80000, [emp2])

mng2.print_emps()
mng2.add_emp(emp1)
print('.-'*20)
mng2.print_emps()
mng2.remove_emp(emp2)
print('.-'*20)
mng2.print_emps()
print('.-'*20)
print(mng2.email)


# %%
# ======================
print(isinstance(emp1, Employee))
print(issubclass(Manager, Employee))
print(issubclass(Employee, Employee))


#%%
# ======================
# don't do that, you want always to be explicit about what are you adding together

class N:
    def __init__(self, n):
        self.n = n

    def __add__(self, other):
        return self.n + other.n

num1 = N(30)
num2 = N(70)
print(num1 + num2)


#%%
# =============================
dev3 = Developer('peter', 'parker', 100000, 'Javascript')

print(len(dev3))


#%%
# ============================
class User:
    
    def __init__(self, first, last):
            self.first = first
            self.last = last

    @property
    def email(self):
        return f'{self.first}.{self.last}@company.com'

    @property
    def full_name(self):
        return f'{self.first} {self.last}'

    @full_name.setter
    def full_name(self, new_name):
        self.first, self.last = new_name.strip().split(' ')        

    @full_name.deleter
    def full_name(self):
        self.first = None
        self.last = None


user = User('ramoun', 'python')        

user.last = 'Ruby'
user.full_name = 'Mr Python' # == User.full_name(user, 'Mr Python')
# user.full_name('mike doom') # str object is not callable

print(user.first)
print(user.email) # the email is not updated
print(user.full_name)


del user.full_name
print(user.email)
print(user.first)
print(user.last)
print(user.full_name)