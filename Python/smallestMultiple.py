# 01/04/18
class SmallestMultiple:
	# Goal: Find the smallest number that is evenly divisibly by all numbers from 1-20.
	
	
	def is_divisible(n):
		for x in range(2, 21):
			if n%x != 0:
				return False
		return True

	test_value = 25000
	
	while True:
		if is_divisible(test_value):
			print(test_value)
			break
		print(test_value)
		test_value+=20