#!/usr/bin/env python3
import smtplib
from guietta import _, Gui, Quit, PG, ___, III, VS, QFileDialog, HSeparator
# from guietta import *

class GUI(Gui):
    '''a new class based on the Gui class'''
    '''inheritance of Gui is possible, but this is easier'''

    def __init__(self, **kwargs):
        '''
        initializing funciont for the gui,
        :param: kwargs: the default values for the reciever, sender, subject,...etc
        '''

        # we can create a gui object as a subobject for the self but that would be harder
        # i.e: self.gui = Gui([],[],[], title="title")
        lists = [
            [ '<center>MINI E-MAIL SENDER</center>'],
            [ HSeparator ],
        
            [  'Enter reciever email:'],
            [   '__reciever__'],
            [  'Enter your email:'],
            [   '__sender__'],
            [  'Enter subject:'],
            [   '__subject__'],
            [  'Enter message:'],
            [   '__msg__'],
            [   ['Send'], Quit]
        ]

        title = 'Mini E-Mail Sender'

        Gui.__init__(self, *lists, title=title)
        

        self.events(
            [_],
            [_],
            [_],
            [_],
            [_],
            [_],
            [_],
            [_],
            [_],
            [_],
            [send_msg , _]
        )

        # self.gui.sender = 'omartarekramoun@gmail.com' # readable but not gonna work for us here
        for name, value in kwargs.items():
            self.widgets[name].setText(value) # name='sender' value='omarramoun@gmail.com'                


def send_msg(gui):
    reciever = gui.reciever 
    sender = gui.sender 
    subject = gui.subject 
    msg = gui.msg 

    server = smtplib.SMTP('smtp.gmail.com', 587)
    server.ehlo()
    server.starttls()
    server.ehlo()
    server.login('omartarekramoun@gmail.com', 'dswojwsfmlsbbrfe')

    full_msg = f'Subject:{subject}\n\n{msg}'

    server.sendmail(
        sender,
        reciever,
        full_msg
    )

    print('email sent!')

    server.quit()
    

app_gui = GUI(sender="omartarekramoun@gmail.com", reciever="omarramoun16@gmail.com")
# mygui.gui.title("Mini E-Mail Sender")
# mygui.gui.

# with app_gui.Send:
    # send_msg(app_gui)

# print(dir(app_gui))

# app_gui.layout.setFixedSize(300,300)
# print(app_gui.layout.)

# print(app_gui)


app_gui.run()

# Gui.layout.setMaximumSize()
# Gui.layout.setMinimumSize()
# Gui.layout.setMinAndMaxSize()