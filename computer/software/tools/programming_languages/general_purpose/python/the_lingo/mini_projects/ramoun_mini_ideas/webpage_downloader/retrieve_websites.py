import requests
import sys

link = sys.argv[1]

request = requests.get(link)

print(request.content)
