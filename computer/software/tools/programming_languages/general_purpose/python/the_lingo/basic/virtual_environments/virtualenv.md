# virtual environments in python

a virtual environment is a way for us to have a specific environment for each project or application that we are building (so that each project has its own python version and its own packages).[2]

> **Tip**: It's considered best practice to create a virtual environment for each project you create. Because if you used the global installation of python, as soon as you update to the next version of python or update your packages then it could break some of your older apps that were running just fine. So it's best to split thoseup using a virtual environment.

## venv [3]

is a standard library built-in module for v.envs management.

> **Note**: requires `python 3.3+`

> **Tip**: it's conventional naming the environment '`venv`'.

### creating a v.env
- 
    ```bash
    python -m venv venv_name
    ```

    > **Note**: `-m` tells python to search the `sys.path` and execute the module as the main module (e.g: in the example above, the `venv` module is executed as the main module and that module expects an  env_name as an argument) 

### activating a v.env
- 
    [GNU/linux]
    ```bash
    source venv_name/bin/activate
    ```
-    
    [windows]
    ```bash
    venv_name/Scripts/activate.bat
    ```


### checking if v.env is activated
-
    [GNU/linux]
    ```bash
    (env_name) which python
    ```
-
    [windows]
    ```bash
    (env_name) where python
    ```

<u>_or_</u>

-
    ```bash
    (env_name) python
    >>> import sys
    >>> sys.executable
    ```

### deactivating a v.env
-    
    ```bash
    (env_name) deactivate
    ```

### changing version of python

-
    ```bash
    you will need to use virtualenv instead.
    ```

### list installed packages in the v.env
-
    ```bash
    (env_name) pip list
    ```

### Exporting packages
-
    exporting v.envs is not possible. You can only export packages.

    ```bash
    (env_name) pip freeze > requirements.txt
    ```

    ```bash
    (env_name) pip install -r requirements.txt
    ```

### removing a v.env
-
    ```bash
    just remove the directory
    ``` 
-
    [GNU/linux]
    ```bash
    $ rm  -rf env_name
    ```  
-  
    [windows]    
    ```bash
    > rmdir env_name /s 
    ```

### create an environment with access to system-packages
-
    > **Tip**: it's recommended to create a requirements.txt file with the packages you want instead.

    ```bash
    python -m venv venv --system-site-packages
    ```
-
    check using
    ```bash
    (venv) pip list
    ```
-
    list the packs in this env only
    ```bash
    (venv) pip list --local
    ```
    <u>_or_</u>
    ```bash
    (venv) pip freeze --local
    ```

### why v.evn
1. very simple
1. doesn't have the bills and whistles of other v.envs managers.
1. suitable for 99.9% of the projects out there

### workflow
-
    ```bash
    mkdir proj
    python -m venv proj/venv
    source proj/venv/bin/activate
    pip install -r requirements.txt
    ```

    > **Tip**: don't put any of your project files inside of `env_name` file. Because the environment should be something that can be thrown away and rebuilt.

    > **Tip**: don't commit your v.env to a source control (`.gitignore` usually has virtual envirtonments). But you can commit your `requirements.txt` file to your source control.



## virtualenv

### install

```bash
pip install virtualenv
```

### create a virtaul environment using virtualenv

```bash
virtualenv name_of_the_env --no-site-packages
```

### activating the venv

```bash
activate
```

```bash
deactivate
```

## pipenv [2]

is a new way to combine package management with virtual environments.

> **Note**: before pipenv, we used pip for pakcage management and virtualenv for handling virtual environments. But now with pipenv, all of this can be handled by simple one tool.

> **Note**: pipenv is a highly recommended packaging tool from the [python.org](python.org).

> **Note**: a lot of companies are switching over from `pip` to `pipenv` 

- pip:  
    is a way to install additional packs that allows us to add a ton of functionality that doesn't exist in the python standard library (e.g: doing image manipulation using the Pillow lib).

### installing `pipenv`

```bash
pip install pipenv
```

### creating a project

- old method  
    1. navigate to the directory of the project.
    1. create a virtual environment.
    1. manually activate the environment.
    1. start installing the packages (dependencies) for that project.

- `pipenv` method  
    this is all built-in together now.
    > **Note**: instead of creating a new virtual environment manually. We are simply gonna install the packs that we wasnt using the pipenv.
    1. navigate to the directory of the project.
    1. install dependencies (packages that the project depends on) with `pipenv install`.

    > **Note**: you can also install multiple packages at the same time using: 

    > **Note**: you can use `requirements.txt` with `pipenv` but its not recommended unless your team uses it.  Better use `pipfile` s.
    
    ```bash
    pipenv -r requirements.txt
    ``` 

    ```bash
    pipenv lock -r > requiremets.txt
    ```

