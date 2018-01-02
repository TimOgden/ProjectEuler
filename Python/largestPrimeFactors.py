# My first time creating a python script
# so I apologize if it's ugly :)
import math
val = 600851475143


# n = a^2 - b^2
def FermatFactor(n):
	a = math.ceil(math.sqrt(n)) #ceiling round up to next integer
	b2 = a*a - n
	while math.sqrt(b2) % 2 != 0:
		a+=1
		b2 = a*a - n
	return a - math.sqrt(b2)

print("Largest prime factor is ")
print(FermatFactor(val))