# env_vars

## list environment varibles list

these are the driectories where the machine looks for commands

- windows: %path% is the way to view environment variables list on windows
- linux: ehco $PATH (seprated by colon `:`)
- mac

## to see what exceutable are u using

```python
import sys
print(sys.executable)
```

> **note**: usefull for virtual environaments


## how to add a path to the environment var

```bash
# setting path for python 3.6
PATH="Library/frameworks/bin:${PATH}" # remember to add teh ${PATH} so that it adds the old value of path otherwise it will reset the path to one path
export PATH
```

restart the terminal

first directories overide other next dirs.













