from guietta import *
import os
import sys

print('sys:')
[print(i) for i in dir(sys)]

print('\n')

print('os: ')
[print(i) for i in dir(os)]


# server will send info automatically to my account

holder = [] # holds things comming from the server

app_gui = Gui(['nothing yet'], title='sharebox')

app_gui.run()