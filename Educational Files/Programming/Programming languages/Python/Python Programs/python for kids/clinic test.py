def clinic():
    print('welcome to ma clinic.')
    print('choose the door:')
    door=input()
    if door.lower()=='left':
        print('that is ok')
    elif door.lower()=="right":
        print('i do not know')
    else:
    	print("sorry it is not a valid answer.")
        clinic()
