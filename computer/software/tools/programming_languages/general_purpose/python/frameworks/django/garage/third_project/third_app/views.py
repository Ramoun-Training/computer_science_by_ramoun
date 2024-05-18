"""
third_app.views
"""

from django.shortcuts import render
from django.http import HttpResponse


# Create your views here.
def index(_request):
    """simple index welcome"""
    return HttpResponse("<h1>welcome to the city 🐍</h2>")


def bye(request):
    """sending the bye page with cool css"""
    bye_insert = {
        "page_title": "Bye 👋",
        "page_heading": "Bye Bye 👋, see you Next Time",
    }
    return render(request, "third_app/bye.dj.html", bye_insert)
