package topic05learningaids;

/**
 * Describe the nature of 2D arrays.
 * Construct algorithms with 2D arrays.
 */
public class NoughtsAndCrosses {

    // TODO: declare char 2D array here
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
            System.out.println("---------------");
            for (int col = 0; col < grid[0].length; col++) { // jump to col (horizontally)
                if(col == 0){
                    System.out.print("  ");
                }
                if(col == 0){
                    System.out.print("  ");
                } 
                System.out.print(grid[row][col] + "  |  ");
            }
            System.out.println("");
        }
        System.out.println("---------------");
    }

    public static boolean horizontalCheck(int row, char symbol) {
        // TODO
        return false;
    }

    public static boolean verticalCheck(int col, char symbol) {
        // TODO
        return false;
    }

    public static boolean diagonalCheck(int col, char symbol) {
        // TODO
        return false;
    }

    public static boolean isWinningMove(int col, char symbol) {
        return diagonalCheck(col, symbol) || verticalCheck(col, symbol) || horizontalCheck(col, symbol);
    }
}