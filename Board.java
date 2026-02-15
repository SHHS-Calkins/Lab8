public class Board {

  private String[][] squares;

  public Board() {
    squares = new String[10][10];
    for (int i = 0; i < squares.length; i++) {
      for (int j = 0; j < squares[0].length; j++) {
        squares[i][j] = "-";
      }
    }
  }

  public String toString() {
    String thing = "";
    for (String[] r : squares) {
      for (String c : r) {
        thing += c + " ";
      }
      thing += "\n";
    }
    return thing;
  }

  public boolean addShip(int row, int col, int len, boolean horizontal) {
    if (horizontal) {
      for (int i = 0; i < len; i++) {
        if (squares[row][col + i] == "b" || squares[row][col + i] == "x" || squares[row][col + i] == "m") {
          return false;
        }
      }
      for (int i = 0; i < len; i++) {
        squares[row][col + i] = "b";
      }
      return true;
    } else {
      for (int i = 0; i < len; i++) {
        if (squares[row + i][col] == "b" || squares[row + i][col] == "x" || squares[row + i][col] == "m") {
          return false;
        }
      }
      for (int i = 0; i < len; i++) {
        squares[row + i][col] = "b";
      }
      return true;
    }
  }

  public boolean foundShip(int len) {

    return false;
  }

  public int shoot(int row, int col) {
    switch (squares[row][col]) {
      case "b":
        squares[row][col] = "b";
        return 1;
      case "x":
      case "m":
        return 2;
      case "-":
        squares[row][col] = "m";
        return 0;
      default:
        return -1;
    }
  }

  public boolean gameOver() {
    for (String[] r : squares) {
      for (String c : r) {
        if (c == "b") {
          return false;
        }
      }
    }
    return true;
  }

}
