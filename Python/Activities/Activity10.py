# Given tuple
inputList = (1, 10, 5, 25, 16, 28, 37, 99, 115)
print("Input: ", inputList)

# Numbers divisible by 5:
print("Output : Numbers divisible by 5-")
for num in inputList:
    if (num % 5 == 0):
        print(num)