# Debugging Django

## Steps

1. click on the "debug" button
2. click on "create a launch.json" option
3. start debuting
4. add breakpoints
5. step over lines
6. step into functions that you need to navigate
7. add important variables to the "watch" view
8. once done. remove breakpoints
9. you can use "run without debugging" to start the app fro withing vscode

## Django Debug Toolbar

- [django debug toolbar docs](https://django-debug-toolbar.readthedocs.io:)

### Installation

- `pipenv install django-debug-toolbar`

### config

1. add django debug toolbar to settings

```py
# settings.py
INSTALLED_APPS = [
    ...,
    'debug_toolbar'
]
```

2. add a route to urls config module

```py
from django.urls import path, include
import debug_toolbar

urlpatterns = [
    ...,
    path('__debug__', include(debug_toolbar.urls))
]
```

3. Enable middleware in settings

> **Note:** we use middleware to hook into django's request-response processing

```py
# settings.py
MIDDLEWARE = [
    'debug_toolbar.middleware.DebugToolbarMiddleware'
]
```

4. add internal ips list ot your settings (the debug toolbar is shown only for the the ips listed in the `INTERNAL_IPS`).

```py
# settings.poy
INTERNAL_IPS = [
   '127.0.0.1'
]
```

> **Note:** remember, the toolbar only appears if the page has proper html document (aka: follows the structure of html > head + body).