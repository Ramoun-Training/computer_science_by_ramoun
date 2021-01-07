"""
this is the first unfinished version of mini-email-sender app for desktop
i will leave it unfinished because it got bugs in it
one of the bugs can be seen clearly through debugging the performance of GUI and GUII objects
Conclusion: there is some series things i need to know and test for oop and that is why i don't get it.
after test: # conclusion : any change to self itself inside of the class is temporary
"""

import smtplib
from guietta import _, Gui, Quit, PG, ___, III, VS, QFileDialog, HSeparator

class GUI:
    '''a new class based on the Gui class'''
    '''inheritance of Gui is possible, but this is easier'''

    def __init__(self, **kwargs):
        '''
        initializing funciont for the gui,
        :param: kwargs: the default values for the reciever, sender, subject,...etc
        '''

        # we can create a gui object as a subobject for the self but that would be harder
        # i.e: self.gui = Gui([],[],[], title="title")
        self = Gui(
        
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
            [   ['Send'], Quit],
            title='Mini E-Mail Sender'
        )

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

class GUII:
    '''The Gui class is instanciated as an object and that object is a property of the GUII class or any object instanciated from it'''
    '''inheritance of Gui is possible, but this is easier'''

    def __init__(self, **kwargs):
        '''
        initializing funciont for the gui,
        :param: kwargs: the default values for the reciever, sender, subject,...etc
        '''

        # we can create a gui object as a subobject for the self but that would be harder
        # i.e: self.gui = Gui([],[],[], title="title")
        self.gui = Gui(
        
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
            [   ['Send'], Quit],
            title='Mini E-Mail Sender'
        )

        self.gui.events(
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
            self.gui.widgets[name].setText(value) # name='sender' value='omarramoun@gmail.com'                



def send_msg(gui):
    reciever = gui.reciever 
    sender = gui.sender 
    subject = gui.subject 
    msg = gui.msg 

    print(reciever)
    print(sender)
    print(subject)
    print(msg)


# setting default values




# with gui.Calculate:
    # gui.result = float(gui.a) + float(gui.b)

mygui = GUI(sender="omartarekramoun@gmail.com", reciever="omarramoun16@gmail.com")
# mygui.gui.title("Mini E-Mail Sender")
# mygui.gui.

myguii = GUII(sender="omartarekramoun@gmail.com", reciever="omarramoun16@gmail.com")

myguii.gui.run()
print(dir(mygui))
print(dir(myguii))


# Gui.layout.setFixedSize()
# Gui.layout.setMaximumSize()
# Gui.layout.setMinimumSize()
# Gui.layout.setMinAndMaxSize()