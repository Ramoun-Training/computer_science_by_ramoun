# this tutorial provided by Dev Ed
# link of the video: https://www.youtube.com/watch?v=Bg9r_yLk7VY


import requests # http requests functionality
from bs4 import BeautifulSoup as soup
import smtplib
import time

url = 'https://egypt.souq.com/eg-en/sauvage-by-dior-for-men-eau-de-parfum-60ml-32499793/i/'

def check_price():

    headers = {"User-Agent": 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36'}

    page = requests.get(url, headers=headers)

    html_page = soup(page.content, 'html.parser')

    # title = html_page.h1.get_text()

    price = html_page.find_all('h3', class_="price is sk-clr1")[0].get_text()

    price = float(price.strip()[:5].replace(',',''))

    if price <= 1100:
        send_email()
    else:
        print('nothing sent!')


def send_email():
    server = smtplib.SMTP('smtp.gmail.com', 587)
    server.ehlo()
    server.starttls()
    server.ehlo()

    server.login('omartarekramoun@gmail.com', 'dswojwsfmlsbbrfe')

    subject = "the price fell down, mr ramoun"
    body = f'''
    you can check out the following link:
    {url}
    '''

    msg = f'Subject:{subject}\n\n{body}'

    server.sendmail(
        'omartarekramoun@gmail.com',
        'omarramoun16@gmail.com',
        msg
    )

    print('email sent!')

    server.quit()

if __name__ == '__main__':
    while True:        
        check_price()
        time.sleep(100)