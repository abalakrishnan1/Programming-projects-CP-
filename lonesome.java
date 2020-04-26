import java.util.Scanner;

public class lonesome {

    public static void main(String[] args) {
        int cow1 = 0;
        int cow2 = 0;
        int maxDistance = 0;
        Scanner input = new Scanner(System.in);
        int[][] coordinates = new int[input.nextInt()][2];
        for (int row = 0; row < coordinates.length; row ++) {
            for (int col = 0; col < coordinates[row].length; col ++) {
                coordinates[row][col] = input.nextInt();
            }
        }
        for (int row1 = 0; row1 < coordinates.length - 1; row1 ++) {
            for (int row2 = row1 + 1; row2 < coordinates.length; row2 ++) {
                int subx = coordinates[row1][0] - coordinates[row2][0];
                int suby = coordinates[row1][1] - coordinates[row2][1];
                int max = subx*subx + suby*suby;

                if (max > maxDistance) {
                    maxDistance = max;;
                    cow1 = row1 + 1;
                    cow2 = row2 + 1;
                }
            }
        }
        System.out.println(cow1 + " " + cow2);
        input.close();
    }
}