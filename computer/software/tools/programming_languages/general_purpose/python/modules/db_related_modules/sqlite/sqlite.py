'''
we want ot be able to CRUD Employees to our db
'''
#%%
import sqlite3

mem_db = sqlite3.connect(':memory:')
conn = sqlite3.connect('employee.db')

c = conn.cursor()

# create a table
c.execute("""
    CREATE TABLE employees (
        first text,
        last  text,
        pay   real
    )""")

conn.commit()

conn.close()
