import pandas

data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

result = pandas.DataFrame(data)

# Print the DataFrame
print(result)

"""
 Write the result to CSV file
"""
result.to_csv("sample.csv", index=False)