breakfast=['eggs','bread','salad','tomatos'];
print("Enter:\n1:saturday\n2:sunday\n3:monday")
counter=int(input("Enter a number: "))
print("today's breakfast is %s"%breakfast[counter-1]);
print('********************************************')
print("Here is a taple of breakfast food: ")
print('1:eggs\n2:bread\n3:salad\n4:tomatos')
print('\nif you wanna change any element of the taple...')
print('Enter the number of the elment:')
index=int(input());
value=input('Enter the name of the new element: ');
breakfast[index-1]=value;
print('if you wanna add new element at the end of the taple:')
new_element=input('Enter the new element: ')
breakfast.append(new_element)
print('**********************************************')
print("Here is the new taple of breakfast food: ");
print("1:%s\n2:%s\n3:%s\n4:%s\n5:%s"%(breakfast[0], breakfast[1],breakfast[2],breakfast[3],breakfast[4]))
#append:only add one item
#extend: add multiple items;
#ex: breakfast.extend(['one','two','three'])
input();
