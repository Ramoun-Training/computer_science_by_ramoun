"""
second app / Views
"""

from django.shortcuts import render
from django.http import HttpResponse


# Create your views here.
def index(_request):
    """This function returns a simple HttpResponse object with a message."""
    return HttpResponse("<h1>Hello, Django 👋</h1>")


def helpme(request):
    """This function returns a simple HttpResponse object with a message."""
    url_dj = "https://docs.djangoproject.com/en/3.2/"
    help_links = {
        "url_1": url_dj,
        "url_2": url_dj,
        "url_3": url_dj,
        "help_1": "link 1 for help",
        "help_2": "link 2 for help",
        "help_3": "link 3 for help",
    }
    return render(request, "second_app/index.html", help_links)


def images(request):
    """images page"""
    images_insert = {"page_title": "Images", "heading": "Welcome to images"}
    return render(request, "second_app/images.dj.html", images_insert)
