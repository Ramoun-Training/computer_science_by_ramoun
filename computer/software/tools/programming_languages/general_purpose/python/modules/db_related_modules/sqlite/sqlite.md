# SQLite

is extremly useful when you need some database functionality and don't wanna spend up a full fledged database like: mysql or Postgres.

you can use SQLite for small to medium size db apps where the db is gonna live on disk or you can use it for testing and prototyping out an application and if you have the need to move up to a larger db then you can later port that over.

> **Note**: SQLite is part of python standard library.

> **Note**: SQLite allows you to have a db in smiple file db or even in memory db that lives in ram.

## Connecting to a db

- a db file
    ```python
    conn = sqlite3.connect('database.db')
    # database.db : is a file where we can stoer our db (the db is stored as a tree)
    ```
    > **Note**: if the `database.db` file is there, it will connect to it But, if it's not there, it will creat it.

- in memory db
    ```python
    conn = sqlite3.connect(':memory:')
    ```

## Creating a Cursor

a cursor allows us to execute some SQLite commands.

```python
c = conn.cursor()
```

## Creating Tables

> **Note**: it is recommended to type the `execute()` commands in docstrings and it is also used in the python documentation.

- `CREATE`

    ```python
    c.execute("""
        CREATE Table tableName (
            column1 DATATYPE
            column2 DATATYPE
        )
    """)
    ```

- DATATYPES

    - INTEGER
    - REAL
    - TEXT
    - BLOB
    - NULL

## INSERT INTO table

```python
c.execute("""
    INSERT INTO tableName VALUES (val1, val2)
""")
```

## Query



## save changes

save (commit) the changes  to the database

```python
conn.commit()
```

> **Note**: When a change to the database is committed, it becomes visible for other connections. Unless it is committed, it remains visible only locally for the connection to which the change was done. Because of the limited concurrency features of sqlite, the database can only be read while a transaction is open.

> **Tip**: for more about the sue of `conn.commit()` follow [this link](https://stackoverflow.com/questions/36243538/python-sqlite3-how-often-do-i-have-to-commit)

## close connection

We can also close the connection if we are done with it. Just be sure any changes have been committed or they will be lost.

```python
conn.close()
```

# Resources

> **Note**: check the SQLite documentation on [sqlite official docs](https://sqlite.org/docs.html), [sqlite page](https://sqlite.org/lang.html) and [python sqlite docs](https://docs.python.org/2/library/sqlite3.html)

- [[1] corey's video](https://www.youtube.com/watch?v=pd-0G0MigUA&list=PL-osiE80TeTt2d9bfVyTiXJA-UTHn6WwU&index=51&ab_channel=CoreySchafer)