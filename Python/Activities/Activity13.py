def sum(numbers):
	sum1 = 0
	for num in numbers:
		sum1 += num
	return sum1

#list
list = [5, 1, 12, 13, 25, 77, 43, 21]
result = sum(list)

# Print result
print("The sum of all the elements is: " + str(result))