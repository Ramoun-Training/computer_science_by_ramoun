while True:
    try:
        number = int(input('pick an integer number: '))
    except ValueError:
        print("It's not a number!\n")
        continue

    print("It's a number")
        
    if number % 4 == 0: 
        print("The number " + str(number) + " is multiple of 4 and a even number")
    elif number % 2 == 0: # if is multiple of 2 and if is even number
        print("The number " + str(number) + "is a even number")
    else: #is odd number
        print("The number " + str(number) + "is a odd number") 
    break


