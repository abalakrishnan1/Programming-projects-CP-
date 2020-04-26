import java.util.Scanner;

public class cowtip {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        boolean[][] grid = new boolean[size][size];
        for (int i = 0; i < grid.length; i ++) {
            String temp = input.next();
            for (int j = 0; j < grid.length; j ++) {
                char c = temp.charAt(j);
                grid[i][j] = (c == '1');
            }
        }
        int count = 0;
        for (int row = grid.length - 1; row >= 0; row --) {
            for (int collumn = grid.length - 1; collumn >= 0; collumn --) {
                if (grid[row][collumn] == true) {
                    count ++;
                    //set for loop less than/equal to current collumn
                    for (int r = 0; r < grid.length; r ++) {
                        for (int c = 0; c <= collumn; c++) {
                            //toggle
                            if (grid[r][c] == true) {
                                grid[r][c] = false;
                            } else {
                                grid[r][c] = true;
                            }
                        }

                    }
                }
            }
        }
        System.out.print(count);
        input.close();
    }

}