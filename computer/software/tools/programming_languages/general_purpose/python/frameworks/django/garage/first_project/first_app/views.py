"""
first_app / views.py
"""

from django.shortcuts import render
from django.http import HttpResponse
from first_app.models import Webpage
from . import forms


# Create your views here.
def index(_request):
    """This function returns a simple HttpResponse object with a message."""
    return HttpResponse("Hello, Django 👋")


def projects(request):
    """This function returns a simple HttpResponse object with a message."""
    projects_map = {
        "project1": "project1: first_app",
        "project2": "project2: second_app",
    }
    return render(request, "first_app/index.html", projects_map)


def images(request):
    """a function that returns images page"""
    return render(request, "first_app/images.dj.html")


def second_mind(request):
    """a view of second mind app"""
    webpages = Webpage.objects.order_by("topic")
    topics = list(set([webpage.topic for webpage in webpages]))
    search_form = forms.SearchForm()

    if request.method == "POST":
        search_form = forms.SearchForm(request.POST)

        if search_form.is_valid():
            print("search terms: ", search_form.cleaned_data["search_text"])
            webpages = Webpage.objects.filter(
                topic__top_name__icontains=search_form.cleaned_data["search_text"]
            )
            return render(
                request,
                "first_app/second_mind.dj.html",
                {"webpages": webpages, "topics": topics, "search_form": search_form},
            )

    return render(
        request,
        "first_app/second_mind.dj.html",
        {"webpages": webpages, "topics": topics, "search_form": search_form},
    )
