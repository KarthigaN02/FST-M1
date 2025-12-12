# Get the users names
player1 = input("Player 1: ")
player2 = input("Player 2:")

	
while True:
# Get the users choices
    player1_answer = input(player1 + ", do you want to choose rock, paper or scissors? ").lower()
    player2_answer = input(player2 + ", do you want to choose rock, paper or scissors? ").lower()

    # Run the algorithm to see who wins
    if player1_answer == player2_answer:
        print("It's a tie!")
    elif player1_answer == 'rock':
        if player2_answer == 'scissors':
            print(player1+ "- Rock wins!")
        else:
            print(player2+"- Paper wins!")
    elif player1_answer == 'scissors':
        if player2_answer == 'paper':
            print(player1+"- Scissors win!")
        else:
            print(player2+"- Rock wins!")
    elif player1_answer == 'paper':
        if player2_answer == 'rock':
            print(player1+"- Paper wins!")
        else:
            print(player1+"- Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    
    # Ask them if they want to play again
    repeat = input("Do you want to play another round? Yes/No: ").lower()

    # If they say yes, don't do anything
    if(repeat == "yes"):
        pass
    # If they say no, exit the game
    elif(repeat == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit