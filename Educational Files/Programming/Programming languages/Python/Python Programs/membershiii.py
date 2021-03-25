#membership operators 
def membership():
	text=input("Enter a one word with no 's':")
	if "s" not in text  and text.isalpha()==False :
		print("Please,Enter only one word with no 's'")
		return membership()
	else:
		utext=text.upper()
		print('u can enter  a word with x and see what happens.')
		if 'X' in utext:
			print('%s:I like the "X" in that word'%text)
			print("let\'s change that")
			utext=utext.replace('X','6')
			finaltext=utext.strip()
			print(finaltext.lower())
def membership2():
	word=input('Enter one English word:')
	if word.isalpha():
		if 'ing' in word:
			print('i think that your word is a verb.\n')
			print('pasty pasty!!!\n')
			word=word.replace('ing','ed')
			print('The Word:',word)
		else:
			print('\nWanna try again with a word with "ing" suffix')	
			yn=input('<y> or <n>:')
			if yn=='y':
				membership2()
			elif yn =='n':
				print('Thank you for trying our program...bye...')
			else:
				print('\anot a valid answer..\a')
				return
	else:
		print('please,Enter only one English word.:.')
		membership2()			
def listmembership():
	l=input('Enter the sting:')
	if l.isalpha() :
		print('Please,Enter a phrase with spaces:')
		return listmembership()
	else:
		l=l.split()
		for word in ['fuck','shit']:
			if word in l:
				print('sorrry sir,please, do not entrer bad words')
			else:
				l.reverse()

# membership()

Best wishes R}am#un> 