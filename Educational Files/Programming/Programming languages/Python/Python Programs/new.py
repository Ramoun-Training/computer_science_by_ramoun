# try:
# 	c=input('Enter a string:')
# 	c.find('we')
# except ValueError:
# 	print('sorry but that is not the right')


def test():
	x=input('Enter:')
	if 's' in x == 1:
		print('thats GOOD')
	else:
		return test()