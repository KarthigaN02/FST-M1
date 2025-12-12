fruits = {
    "apple": 50,
    "banana": 10,
    "grapes": 25,
    "pineapple": 20
}

input = input("Required Fruit :  ").lower()

if(input in fruits):
    print("Yes, available")
else:
    print("No, Not available")