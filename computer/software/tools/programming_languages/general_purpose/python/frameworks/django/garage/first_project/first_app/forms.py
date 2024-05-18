from django import forms


class SearchForm(forms.Form):
    search_text = forms.CharField(
        required=True,
        max_length=100,
        label="Search",
        help_text="Enter a search term",
        widget=forms.TextInput(attrs={"class": "form-control"}),
    )
