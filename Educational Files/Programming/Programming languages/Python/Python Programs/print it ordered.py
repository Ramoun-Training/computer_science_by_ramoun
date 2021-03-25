def ordered():
	try:
		sentence=input('Enter the sentence you want:')

		if sentence=='' or  sentence.isspace() or sentence.isdigit() or sentence.isdecimal():
			print("Please,Enter words or sentences only ,\nDo not Enter numbers or spaces.\n")
			return ordered()
		else:
			s=sentence.split()
			c=len(s)
			i=0
			while i<c:
				print('%s- %s'%(i+1,s[i]))
				i+=1
	except:
		print('Please,Do Not Enter Numbers!\n')
		return ordered()
	
