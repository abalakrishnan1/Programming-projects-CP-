import java.util.Scanner;

public class hps {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int games = input.nextInt();
        int totalWins = 0;
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < games; i ++) {
            int p1 = input.nextInt();
            int p2 = input.nextInt();

            if ((p1 == 1 && p2 == 2) || (p1 == 2 && p2 == 3) || (p1 == 3 && p2 == 1)) {
                counter1 ++;
            } else if ((p1 == 1 && p2 == 3) || (p1 == 3 && p2 == 2) || (p1 == 2 && p2 == 1)) {
                counter2 ++;
            }
        }

        if (counter1 > counter2) {
            totalWins = counter1;
        } else {
            totalWins = counter2;
        }
        System.out.println(totalWins);
        input.close();


        
        
    }

}