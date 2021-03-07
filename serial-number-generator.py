print("provide the lower and upper limit of the serial numbers to be generated")
a=int(input("enter lower limit :"))
b=int(input("enter upper limit :"))

for i in range(a,b+1):
	print(i,",",end = '')
