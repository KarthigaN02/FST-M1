def fibonacci(num):
    if num <= 1:
        return num
    else:
        return(fibonacci(num-1) + fibonacci(num-2))

numberOfFib = int(input("Enter how many Fibonnaci numbers to generate: "))

if numberOfFib <= 0:
    print("Enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(numberOfFib):
        print(fibonacci(i))