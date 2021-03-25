def cube(n):
	return n**3
def by (e):
	if e %3==0:
		return cube(e)
	else:
		return False

x=by(9)
print(x)
#always remember to add return if your calling a function outta function
#remember to include a 'return' every time your going out a function or 
#finishing one.
input()