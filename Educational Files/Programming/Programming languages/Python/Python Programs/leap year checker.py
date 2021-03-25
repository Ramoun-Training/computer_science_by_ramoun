from calendar import *
from time import *
try:
	def leap(year):

		TF=isleap(year)

		#verb determination
		if year>localtime()[0]:
			verb='will be'
		elif year<localtime()[0]:
			verb='was'
		elif year== localtime()[0]:
			verb='is'
        
		#leap year determination
		if TF :#==True:
			print('%s:%s a leap year.'%(year,verb))
		else:
			print('%s:%s not  a leap year'%(year,verb))

	while True:
		print('Welcome To Is It Leap? Program')
		year=int(input('Enter the year:'))
		leap(year)
		again=input('\nWanna Try Again <y> or <n>:')
		again=again.strip()
		if again.lower() =='y':
			continue
		elif again.lower()=='n':
			print('Thanks for trying the program.')
			print("...bye...bye...bye....")
			print('\nProd.by:R}am#un>\n')
			break
		else:
			print('Not a valid answer.Please Enter "y" or "no"')
			continue

except:
	print('Error ,please Enter a valid Year input.')
	print('Restart the program and try againe.')
