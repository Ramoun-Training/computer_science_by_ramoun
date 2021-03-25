while(True):
    try:
        inputs=input('Enter your calculation:')
        print(eval(inputs))
    except:
        print("Please,Enter only numbers.")
