---
runme:
  id: 01HWV0HF61WHQ9S0BGDPTWN08P
  version: v3
---

# Error Handling in python

**Exception**: errors during the execution of a file/script (run-time errors). these errors are not unconditionally fatal (that means we can use statements like `try...except` to dictate how to handle those errors and move on with our script)

    basic-syntax:

    try:
        pass # here we put code that we expect to cause errors
    except Exception:
        pass # here we handle our expected errors
    else:
        pass # here we continue one with the alternative scenario (when the error doesn't occur)
    finally:
        pass # here we execute code that will always happen

the `except` statement is used to display helpful error messages to users of the app instead of the python default errors that only programmers can understand.

> **Note**: the goal of the `try...except` is not to get around all of the exceptions and errors that we could run in to. It's meant to catch the errors that we expect and handle them properly. So general `Exception` keyword is not a good practice.

> **Tip**: Error exceptions should be specific.

```python {"id":"01HWV0HF607SM9TEGT3AWDJ53E"}
try:
    file = open('file_that_exists')
    t = true
except Exception:
    print('file is not found')
# now you can see how inconvenient this is.
```

better be wriiten

```python {"id":"01HWV0HF61WHQ9S0BGDCETQ0CV"}
try:
    file = open('file_that_exists')
    t = true
except FileNotFoundError:
    print('the file is not found')
except NameError:
    print('some variable is used without declaration')
except Exception:
    print('something was wrong with app.Plz contact the developer @ramoun')
```

> **Note**: if you do handle multiple exceptions like the above code, make sure that you put the more specific exception at the top and general ones the more you go down. Because if you put the general ones at the top, it will always hit that first and will not continue to the specific exceptions furthur down.

To print the exception catched you can:

```python {"id":"01HWV0HF61WHQ9S0BGDG1PEESA"}
try:
    t = true
except Exception as e:
    print(e)
```

## else

what the `else` does is it runs code that needs to be executed if the `try` clause doesn't raise an exception.

```python {"id":"01HWV0HF61WHQ9S0BGDJ4E4S6K"}
try:
    file = open('textfile')
except FileNotFoundError as fnf:
    print(fnf)
else:
    print(file.read())
    file.close()
```

> **Note**: IN the code above, you could put the `else` clause code inside of the `try` block and will work fine. But, as we said earlier we wanna be specific about the exceptions we are trying to catch. The code could throw an exception that we weren't planing to catch, it may be an accident.

## finally

runs no matter what happens wether the code was successful or not.

> **Note**: `finally` is mostly used to release certain resources regardless of what happens in the `try..except`

```python {"id":"01HWV0HF61WHQ9S0BGDJW6H2D6"}
try:
    file = open('textfile')
except FileNotFoundError as fnf:
    print(fnf)
else:
    print(file.read())
finally:
    file.close()
```

## `raise`ing exceptions on your own

allows us to manually raise exceptions.

```python {"id":"01HWV0HF61WHQ9S0BGDPKHRSY2"}
try:
    file = open('dangerous')
    if file.name == 'dangerous':
        raise Exception
except FileNotFoundError:
        print('the file is not found')
except Exception:
        print('the file you are trying to open is dangerous')
finally:
    file.close()
```

# Resources

[1] [corey](https://www.youtube.com/watch?v=NIWwJbo-9_8&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=20)