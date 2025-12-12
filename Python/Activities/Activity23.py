import pytest

#Create a fixture that initializes a list containing numbers from 0-10
@pytest.fixture
def numbers():

    #list containing numbers from 0-10
    listValues = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return listValues

# Write test method
def test_sum(numbers):

    # Initialize sum
    sum = 0

    # Add number in the list
    for num in numbers:
        sum += num

    # Assertion - sum of that list is 55
    assert sum == 55