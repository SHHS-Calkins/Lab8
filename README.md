# Lab_8_Battleship_TEMPLATE_Final

In this assignment, you will create a simple class for playing the game battleship. Battleship is played on a square grid of 10 rows and 10 columns, which you will represent using a 2-D array in a class named Board. A separate class, Battleship, will allow you to try playing your game and see whether the methods work as planned.

To play battleship, 2 players secretly add ships of various lengths to their individual boards. A ship may be placed horizontally or vertically on the board. In your program, you will represent blank squares on the board using the String "-", and squares where ships have been added with the String "b". For example, the board below contains 3 boats, 2 of length 5 and one of length 3:

- - - - - - - - - - 
- b b b - - - b - - 
- - - - - - - b - - 
- - - - - - - b - - 
- - - - - - - b - - 
- - - - - - - b - - 
- - - - - - - - - - 
- - b b b b b - - - 
- - - - - - - - - - 
- - - - - - - - - - 

Players then take turns to try and shoot the ships on each other's boards by choosing a row and column reference for each attempted shot. When a player chooses a square containing a ship, that square is marked as a “hit”: in your program, this will be done using the String "x". When the player “misses” by choosing a blank square this will be marked with the String "m" in your program. The game is over when one player has shot every square containing part of a ship on their opponent's board. The board below is from a game in progress. One ship has already been completely destroyed and 2 squares of one of the other ships have been shot.

- - - - - - - m - - 
- x x x - - m x - - 
- - - - - - - x - - 
- - - m - - - b - - 
- - - - - - - b - - 
- m - - - - - b - - 
- - - - m - - - - - 
- - b b b b b - m - 
- - - - - - - - - - 
- - - - - m - - - - 

The specification for the Board class is as follows:
Variables

private String[][] squares - An array which represents the board on which a player places their battleship and records shots.
Constructors

public Board() - This constructor initializes the squares array with every value set to "-", which is the String used to represent a blank square.
Methods

    public String toString() - Returns a multi-line representation of the board by concatenating all the values in squares with a new line for each row and spaces separating the Strings in each row.

    public boolean addShip(int row, int col, int len, boolean horizontal) - Attempts to add a ship of length len to the grid, starting at the row and column specified and proceeding either rightwards (if horizontal is true), or downwards (if horizontal is false). If the ship can be placed in the place specified, each square making up the ship should be set to "b", and the method should return true. A ship may not be placed if it would go off the grid, or would intersect another ship on the grid. If the ship cannot be placed, no values in squares should be changed and the method should return false.
    
    public boolean foundShip(int len) - Search the board for any possible ships of length len. If there are exactly len consecutive squares (either horizontal or vertical) containing a "b" String somewhere in the grid, then return true, otherwise, return false.

    public int shoot(int row, int col) - If row and col specify a square which is out of bounds, the method should return -1. If the square at the specified row and column contains "-" (i.e. is blank), the square should be changed to "m" to signify a miss, and the method should return 0. If the square contains "b" (i.e. a battleship which hasn't been hit yet) this square should be changed to an "x" to signify a hit, and the method should return 1. If the square contains either "x" or "m" the method should return 2 (these are squares which have already been “shot”).

    public boolean gameOver() - Returns true only when the board contains no un-sunken ships. Otherwise, return false.

Along with your Board class there is another class in a separate file named Battleship. This class is a simple implementation of a game which allows you to add ships to a single Battleship board using user input and shoot at these ships. A sample run of the main method from this class is shown below.
Sample Run

Welcome to Battleship!

Type "a" to add new ship, "b" to see the board, "p" to play or "q" to quit.
a
Starting in which row?
2
Starting in which column?
3
How long?
3
Horizontal (h) or vertical (v)?
h

New ship added!

Type "a" to add new ship, "b" to see the board, "p" to play or "q" to quit.
p

You need ships of length 3 and 4 to play!

Type "a" to add new ship, "b" to see the board, "p" to play or "q" to quit.
a
Starting in which row?
4
Starting in which column?
1
How long?
4
Horizontal (h) or vertical (v)?
v

New ship added!

Type "a" to add new ship, "b" to see the board, "p" to play or "q" to quit.
p

Ok, let's play!

Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
5
Input column
6

Miss!

Press "s" to shoot at a square, "b" to see the board, "q" to quit
b

- - - - - - - - - -
- - - - - - - - - -
- - - b b b - - - -
- - - - - - - - - -
- b - - - - - - - -
- b - - - - m - - -
- b - - - - - - - -
- b - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -


Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
2
Input column
3

Hit!

Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
2
Input column
4

Hit!

Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
2
Input column
5

Hit!

Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
2
Input column
5

You already tried that

Press "s" to shoot at a square, "b" to see the board, "q" to quit
b

- - - - - - - - - -
- - - - - - - - - -
- - - x x x - - - -
- - - - - - - - - -
- b - - - - - - - -
- b - - - - m - - -
- b - - - - - - - -
- b - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -


Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
4
Input column
1

Hit!

Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
5
Input column
1

Hit!

Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
6
Input column
1

Hit!

Press "s" to shoot at a square, "b" to see the board, "q" to quit
s
Input row
7
Input column
1

Hit!

Game over!

You should run the game several times and try different inputs - this uses the methods from your Board class, so these will all need to produce the correct results and outputs if the program is to work as desired. You can also add, edit, or isolate code to help you with testing specific features if you wish. Don't however add a main method to your Board class to test methods or your code won't be scored correctly.
Milestones

As you work on this assignment, you can use the milestones below to inform your development process:

Milestone 1: Write the constructor code: you need to initialize the squares variable, and then set every cell in squares to "-" by using nested loops. Write the toString method, again using nested loops to print all values separated by spaces and with line breaks in appropriate positions. Test these methods by running the Battleship class (throughout this program you can type "b" to print the toString representation of the Board being used).

Milestone 2: Write the addShip method. It may be helpful to split this method into two parts: one where the parameter horizontal is true, the other where it is false. In each case you will need to use if statements to determine whether all parts of the ship are on the board, then iterate through the intended squares for the ship to determine whether there is already a ship in the way. If the ship can be placed you can iterate through the relevant squares again, changing them to "b". Don't forget to add returns to indicate what the outcome of placing the ship is. Test your method thoroughly using the runner class.

Milestone 3: Write the foundShip method. Again you will probably need to think about horizontal and vertical cases separately: you will need to check for both types of ship in this method. When iterating through consecutive squares (either horizontal or vertical) you will need a variable to keep track of the length of a continuous row of squares containing "b". Remember to check the value of this and reset it when there is a non-"b" square or the end of a row/column is reached.

Milestone 4: Write and test the shoot method. This method just requires testing the value of that square using if statements, and returning the appropriate value, and changing the value of that square if necessary. Write the gameOver method for which you just need to iterate through all values in squares again, and return false if any is a "b", returning true if all are not equal to "b". Run the full Battleship program multiple times with different inputs to test all the different features.

NOTE: In our game of Battleship, two ships are not allowed to neighbor one another and instead need at least one square of open ocean, "-", between them. All grading inputs will only involve valid boards with spaced out battleships. Below is an example of an invalid board, also containing three boats, two of length 5 and one of length 3.
Invalid Board Example:

- - - - - - - - - - 
- - - - b b b b - - 
- - - - - - - b - - 
- - - - - - - b - - 
- - - - - - - b - - 
- - - - - - - b - - 
- - - - b b b b b -
- - - - - - - - - -  
- - - - - - - - - - 
- - - - - - - - - - 
