# Django

## Pre-requisites

1. Python
2. OOP
3. Relational Databases

## How to study

1. take notes along the way
2. after each lesson, repeat same steps using the help of the notes
3. complete exercises

## Map

1. intro to django
2. fundamentals of web development
3. setting up dev environment
4. first django project
5. 2 essential debugging techniques
6. intro to data modeling
7. organizing models in apps
8. coding model classes


## Django: Intro

### What is django?

Django is an open-source web framework for python. And it is the most popular python framework because it helps in writing less code in less time.

#### Other python web frameworks

1. Django
2. flask
3. tornado
4. bottle
5. falcon
6. hug

### Django features

django is a batteries included framework it comes with a lot of features

1. an admin site to manage the data
2. object-relational mapper (ORM). to process db
3. authentication package
4. caching

> **Note:** someone would argue that django is bloated and slower than other frameworks. But remember performance isn't everything. There are other stuff to take into account when picking up a framework. e.g: **maturity** of the framework, **stability**, **difficulty**(learning curve), and **community** (big community = more packages + more people to goto when stuck)


### client-server model

in the client server model, **http** is the key that handles communication between client and server. the server can send multiple type of data. we are concerned with 2 (**html**, and **json**).

#### What is the difference between sending html an json?

this can be also asked as what is the difference between **CSR** and **SSR**. The answer to this is that CSR puts less pressure on the server and hence, makes the server capable of serving more clients. 

#### How CSR works?

the server provides an API (with multiple end-points) for the client to interact with.

### Virtual Environment

```sh {"id":"01HXVZAXJ44A0CV7J3CPAZNQBA"}
# we use pipenv for managing packages
pipenv install django
# active pipenv shell to be able to use only the packages installed through the virtual environement
pipenv shell
# we use django-admin to start a new project
django-admin startproject new_project . # the '.' defines the path of the project
# we use django-admin to manage django on system level
# we use manage.py to manage django on project level
python manage.py runserver 8080 # 8080: port number
```

### Configuring virtual Environment in vscode

1. `ctrl+shift+p`
1. select "select python interpreter"
2. in terminal type `pipenv --venv`
3. add path to vscode

### Django Project Structure

Each django project consists of several apps, each with specific functionality.

#### `settings.py`

inside of `settings.py` we manage the settings of the **project**.

```py
# here are all the installed apps that belong to the project
# precedence is from top to bottom (top > bottom)
INSTALLED_APPS = [
    'django.contrib.admin', # provides interface to manage the data
    'django.contrib.auth', # responsible for authenticating users
    'django.contrib.contenttypes', # 
    'django.contrib.sessions', # temporary storage on server to store user data - legacy [not used anymore]
    'django.contrib.messages', # used to display one time notifications to users
    'django.contrib.staticfiles', # used to serve static files (e.g: images, files,...etc)
    'new_app_name', # every time you create a new app, you have to add it to installed apps list
]
```

### Creating a new app

`python manage.py startapp name_of_app`

#### app folder structure

1. `migrations` folder: used to store files responsible for creating and editing tables on db via django ORM
2. `admin`: used to define how the admin interface for the app will look like.
3. `apps`: used to configure the app. (it would be better if it was named 'config' instead).
4. `models`: used to define the models for the app (the db schema).
5. `tests`: used to write tests for the app.
6. `views`: used to write request handlers. It's not really a view

### BAsic Architecture of Django

#### URLs -> Views

- **views**: have the code we want to execute in the form of functions.
- **urls**: have the mapping of urls to functions

![basic_django](./basic_django.png)

when you hit the url that ends in `sum/` the `sum()` function should be invoked.

##### Example in Code

> **Warn:** the following is not real code that we gonna write but it encapsulates the idea we wanna deliver.

```py
# views.py: module that we will define our functions (the logic)
def sum():
    return 1 + 1
```

```py
# urls.py: module that we will map the urls to functions
from views import sum
if url.endsWith('sum/'):
    sum()
```

##### All Steps

1. client sends a request to server.
2. web server running on a physical server handles the request
3. web server sends request to django
4. django sends request to `urls.py` to map requests to corresponding view function
5. view function returns a response
6. the `urls` sends back response to web server
7. web server sends response to client

### Views (`views.py`)

the `HTTP` protocol is responsible for `request -> response` interactions. It passes the `request` to django and receives the `response` from django and send it to client. the module responsible for handling incoming requests and sending back responses in django is the `views` module.

