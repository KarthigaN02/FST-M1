# Given lists
firstList = [1, 2, 3, 4, 5]
secondList = [11, 12, 13, 14, 15]
# Print the lists
print("First List ", firstList)
print("Second List ", secondList)

# Declare a new list
newList = []

# Get odd numbers from first list
for num in firstList:
    if (num % 2 != 0):
        newList.append(num)
        
#Get odd numbers from second list
for num in secondList:
    if (num % 2 == 0):
        newList.append(num)

# Print result
print("Result:")
print(newList)