# 1/16/2018
import math

list_of_primes = [ 2 ]
class numPrime(object):
	
	def isPrime(n):
		for x in list_of_primes:
			if n % x == 0:
				return False
		list_of_primes.append(n)
		return True
	#def numAlreadyDefined(n):
	#	for x in list_of_primes:
	#		if n == x:
	#			return True
	#	return False

	x = 3
	while len(list_of_primes)<=999:
		#print(len(list_of_primes))
		isPrime(x)
		x+=1
	print(x-1) #must subtract 1 to undo that x+=1. May be a bit messy, but it's the easiest way