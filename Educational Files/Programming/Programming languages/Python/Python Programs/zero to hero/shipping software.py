country=input("Country: ").lower()
total=float(input("Total Order: "))
if country=='canada':
    province=input('What is your \
province? ').lower()
    if province=='alberta':
        total=total+(total*(0.05/100))
        print('There is 0.05% GST.')
        print('Then:\nTotal Cost: %.3f $'%total)
    elif province=='ontario' or \
         province=='new brunswick' or\
         province=='nova scotia':
        print("There is(.13%) Harmonized\
sales tax.")
        total=total+(total*(0.13/100))
        print('Then:\nTotal Cost: %.3f $'\
              %total)
    else:
        print('{0:s} province charges\
(0.06%) provencial sales tax + (0.05%)GST.'\
              .format(province))
        total=total+(total*(0.06/100)+\
                     (total*(0.05/100)))
        print("Then:\nTotal Cost: %.3f $"%total)
else:
    print('No Taxes Charged.')
    print('Then:\nTotal Cost: %.3f $'%total)
        
