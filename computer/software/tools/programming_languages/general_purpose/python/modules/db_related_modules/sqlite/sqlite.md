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
    this is useful for testing if you want a fresh clean db at every run.
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

the `SELECT` statement provides some results that yu can iterate through and to iterate through these results, you can use  `c.fetchone()` or `c.fetchall()`.

- SELET 
    ```python
    SELECT column FROM tableName
    ```

- SELECT all
    ```python
    SELECT * FROM tableName
    ```

- WHERE
    ```python
    SELECT * FROM tableName WHERE column1=val1
    ```

- fetchone()
    it will get the next row in our results

- fetchall()
    it will get the next row in our results and only return that row and if there's no rows available then it just returns `None`.

- fetchmany(n)
    it will get the next `n` number of rows in our results as a list and return these rows and if there's no rows available then it just return and empty list (`[]`).

- fetchall()
    it will get the remainig rows left in our results and return those as a list and if there's no rows available then it just return and empty list (`[]`).

## populating a DB

- the bad way
    ```python
    c.execute("""
        INSERT INTO tableName VALUES ('{}', '{}', {})
    """.format(obj.v1, obj.v2, obj.v3))
    ```
    
    > **Note**: using string formating for populating a (any:mysql ..etc) DB because if you are accepting values from and end-user then this is valnurable to sql-injection attack.

- the correct way
    ```python
    # you can use `?` and these are db api placehoders
    c.execute("""
        INSERT INTO tableName VALUES (?, ?, ?)
    """, (obj.v1, obj.v2, obj.v3))
    # no need for '' because it will figure out the type on its own
    ```
    > **Note**: even if you are passing in one value into a placeholder, you still need to put it within a tuple.

- the second correct way (RECOMMENDED)
    ```python
    c.execute("""
        INSERT INTO tableName VALUES (:val1, :val2, :val3)
    """, {'val1': obj.v1, 'val2': obj.v2, 'val3': obj.v3})
    # this is more readable
    ```    


## save changes

save (commit) the changes  to the database

```python
conn.commit()
```

> **Note**: SELECT statements doesn't need to be commited unlike: CREATE, UPDATE, DELETE.

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

> **Note**: sqlite wroks with sqlalchemy (orm for python). you can use both for prototyping your app and when you are ready, you can easily replace that with a postgres or mysql db without hardly changing anythin in the code.