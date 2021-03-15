def fib(n):
	if n==0 or n==1:
		return 1
	else:
		return n*fib(n-1)
	
#print(fib(5))
#---------------------

def rec(n):
	if n:
		rec(n-1)
		print(n)
	else:
		print("AAA")
		
#rec(10)
#-----------------

def recr(n):
	if n:
		print(n)
		recr(n-1)
	else:
		print("AAA")
		
#recr(4)
#-----------------

def recrp(n,lm):
	if n<lm:
		recrp(n+1,lm)
		print(n)
	else:
		print("aaaa")
		
def recp(n,lm):
	if n<lm:
		print(n)
		recp(n+1,lm)
	else:
		print("zzzz")
	
recrp(3,8)
print("hi")
recp(3,8)



