# example: python url file_name.ext 
# plz don't forget the extension in the file name

import requests
import sys

url = sys.argv[1]
file_name = sys.argv[2]

r = requests.get(url, allow_redirects=True)


with open(file_name, 'wb') as file:
	file.write(r.content)

# for more visit:
# https://www.tutorialspoint.com/downloading-files-from-web-using-python
