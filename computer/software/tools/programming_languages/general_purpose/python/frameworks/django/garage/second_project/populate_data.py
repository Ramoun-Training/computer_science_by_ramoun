"""Populate data for the second_app."""

import os

os.environ.setdefault("DJANGO_SETTINGS_MODULE", "second_project.settings")

import django

django.setup()


import random

from faker import Faker
from second_app.models import Community, User

fakegen = Faker()
communities = [
    "Python",
    "Django",
    "Flask",
    "Ruby",
    "Rails",
    "JavaScript",
    "React",
    "Vue",
    "Angular",
    "Node.js",
]


def add_community():
    """Add a community."""
    community = Community(name=random.choice(communities))
    community.save()
    return community


def add_user(name, email, community):
    """Add a user"""
    user = User(name=name, email=email, community=community)
    user.save()
    return user


def populate(n=5):
    """Populate multiple entries"""
    for _ in range(n):
        name = fakegen.name()
        email = fakegen.email()
        community = add_community()

        add_user(name, email, community)


if __name__ == "__main__":
    print("Populating DB...")
    populate()
    print("Population Successful ✅")