```py
# views.py
# here we define the view functions
# these are views that take request as input and return response
# request -> response
# to be more accurate their names: request handlers
# in other frameworks they are named: actions

from django.http import HttpResponse
# django.http -> package
# HttpResponse => class

# returns response object
def index(request): # request object as a parameter
    # here we can do a lot of actions:
    # pull data from db
    # send an email
    # transform data
    return HttpResponse("hello django")
```

> **Note:** the word 'view' from an architectural perspective is associated with UI (something that the user sees - this is called **templates** in django though). But here in django it is more like a controller

### Urls (`urls.py`)

This is used to map specific urls to specific matching views. So that when the server gets a request for a url, the corresponding view function gets called.

#### Mapping URLs to Views

this mapping allows us to call a View function whenever we head to a specific URL. For example: when we go to the `http:/localhost:8000/index` url, the `index()` function should be called and the `request` object should be passed to it as an argument(argument passing is handled by django and GUnicorn)

```py
# new_project/urls.py
# this is a URLConf module and it is responsible for mapping urls to view functions
# this is the main URLConf of the whole project
# each app can have also it is own URLConf

from django.urls import path # the path is a function provided by django to help us map urls to views
from name_of_app import views # now we have access to all view functions of the 'name_of_app' app

# this is what django looks for: the 'urlpatterns' variable
urlpatterns = [
    path('name_of_app/index', views.index)
    # the path function takes the following parameters
    # route: a string representing the route
    # view: a function that returns an HttpResponse object
    # the path function: returns a 'URLPattern' object
]
```

> **Note:** whenever you need more information about a function hover over it to see the signature of the function.

#### Separating URLConf based on app

this is a great way of organizing the structure of the project. if you follow the traditional way, you will find yourself repeating a lot of redundant info (e.g: for all urls under the `name_of_app` you would add `name_of_app/` at the beginning of every route which is redundant)

But there is a better way to do this:

1. go to the `name_of_app` folder.
2. add a new file to that folder and name it `urls.py` (you can name it anything but by convention it is named `urls.py`)
3. add all the routes related to the `name_of_app` app inside of this file.
4. go to the main `new_project` folder and look for the `urls.py` file which is responsible for url mapping for the whole project
5. add a reference to the `name_of_app/urls.py` file inside of `new_project/urls.py` file. This is how you keep the main `urls.py` config module informed about other `urls.py` config modules on the app level.

```py
# new_project/name_of_app/urls.py
# this file is manually created
from django.urls import path
from . import views # import index view from current directory

urlpatterns = [
    path('index/', view.index) # now you don't have to add 'name_of_app'
]
```

```py
# new_project/urls.py
from django.urls import path, include

urlpatterns = [
    path('name_of_app/', include('name_of_app.urls')) # here django will reroute all requests coming to `name_of_app` to the urls config module inside of 'name_of_app' folder (i.e: you put it in the form of 'app.urls')
    # if a request is coming to the following route: name_of_app/index,
    # django will chop off the 'name_of_app' part and will pass the rest to the urls inside of the 'name_of_app' to handle that (i.e: the 'index/' part)
]
```

> **Note:** Always remember to end your routes in a forward slash (`/`)

### Templates (`templates/`)

these are called `views` in other frameworks but it is called templates iin django.

to add templates to your project. there are 2 ways:

#### app-level way

1. create a `templates` folder inside of `name_of_app`
2. add all `.html` files inside of that folder
3. use `render` function inside of `views.py`

```py
# name_of_app/views.py
from django.shortcuts import render

def items(request):
    return render(request, 'hello.html', {'name': 'soso'})
    # render function signature
    # request: HttpRequest object (here we pass the 'request' object)
    # template_name: str or a Sequence[str]. Representing name of template
    # context?: Mapping[str, Any]. a mapping of string to anything (any datatype) which is the data passed to the template
    # returns an HttpResponse object

```

```html
<!-- name_of_app/templates/hello.html -->
<!-- name: is a dynamic value injected by the view using this template -->
<h2>Hello, {{name}}</h2>
```

```html
<!-- name_of_app/templates/hello.html -->
<!-- jinja template engine is usually used with django but you are free to choose your template engine of choice -->
{% if name %}
<h2>Hello, {{name}}</h2>
{% else %}
<h2>no one with that name here</h2>
{% endif %}
```

> **Note:** you can check this [link](https://www.fullstackpython.com/template-engines.html) for more information.

#### project-level way

1. create a `templates` folder
2. create a new folder inside of `templates`. Name it `name_of_app` sam as your app's name.color
3. add all `.html` files inside of that folder
4. use `render` function inside eof `views.py`


### Models (`models.py`)

a way to store and retrieve data from database