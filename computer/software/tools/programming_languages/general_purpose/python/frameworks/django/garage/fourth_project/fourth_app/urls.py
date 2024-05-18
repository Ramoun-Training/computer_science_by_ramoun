from django.urls import path
from .views import index, soso

urlpatterns = [
    path('', index),
    path('soso/', soso)
]
