import java.util.Scanner;

public class bookclub {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), nq = input.nextInt(), p = input.nextInt();
        int[][] cow = new int[n][nq];

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < nq; j ++) {
                cow[i][j] = input.nextInt();
            }
        }

        for (int part = 0; part < p; part ++) {
            
            for (int row = 0; row < n; row ++) {


            }
 

        }

        input.close();
 
        
    }

}