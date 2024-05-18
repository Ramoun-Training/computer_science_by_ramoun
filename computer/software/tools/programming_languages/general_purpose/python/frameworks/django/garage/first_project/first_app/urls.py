"""
urls for first_app
"""

from django.urls import path
from first_app import views

app_name = "first_app"

urlpatterns = [
    path("", views.index, name="index"),
    path("projects/", views.projects, name="projects"),
    path("images/", views.images, name="images"),
    path("second-mind/", views.second_mind, name="second-mind"),
]
