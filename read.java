//4 16 10
import java.util.Scanner;


public class read {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();

        for (int i = 0; i < k; i ++) {
            int speed = input.nextInt();
            int conTime = input.nextInt(); 
            int rest = input.nextInt();
            int full = conTime * speed;
            int remainingPages = n;
            int totalTime = 0;
            while (remainingPages > 0) {
                remainingPages -= full;
                totalTime += conTime;
                totalTime += rest;
            }
            if (remainingPages != 0) {
                int remains = remainingPages % full;
                int rate = remains / speed;
                totalTime += rate;
                if (rate > conTime) {
                    totalTime += rest;
                }
            }
            System.out.println(totalTime);

        }
        input.close();
    }

}