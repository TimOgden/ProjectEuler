import math
from eulerlib import primes
# 01/23/18
# Goal: Find the sum of all prime numbers under 2,000,000
class Summation():
	ans = sum(primes(1999999))
	print("{:,}".format(ans))