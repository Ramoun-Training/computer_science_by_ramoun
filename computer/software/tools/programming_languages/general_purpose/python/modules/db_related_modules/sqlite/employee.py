#%%
class Employee:
    """A Sample Employer class"""

    def __init__(self, first=None, last=None, pay=None):
        self.first = first
        self.last = last
        self.pay = pay

    @property
    def email(self):
        return f'{self.first}.{self.last}@company.com'

    @property
    def full_name(self):
        return self.first + ' ' + self.last

    def __repr__(self):
        return f'Employee({self.first}, {self.last}, {self.pay})'

    # def __str__(self):
        # return 'string'

print(Employee())        