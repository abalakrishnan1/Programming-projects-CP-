import java.util.Arrays;
import java.util.Scanner;

public class shelf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), bookH = input.nextInt();
        int[] cowStack = new int[n];
        for (int i = 0; i < n; i ++) {
            cowStack[i] = input.nextInt();

        }
        Arrays.sort(cowStack);

        int counter = 0;
        int tempHeight = 0;
        for (int j = cowStack.length - 1; j >= 0; j --) {
            counter ++;
            tempHeight += cowStack[j]; 

            if (tempHeight >= bookH) {
                System.out.print(counter);
                break;

            }
         }
        input.close();
    }

}