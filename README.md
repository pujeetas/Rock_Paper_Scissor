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
