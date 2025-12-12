import pandas

#Read data from Excel sheet
dataframe = pandas.read_excel('Activity19.xlsx')

#Print the number of rows and columns
print("Number of rows and columns:", dataframe.shape)

#Print the data in the emails column only
print("Emails:")
print(dataframe['Email'])

#Sort the data based on FirstName in ascending order and print the data
print("Sorted data:")
print(dataframe.sort_values('FirstName'))