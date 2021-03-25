import pygame
import random
from pygame import *
im = image.load('ball.png')
done = False

ballx = 0
bally = 0
ballxmove = 1
ballymove = 1

init()
scr = display.set_mode((640,320))
display.set_caption('SARATH_MOUSEGAME')



while done ==False:
                    scr.fill(0)
                    scr.blit(im , (ballx , bally))
                    display.update()
                    time.delay(5)
                    ballx=ballx+ballxmove
                    bally=bally+ballymove
                    if ballx>640:
                            ballxmove=-1
                    if ballx<0:
                            ballxmove=1
                    if bally>320:
                            ballymove=-1
                    if bally<0:
                            ballymove=1
                            
                    for e in event.get():
                                if e.type==KEYUP:
                                            if pygame.event.key==K_ESCAPE:
                                                            sys.exit()
                                                            pygame.exit()
                                           # if pygame.event.key==K_SPACE:
                                                             
