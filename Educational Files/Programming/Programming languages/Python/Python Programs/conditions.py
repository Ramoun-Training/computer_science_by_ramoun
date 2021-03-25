#conditions in python are different
#Python assumes (zero ,null) -->> False
#Python assumes (non-zero,non-null)-->>True
stinck=input("Enter the stinckest thing ever:")
name=input("Enter your name:")
age=input("Enter your age:")

if stinck=="" or name=="" or age=="":
	print("Please ,Enter valid names.")
else:
	story='''the ugly {} {} has {} years old'''
	fianl=story.format(stinck,name,age)
	print(fianl)