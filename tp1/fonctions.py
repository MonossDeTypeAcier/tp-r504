
def puissance(a,b):
	if not type(a) is int:
		raise TypeError("Only integers are allowed")
	if not type(b) is int:
		raise TypeError("Only integers are allowed")
	#c=a**b
	c=a
	i=0
	while (i<b-1):
		c=a*c
		i=i+1
	return c

