# file_objects

## `open()` modes

- `r`: Opens the file in read-only mode. Starts reading from the beginning of the file and is the default mode for the `open()` function.

- `rb`: Opens the file as read-only in binary format and starts reading from the beginning of the file. While binary format can be used for different purposes, it is usually used when dealing with things like images, videos, etc.

- `r+`: Opens a file for reading and writing, placing the pointer at the beginning of the file.

- `w`: Opens in write-only mode. The pointer is placed at the beginning of the file and this will overwrite any existing file with the same name. It will create a new file if one with the same name doesn't exist.

- `wb`: Opens a write-only file in binary mode.

- `w+`: Opens a file for writing and reading.

- `wb+`: Opens a file for writing and reading in binary mode.

- `a`: Opens a file for appending new information to it. The pointer is placed at the end of the file. A new file is created if one with the same name doesn't exist.

- `ab`: Opens a file for appending in binary mode.

- `a+`: Opens a file for both appending and reading.

- `ab+`: Opens a file for both appending and reading in binary mode.

> **Note**: If both the Python file being executed and the target file to read doesn't exist in the same directory, we need to pass the full path of the file to read, to the `open()` function.

## creating a file object

- without context manager

    > syntax:
        
        open(file_path, mode)
        file_path = (full_path or file name if the file is present in one of the dirs in the python path environment variable)

    ```python
    file = open('file.txt', 'r')
    print(file.name)
    print(file.mode)
    file.close()
    ```

    > **Note**: to avoid errors, always remember to close the files that you open.

- with a context manger

    ```python
    with open('test_file.txt', 'r') as file:
        print(file.name)
        print(file.mode)
    ```
    > **Note**: after we exit the block of `with` it automatically closes the file for us + this will alos close the file if any exceptions were thrown and that's why using context mangers is considered a best-practice. It takes care of all the clean up for us.

    > **Note**: we have access to the `file` file object variable even after we exit the context manager. But the file will just be closed.

    ```python
    with open('file.txt', 'r') as file:
        pass
    print(file.closed) # output: True
    print(file.read()) # output: ValueError: I/O operation on a closed file.
    ```

## file object methods

- `.read()`

    it is useful for reading contents of small file (all at once).

    ```python
    with open('file.txt', 'r') as file:
        contents = file.read()
        print(contents)
        
    '''
    output:
    1) line.
    2) line.
    3) line.
    4) line.
    5) line.
    6) line.
    7) line.
    8) line.
    9) line.
    10) line.
    '''
    ```

    > **Note**: if you have a large file, you definitly don't want to load all of that file contents into memory (because may be you run out of memory). There's other methods for reading file contents other than `.read()`.


    you can control the number of files to read from a file

    ```python
    with open('file.txt', 'r') as file:
        contents = file.read(100)
        print(contents)
    
        # it picked up from it left off
        contents = file.read(100)
        print(contents)

        # when .read() reaches the end of a file it returns an empty string
        contents = file.read(100)
        print(contents)

    '''
    output:
    1) line.
    2) line.
    3) line.
    4) line.
    5) line.
    6) line.
    7) line.
    8) line.
    9) line.
    10) line.
    '''
    ```


- `.readlines()`

    **returns** a list of all lines of the contents of a file.

    ```python
    with open('file.txt', 'r') as file:
        contents = file.readlines()
        print(contents)

    '''
    output:
    ['1) line.\n', '2) line.\n', '3) line.\n', '4) line.\n', '5) line.\n', '6) line.\n', '7) line.\n', '8) line.\n', '9) line.\n', '10) line.\n']
    '''
    ```

- `.readline()`

    **returns** a line from the contents of a file every time it's called (top to bottom) for each line.

    ```python
    with open('file.txt', 'r') as file:
        contents = file.readline()
        print(contents, end='')

    '''
    output:
    1) line.
    '''
    ```

    > **Note**: file objects are iterators (aka: they have the `__next__()` method).

- __next__()

    of course, you don't wanna read the entire contents of a file at once (so that you don't run out of memory) & you don't want to use `.readline()` thousounds of times.

    **The solution**: iterate through lines of the files using the `for` loop because the file object is an iterator.

    ```python
    with open ('test_file.txt', 'r') as file:
        for line in file:
            print(line, end='')
    ```

    > **Note**: this is effecient because you are not reading in all of the contents of the file all at once, so it is not a memory issue that we have to worry about. It is gonna go through and get one line at a time from a file.


- smart `.read()`

    there is a smart way that can allows to read our file's contents in chunks instead of all at once.

    a simple techniqu for reading a large file using the `.read()`

    ```python
    with open('test_file.txt', 'r') as file:
        size_to_read = 100
        contents = file.read(size_to_read)

        while len(contents) > 0:
            print(content, end='*')
            contents = file.read(size_to_read)
    ```

    > **How The Techniuque works**?  
    > since we don't know exactly how long is the file we are trying to read, we gonna use a loop that reads small chunks at a time from the file.

    to know the current position reading the file you can use `.tell()`

    ```python
    with open('test_file.txt', 'r') as file:
        size_to_read = 100
        contents = file.read(size_to_read)
    
        print(file.tell()) # output: 100 because it has read 100 chars.

        while len(contents) > 0:
            print(content, end='')
            print(file.tell())
            contents = file.read(size_to_read)
    ```


- `.seek()`

    allows us to seek for a specific position in file.Gives more control.    

    ```python
    with open('test_file.txt', 'r') as file:
        size_to_read = 10
        contents = file.read(size_to_read)
        print(contents, end='')
    
        file.seek(0)
    
        contents = file.read(size_to_read)
        print(contents, end='')
    ```

- `.write()`

    allows writing to a file.

    > **Note**: becareful when using `.write()` because if the file you are trying to write to exists, it will overwrite it.

    > **Note**: you don't have to write any thing to the file in order for it to be created. Just `open('file.txt', 'w')`.

    ```python
    with open('file.txt', 'w') as file:
        pass
    ```

    > **Note**: you can also `.seek()` while writing to a file.

    ```python
    with open('file.txt', 'w') as file:
        file.write('test')
        file.write(' best')
        
        file.seek(0)
        file.write('w')

    # output: west best
    ```

## copying files

- using the obvious easy way

    ```python
    with open('test_file.txt', 'r') as read_from_file:
        content = read_from_file.readlines()    

    with open('test_file_copy.txt', 'w') as write_to_file:
        write_to_file.writelines(content)
    ```

- using another readable optimized way

    ```python
    with open('test_file.txt', 'r') as rf:
        with open('test_file_cp.txt') as wf:
            for line in rf:
                wf.write(line)
    ```

## working with media

instead of reading and writing characters, we will read and write bytes.

```python
with open ('image.jpg', 'rb') as rb:
    with open ('image_copy.jpg', 'wb') as wb:
        for l in rb:
            wb.write(l)
```

doing the same thing but in chunk sizes

```python
with open ('image.jpg', 'rb') as rb:
    with open ('image_copy.jpg', 'wb') as wb:
        chunk_size = 4096
        rb_chunk = rb.read(chunk_size)
        while len(rb_chunk) < 0:
            wb.write(rb_chunk)
            rb_chunk = rb.read(chunk_size)
```

> **Tip**: search for 'how to work with temporary files and in-memory files'

[2] https://stackabuse.com/file-handling-in-python/