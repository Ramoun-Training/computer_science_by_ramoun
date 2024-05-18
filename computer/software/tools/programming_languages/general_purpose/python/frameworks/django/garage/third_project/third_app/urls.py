"""
third_app . urls
"""

from django.urls import path
from third_app import views

urlpatterns = [
    path("", views.index, name="index"),
    path("bye/", views.bye, name="bye"),
]
