**Game Overview**
In this game:

The user is prompted to enter a choice: Rock, Paper, or Scissors.
The computer randomly selects one of the three options.
The winner is determined based on the following rules:
Rock beats Scissors
Scissors beats Paper
Paper beats Rock
If both the user and the computer choose the same option, the game is a tie.

**Game Rules**
Rock beats Scissors.
Scissors beats Paper.
Paper beats Rock.
If both the player and the computer make the same choice, it's a tie.

**Features**
*Score Tracking*
Tracks and displays the number of wins, losses, and ties for both the user and the computer after each round.
Keeps a running score of wins, losses, and ties, allowing players to see how they’re doing after each match.
*Game Rounds Limit*

Allows the user to set the number of rounds at the beginning of the game.
Displays an overall winner at the end based on the total scores from all rounds.
*Simple Console UI*

Prompts the user for their choice each round.
Displays both the user's and computer's choices as well as the result of each round.

**Code Structure**
The game is split into three Java classes:

Choice.java:

Responsible for handling the logic of getting the user's input and the computer's random choice.
Ensures valid input from the user.
Game.java:

Contains the checkWinner() method that determines the winner based on the choices made by the user and the computer.
Calls methods from Choice.java to get the choices.
Main.java:

The entry point of the game.
Initializes the game by creating a Game object and calling the checkWinner() method to determine and display the result.
