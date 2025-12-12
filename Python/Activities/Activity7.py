numbers = input("Enter Numbers: ").split(",")
sum = 0
for number in numbers:
  sum += int(number)

print(sum)