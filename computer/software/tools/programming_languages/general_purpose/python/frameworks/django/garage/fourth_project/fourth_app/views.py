from django.shortcuts import render


def index(request):
    return render(request, "index.html")


def soso(request):
    return render(request, "index.html", {"name": "soso"})
