# this tutorial provided by data science Dojo
# link of the video: https://www.youtube.com/watch?v=XQgXKtPSzUI

import bs4
from urllib.request import urlopen as opurl
from bs4 import BeautifulSoup as bs


url = 'https://fashion.souq.com/eg-en/footwear/c/15215'

# opening a connection
client = opurl(url)

# load the content into a variable
html_page = client.read()

client.close()

# html parsing
page_soup = bs(html_page, "html.parser")

print(page_soup.h1)
print(page_soup.p)

