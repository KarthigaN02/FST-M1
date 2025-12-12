import pytest

# Additon
def test_addition():
	num1 = 100
	num2 = 10
    
	#Additon
	sum = num1 + num2

	#Assertion
	assert sum == 110
	


#Subtraction
def test_subtraction():
	num1 = 123
	num2 = 11
    
	#Subtraction
	diff = num1 - num2

	#Assertion
	assert diff == 112

# Multiplication
def test_multiplication():
	num1 = 37
	num2 = 12
    
	#Multiplication
	prod = num1 * num2

	#Assertion
	assert prod == 444

#Division
def test_division():
	num1 = 1200
	num2 = 10
    
	#Division
	quot = num1 / num2

	#Assertion
	assert quot == 120