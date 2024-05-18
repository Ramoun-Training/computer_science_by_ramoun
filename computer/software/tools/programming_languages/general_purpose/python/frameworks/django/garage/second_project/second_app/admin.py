"""Admin Models Registration"""

from django.contrib import admin
from second_app.models import User, Community

# Register your models here.
admin.site.register(Community)
admin.site.register(User)
