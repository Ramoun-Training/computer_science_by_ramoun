def madlips():
	print("lets play a game.")

	name=input("Enter your name:")
	verb=input("Enter a verb ('ing' form):")
	relative=input("Enter type of relative:")
	adjective=input("Enter the adjective:")
	noun=input("Enter the noun:")

	print("My Dear,",relative,name,"was",verb,"when"\
	,"he/she was attacked by a",adjective,noun)

#madlips v.2.0
def madlips2():
	print("this another version [professional] one")

	story='''My Dear,{} {} was {} when he/she 
	{} {} by {}'''

	name=input("Enter your name:")
	relative=input("Enter type of relative:")
	adjective=input("Enter the adjective:")
	noun=input("Enter plural noun:")

	verbs=[]
	verbs.append(input("Enter the first verb:"))
	verbs.append(input("Enter the second verb:"))

	final=story.format(relative,name,verbs[0],verbs[1],adjective,noun)

	print(final)