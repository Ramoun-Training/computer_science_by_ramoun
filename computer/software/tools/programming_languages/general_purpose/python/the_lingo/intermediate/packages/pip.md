# Pip

## Getting Help

```bash
pip help
```

```bash
pip help install
```

## Searching for Packages

```bash
# searches for package online
pip search pytest
```

## Installing Packages

```bash
pip install pytest
```

## Listing all Installed Packages

```bash
pip list
```
## Listing outdated Packages

```bash
pip list -o
```
```bash
pip list --outdated
```

## Updating Packages

```bash
pip install -U pytest
```

```bash
# updaiting all outdated packages 
pip freeze --local | grep -v '^\-e' | cut -d = -f 1 | xargs -n1 pip install -U
```


|command  |explaination  |
|---------|---------|
|pip freeze --local| shows all local packages|
|grep -v '^\-e'| skips -e package defination |
|cut -d = -f 1| sets the delimiter to and equal sign|
|xargs -n1 pip install -U| takes the output as an arg one at a time and runs that to the command pip install -U|


> **Note**: `--local` shows all local ve packages if it has access to python global packages.

## Uninstalling Packages

```bash
pip uninstall pytest
```

## Exporting Packages

```bash
pip freeze > requirements.txt
```

## Installing Packages from a `requirements.txt` file

```bash
pip install -r requirements.txt
# tac r : means we're gonna install a requirements file
```