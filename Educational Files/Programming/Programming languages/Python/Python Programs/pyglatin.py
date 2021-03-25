def PygLatin():
	
	print("<<Welcome to PygLatin translator>>")

	pyg='ay'
	original=input("Enter an English word:")
	if len(original)>0 and original.isalpha()==True:
		word=original.lower()
		first_letter=word[0]
		translated=word[1:]+first_letter+pyg 
		#You can use the [1:len(word)] way and it will give the same result.
		print("The Word Translation : %s"%translated)
		return
	else:
		print('Please,Enter letters only.\n')
		return PygLatin()
