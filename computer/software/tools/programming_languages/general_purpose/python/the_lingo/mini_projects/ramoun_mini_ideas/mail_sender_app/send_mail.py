import smtplib
from guietta import _, Gui, Quit, PG, ___, III, VS, QFileDialog, HSeparator

class GUI:

    def __init__(self, **kwargs):
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
            [   ['Send'], Quit]
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
        for name, value in kwargs:
            self.gui.widgets[name].setText(value) # name='sender' value='omarramoun@gmail.com'
    
    def run(self):
        self.gui.run()


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

gui.run()