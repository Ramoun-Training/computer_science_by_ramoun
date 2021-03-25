import random
computer=random.randint(1,100)
while True:
    try:
        print('Enter a number between 1 and 100 :')
        guess=int(input())
        if guess==computer:
            print("Great!! You Guessed Right.")
            break
        elif guess>computer:
            print("Sorry!! You Guessed Wrong.")
            print("Try a Lower Number.")
        elif guess<computer:
            print("Sorry!! You Guessed Wrong.")
            print("Try a Higher Number.\n")
    except:
        print("Please,For The love Of Randy The \
Macho.")
        print('Enter Only Integer Numbers.\n')
