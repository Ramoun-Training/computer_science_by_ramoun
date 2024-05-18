"""second_app / models"""

from typing import Union
from django.db import models


# Create your models here.
class Community(models.Model):
    """Community Model"""

    name: Union[str, models.CharField] = models.CharField(max_length=256, unique=True)

    def __str__(self) -> str:
        return str(self.name)


class User(models.Model):
    """User Model"""

    name: Union[str, models.CharField] = models.CharField(max_length=256)
    email: Union[str, models.EmailField] = models.EmailField(
        max_length=320, unique=True
    )
    community: Union[str, models.ForeignKey] = models.ForeignKey(
        Community, on_delete=models.CASCADE
    )

    def __str__(self) -> str:
        return str(self.name)
