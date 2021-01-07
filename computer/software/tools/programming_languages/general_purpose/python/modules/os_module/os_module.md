# os_module

the os module is a built-in python module that allows us to interact with the underlying os in serveral different ways (e.g: we can navigate the file system, get file info, look up & change the environment variables, move files around ..etc).

## intro

> **Tip**: for any new module, try the `dir(moudle_name)` to see all of the attributes and mehtods available for that module.

```python
import os

print(dir(os))
```

## most useful methods

- `os.getcwd()`

    **returns** the current working directory.

    ```python
    print(os.getcwd())
    ```

- `os.chdir()`

    **changes** the current working directory.

    ```python
    os.chdir('/home/ramoun')
    ```

- `os.listdir()`

    **returns** all files & folders in the current working directory or in a custom directory.

    ```python
    os.listdir() # lists files & folders in current dir
    os.listdir('/home/') # lists files & folders in a custom directory
    ```

- `os.mkdir()` & `os.makedirs()`

    **creates** a new directory in the `CWD` or new multiple sub directories.

    ```python
    os.mkdir('new dir')
    ```

    ```python
    os.makedirs('new dir/sub dir/last dir')
    ```

    > **Note**: the difference between `os.mkdir()` & `os.makedirs()` is that the `os.makedirs()` is used to create a dir that is few levels deep, it will create all of intermediate level directories that you need.

- `os.rmdir()` & `os.removedirs()`

    they work the same as `os.mkdir()` & `os.makedirs()` but instead of **creating** dirs it **removes** them.

    ```python
    os.rmdir('new dir') # removes empty dirs only
    ```

    ```python
    os.removedirs('new dir/sub dir/last dir')
    ```

- `os.rename()`

    **renames** a directory or a file.

    ```python
    os.rename('file.txt', 'newfile.txt')
    ```

- `os.stat()`

    **returns** all available info about a file or a dir.

    ```python
    os.stat('newdir')
    os.stat('newdir').st_size # 20 bytes
    os.stat('newdir').st_mtime # modifictation time (a time stamp) # 1597402126
    ```

    > **Note**: a lot of the info shown looks gebrish, but you can look the documentation online.

    > **Note**: this kind of info is very important. I.E: if you are working with a web applicaiton that has a lot of files and directoies that have been updated or created recently and you want to know exactly when that was.

- `os.walk()`

    **traverses** the directory tree and print all of the directories and the files.

    `os.walk()` is a generator that yields a tuple of 3 values as it is walking the directory tree. Sor for each dir that it sees, it yields the **directory path**, the **directories within that path**, and the **files within that path**.

    ```python
    for dirpath, dirnames, filenames in os.walk(os.getcwd()):
        print('current path: ', dirpath)
        print('directories: ', dirnames)
        print('files: ', filenames)
        print()
    ```

    > **Tip**: this can be extremlly useful if you had a file somewhere in one of the folders on the desktop but you can't remember where it was. you can use the os.walk() method to go through all files and dirs on the desktop.

    > **Tip**: if you have a web app & you want to keep track of all of the file info within a certain dir structure.

- `os.environ()`

    **returns** a list of all environment variables in my system.

    ```python
    # let's say i want to access my home directory location by grabing the home environment variable
    
    os.environ # returns all environemnt variables
    os.environ.get('HOME') # trying to get 'HOME' envirnment variable.
    ```
- `os.path` & concatination of paths

    to concatenate or join to paths together you can use the concatenation method or the `os.path.join()` method.

    ```python
    # let's say i wanna create a new text file at my home dir
    home_dir_path = os.environ.get('HOME')
    new_file_name = 'newFile.txt'
    new_file_path = home_dir_path + '/' + new_file_name

    with open(new_file_name, 'w') as file:
        file.write('hi\n')    
    ```

    > **Note**: there is some problems with the concatenation method, it is hard to remember if all of the slashes are in the correct positions or whether or not you could be missing a slash (espcially that some paths come with slashes at the end and that will cause double slashes)

    ```python
    # the os.path.join() way
    home_dir_path = os.environ.get('HOME')
    new_file_name = 'newFile.txt'
    new_file_path = os.path.join(home_dir_path , new_file_name)

    with open(new_file_name, 'w') as file:
        file.write('hi\n')    

    ```

- `os.path`

    getting the file name of a file path

    ```python    
    print(os.path.basename('/home/ramoun/file.txt')) # output: file.txt
    ```

    getting the root dir of a file path

    ```python
    print(os.path.dirname('/home/ramoun/file.txt')) # output:  /home/ramoun
    ```

    getting the file name and the root dir of a file path seprately

    ```python
    print(os.path.split('/home/ramoun/file.txt')) # output: ('/home/ramoun', 'file.txt')
    ```

    check if a path exists

    ```python
    print(os.path.exists('home/ramoun/file.txt')) # output: False
    ```

    check if a path belongs to a directory or a file

    ```python
    # NOTE: if the path doesn't exist, it will return False
    os.path.isdir('/home/ramoun/') # output: True
    os.path.isfile('/home/ramoun') # output: False
    ```

- `os.path.splitext()`

    splitting the root of the path and the extension.

    ```python
    os.path.splitext('some/ranodom/path/file.txt') # output: ('some/ranodom/path/file', '.txt')
    ```

    > **Note**: this method is way much easier that trying to parse-out the extension using string slicing or similar methods. It is a lot easier to split it off and take the first value if you want the file name without the extension.

    > **Tip**: try `dir(os.path)`


> **Note**: if you deleted a file created through a script with the `os` module the `CWD` will change to the trash path (`/home/ramoun/.local/share/Trash/files/python tuts proj`) because python tracks files created.

# Refrences

- <span id="0">[0]</span> [my own understanding of the subject](https://mrramoun.github.io "[0] can be used or removed -> blank by default").

- <span id="1">[1]</span> [Corey Schafer](https://www.youtube.com/watch?v=tJxcKyFMTGo&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=10 "video - Youtube").
