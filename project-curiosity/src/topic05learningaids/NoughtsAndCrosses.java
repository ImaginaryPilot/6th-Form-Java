package topic05learningaids;

/**
 * Describe the nature of 2D arrays.
 * Construct algorithms with 2D arrays.
 */
public class NoughtsAndCrosses {

    // declare char 2D array here
    static char[][] grid;
    
    public static void main(String[] args) {
        // allocate memory for my grid
        grid = new char[3][3];
        displayGrid();

        // Filling the first row with crosses
        grid[0][0] = 'X';
        grid[0][1] = 'X';
        grid[0][2] = 'X';

        displayGrid();
    }

    public static void displayGrid() {
        // key lesson is navigating through the 2D array
        // using nested for loops
        for (int row = 0; row < grid.length; row++) { // jump to row (vertically)
            System.out.println("-------------------");
            for (int col = 0; col < grid[0].length; col++) { // jump to col (horizontally)
                // this is only for pretty display reasons
                if (grid[row][col] == 0) {
                    grid[row][col] = ' ';
                }
                System.out.print("|  " + grid[row][col]);
                // if we are at the edge of a row close the grid
                if (col == 2) {
                    System.out.print("  |");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }

    public static boolean horizontalCheck(int row, char symbol) {
        for (int i = 0; i < grid[row].length; i++) {
            if (grid[row][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean verticalCheck(int col, char symbol) {
        for (int row = 0; row < grid.length; row++) {
            if (grid[row][col] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean diagonalCheck(char symbol) {
        if(grid[1][1] != symbol) {
            return false;
        }
        for(int row = 0; row < grid.length; row = row + 2) {
            for(int col = 0; col < grid[0].length; col = row + 2){
                if(grid[row][col] != symbol) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWinningMove(int col, char symbol) {
        return diagonalCheck(symbol) || verticalCheck(col, symbol) || horizontalCheck(col, symbol);
    }
}
