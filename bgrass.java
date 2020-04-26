import java.util.Scanner;

public class bgrass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int col = input.nextInt();
        char[][] grass = new char[rows][col];

        for (int i = 0; i < rows; i++) {
            String temp = input.next();
            for (int j = 0; j < col; j ++) {
                grass[i][j] = temp.charAt(j);
            }
        }

        int counter = 0;

        for (int row2 = 0; row2 < rows; row2 ++) {
            for (int col2 = 0; col2 < col; col2 ++) {

                if (grass[row2][col2] == '#') {
                    counter++;
                    if (col2 != col - 1) {
                        if (grass[row2][col2 + 1] == '#') {
                            grass[row2][col2 + 1] = '.';
                        }
                        }
                    if (row2 != rows - 1) {
                        if (grass[row2 + 1][col2] == '#') {
                            grass[row2 + 1][col2] = '.';
                        }
                    } 
                }

            }
        }
        System.out.println(counter);
        input.close();

        
    }

}
