# open-webpage.py

import urllib.request, urllib.error, urllib.parse

url = 'http://www.oldbaileyonline.org/browse.jsp?id=t17800628-33&div=t17800628-33'

response = urllib.request.urlopen(url)
webContent = response.read()

print(webContent[0:300])


# https://programminghistorian.org/en/lessons/working-with-web-pages
https://www.geeksforgeeks.org/get-post-requests-using-python/
https://programminghistorian.org/en/lessons/working-with-web-pages
