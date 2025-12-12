#sum
def sum(num):
  if num:
    # Recursive function
    return num+sum(num-1)
  else:
    return 0
  
result = sum(10)

# Print result
print(result)