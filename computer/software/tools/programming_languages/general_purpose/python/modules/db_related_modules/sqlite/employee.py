#%%
import sqlite3

# conn = sqlite3.connect('employees.db')
conn = sqlite3.connect(':memory:')
c = conn.cursor()

c.execute("""
    CREATE TABLE employees (
        first text,
        last  text,
        pay   real
    )""")

#%%
class Employee:
    """A Sample Employer class"""

    def __init__(self, first=None, last=None, pay=None):
        self.first = first
        self.last = last
        self.pay = pay
        self.insert_emp()

    @property
    def email(self):
        return f'{self.first}.{self.last}@company.com'

    @property
    def full_name(self):
        return self.first + ' ' + self.last
    
    def insert_emp(self):
        with conn:
            c.execute(f"""
            INSERT INTO employees VALUES ('{self.first}', '{self.last}', {self.pay})
            """)

    @staticmethod
    def get_emp_by(val, by_what='first'):
        if by_what == 'first' or by_what == 'last' or by_what == 'pay':
            c.execute(f"""
                SELECT * FROM employees WHERE {by_what}='{val}'
                """)
            return c.fetchall()
        else:
            return -1

    @staticmethod
    def update_emp_field_of(val, field='first'):
        if field == 'first' or field == 'last' or field == 'pay':
            with conn:
                c.execute(f"""
                UPDATE employees SET {field}='{val}'
                """)
        else:
            return -1

    def remove_emp(self):
        with conn:
            c.execute(f'''
            DELETE FROM employees WHERE first = '{self.first}' AND last = '{self.last}' AND pay = {self.pay}
            ''')

    def __repr__(self):
        return f'Employee({self.first}, {self.last}, {self.pay})'

    # def __str__(self):
        # return 'string'

# print(Employee())        

#%%
#==============================================
emps = [
    Employee('ramoun', 'python', 100000),
    Employee('mike', 'ruby', 80000),
    Employee('john', 'doe', 80000),
]

print(Employee.get_emp_by(80000, 'pay'))
print(Employee.update_emp_field_of('doe', 'last'))
print(Employee.get_emp_by('doe', 'last'))
emps[1].remove_emp()
print(Employee.get_emp_by('80000', 'pay'))

#%%
conn.close()
