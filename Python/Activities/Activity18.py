import pandas

dataframe = pandas.read_csv("sample.csv")

print("All values in sample CSV file: ")
print(dataframe)

# Print the values in the Usernames column only
print("Usernames:")
print(dataframe["Usernames"])

# Print the username and password of the second row
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])

#Sort the Usernames column data in ascending order and print data
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))

#Sort the Passwords in descending order and print data
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))