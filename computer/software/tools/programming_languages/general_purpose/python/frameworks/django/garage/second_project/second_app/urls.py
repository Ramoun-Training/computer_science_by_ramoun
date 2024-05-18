"""
URL configuration for second_app app.
"""

from django.urls import path
from second_app import views

urlpatterns = [
   path("", views.index, name="index"),
    path("help/", views.helpme, name="help"),
    path("images/", views.images, name="images")
]
