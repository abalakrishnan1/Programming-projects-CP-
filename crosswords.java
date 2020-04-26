import java.util.Scanner;

public class crosswords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        char [][] crossword = new char[n][m];

        for (int i = 0; i < n; i ++) {
            String temp = input.next();
            for (int j = 0; j < m; j ++) {
                crossword[i][j] = temp.charAt(j);
            }
        }

        int clueCounter = 0;

        for (int row = 0; row < crossword.length; row ++) {
            for (int col = 0; col < crossword.length; col ++) {
                if (crossword[row][col] == '.') {
                    if ( col == 0) {
                        if (crossword[row][1] == '.' && crossword[row][2] == '.') {
                            crossword[row][col] = 'C';
                            clueCounter++;
                        }
                        } else if (col != 0) {
                            if (crossword[row][col - 1] == '.' && crossword[row][col + 1] == '.' && crossword[row][col + 2] == '.') {
                                crossword[row][col] = 'C';
                                clueCounter++;
                        }
                    }
                    if (row == 0) {
                        if (crossword[1][col] == '.' && crossword[2][col] == '.') {
                            crossword[row][col] = 'C';
                            clueCounter++;
                        } else if (row != 0) {
                            if (crossword[row - 1][col] == '.' && crossword[row + 1][col] == '.' && crossword[row + 2][col] == '.') {
                                crossword[row][col] = 'C';
                                clueCounter++;
                            }
                        }
                    }
                }
            }
        }


        System.out.print(clueCounter);

        for (int k = 0; k < crossword.length; k ++) {
            for (int l = 0; l < crossword.length; l ++) {
                if (crossword[k][l] == 'C') {
                    System.out.printf("(%d%s%d)", (k + 1), "," , (l + 1));
                }
            }
        }
        input.close();


    }

}