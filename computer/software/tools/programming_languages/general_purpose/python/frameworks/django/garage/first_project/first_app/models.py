"""
first_app / models
"""

from typing import Union
from django.db import models


# Create your models here.
class Topic(models.Model):
    """Topic Model"""

    top_name: Union[str, models.CharField] = models.CharField(max_length=256, unique=True)

    def __str__(self) -> str:
        return str(self.top_name)


class Webpage(models.Model):
    """Webpage Model"""

    topic: Union[str, models.ForeignKey[Topic]] = models.ForeignKey(
        Topic, on_delete=models.CASCADE
    )
    name: Union[str, models.CharField] = models.CharField(max_length=256, unique=True)
    url: Union[str, models.URLField] = models.URLField(unique=True)
    notes: Union[str, models.TextField] = models.TextField(default="")

    def __str__(self) -> str:
        return str(self.name)


class AccessRecord(models.Model):
    """Access Record Model"""

    name: Union[str, models.ForeignKey[Webpage]] = models.ForeignKey(
        Webpage, on_delete=models.CASCADE
    )
    date: Union[str, models.DateField] = models.DateField()

    def __str__(self) -> str:
        return str(self.date)