### how pipenv works?

1. first of all, it checks to see if the current directory has a virtual environment or not.
2. if the project has the v.env, it starts installing the packs.
3. if the project doesn't have a v.env, it creates a new v.env for it.
4. it shows a pipfile location.
> **Note**: a pipfile is a file that contains info that describes the environment and how it can be built back from scratch. It's similar to the `requirements.txt` (a file that contains which packages have been installed and what version of theses packs were used) file and it will be a replacement to the `requirements.txt` file  within `pipenv`.
5. it shows the version of python used and its location.
6. it shows the location of the virtual env.     
> **Note**: the virtual environment created by `pipenv` is the same as any regular v.env. You can navigate to the location shown and activate the environment manually but `pipenv` gives us simpler commands to interact with the env eaisly.
7. after finishing the package installation, it adds the package to the `pipfile` [packages].
8. if the pipfile.lock (a file that we are not suppose to touch, it just a file that gets generated and produces determinstic builds ) is not found, it creates it.

### activating a v.env

```bash
pipenv shell
```

### run a command inside a v.env

```bash
pipenv run
```

### more about pipfile and pipfile.lock

- pipfile
    1. the format the pipfile is using is `toml` (which is designed to be a minimal format that mostly contains keys and values within different sections).
    1. pipfile disection
        - the `[[source]]` section: that shows where we are downloading packages from.
        - the `[packages]` section: contains installed packages.
            > **Note**: `requests= "*"` means that we didn't specify a specific version of the package when we installed it.
            > **Note**: everytime that you run `pipenv install` without specifing a specific version, it will see if there's newer versions available and if there are, it will update those versions automatically.
        - the `[devpackages]`

### deactivate

```bash
exit
```

### run

you can run scripts and apps without the need to activate the environment using:

```bash
pipenv run python
```

```bash
pipenv run python script.py
```

> **Note**: pipenv starts a new sub-shell session with the virtualenv pathing instead of changing the pathing in the current shell session. That is why deactivate does not work. you need to exit the shell session. the `exit` command or `CTRL-d` will do the trick.

### dev environment

some packages are needed for projects in the dev environment but not in production. (e.g: using pytest to test code but we don't want pytest to be included when we ship our code to production) To do this:

```bash
pipenv install pytest --dev
```

### uninstalling packages

```bash
pipenv uninstall pytest
```

### changing versions

- old method

    1. export the requirements
    1. delete the environment
    1. recreate it from scratch

- `pipenv` method

    1. change the version in the `pipfile`
    1. recreate the v.env with the newer version

    ```bash
    pipenv --python 3.6
    ```

    or

    1. remove the env completly (`pipenv --rm`)
    1. recreate it from scratch using the pipfile (`pipenv install`)

> **Note**: you can check the path to your v.env by `pipenv --venv`.

> **Note**: you can eaisly check for known security vernubilities for any installed packages (`pipenv check`).

### dependency graph

helps in debugging conflicting dependencies

```bash
pipenv graph
```

> **Note**: the `pipfile` isn't deterministc, but the `pipfile.lock` is. The `pipfile.lock` has the exact hashes and verisons for specific packs that are currently used in project. But, the pipfile might just tell `pipenv` to grapthe latest version of a package.

> **Note**: getting the latest version is fine in development but when pushing to production, you wanna know that you are pushing the exact versions of the packages that have already passed all of your testing.

> **Tip**: once you 've tested all of your code and you are ready to push what you have so far, then you can create or update the `pipfile.lock` with the current dependencies by saying: `pipenv lock`. once that's done, then you can take the `pipfile.lock` and move to the production environment. And once you are ready to install everything that is in the `pipfile.lock`, then you can run: `pipenv install --ignore-pipfile` and that will create an environment using the `pipfile.lock` ignoring the `pipfile` that is usually used by default.

### Manage environment variables

1. create `.env` file
1. add `SECRECT_KEY="stuff"`
1. `pipenv run python`
1. `import os`
1. `os.environ['SECRET_KEY']`

> **Tip**: add the `.env` file to the `.gitignore` file. because that file contains sensitie info like db connection strings and passwords ...etc.

### removing an environment

```bash
pipenv --rm
```

## How to Manage multiple projs, env.vars, and v.envs?[4]



# Resources
- [[2] corey ](https://www.youtube.com/watch?v=zDYL22QNiWk&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=22)
- [[3] corey ](https://www.youtube.com/watch?v=Kg1Yvry_Ydk&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=24)