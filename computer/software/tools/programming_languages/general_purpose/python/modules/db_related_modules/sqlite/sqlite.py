# '''
# we want ot be able to CRUD Employees to our db
# '''
#%%
import sqlite3
from employee import Employee

conn = sqlite3.connect(':memory:')
old_conn = sqlite3.connect('employee.db')

c = conn.cursor()

# create a table
c.execute("""
    CREATE TABLE employees (
        first text,
        last  text,
        pay   real
    )""")


#%%
# === INSERT ===
c.execute("""
    INSERT INTO employees VALUES ('RAMOUN', 'PYTHON', 90000)
""")

c.execute("""
    INSERT INTO employees VALUES ('MIKE', 'RUBY', 80000)
""")

#%%
# === SELECT ===
c.execute("""
    SELECT * FROM employees
    """)
print(c.fetchone())


#%%
# === WHERE ===
c.execute("""
    SELECT * FROM employees WHERE last='PYTHON'
    """)
c.fetchmany(2)


#%%
c.execute("""
    SELECT * FROM employees
    """)
print("one: ", c.fetchone())
print("type of one: ", type(c.fetchone()))
print("all: ", c.fetchall())

#%%
# ==============================================
class MyCursor(sqlite3.Cursor):

    def exec(self, stmt,other):
        if isinstance(other, Employee):
            pass
            # fill the values in the stmt
        else:
            return -1


#%%
# ==============================================

#%%
# save and close 
conn.commit()
conn.close()
