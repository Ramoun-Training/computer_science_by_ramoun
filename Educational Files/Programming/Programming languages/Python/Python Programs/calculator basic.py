print(('welcome to the Basic calclulator').title())
def operation(op):
	num1=eval(input("Enter the first number:"))
	num2=eval(input("Enter the second number:"))
	if op =='+':
		result=str(num1 + num2)
		print('The Result:',result)
	elif op=='-':
		result=str(num1 - num2)
		print('The Result:',result)
	elif op=='/':
		result=str(num1 / num2)
		print('The Result:',result)
	elif op=='*':
		result=str(num1 * num2)
		print('The Result:',result)		
def calculator():
	while True:
		print('OPTIONS:')
		print('Enter "+" to ADD two numbers.')
		print('Enter "-" to SUBTRACT two numbers.')
		print('Enter "×" to MULTIPLY two numbers.')
		print('Enter "÷" to DIVIDE two numbers.')
		print('Enter "Q" to QUIT.')

		user_input=input("Enter:")

		if user_input.lower()=='q': 
			print('see you later...bye...')
			break
		elif user_input=='+':
			operation('+')
			agian()
		elif user_input=='-':
			operation('-')
			agian()
		elif user_input=='×':
			operation('*')
			agian()
		elif user_input=='÷':
		 	operation('/')
		 	agian()
		else:
			print('Please,Enter a valid option.')
			


#Remember:
#eval function gives u the varity to enter int or flaot			