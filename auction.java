import java.util.Arrays;
import java.util.Scanner;

/*
bales = first input
farmer = second input
sort array

*/
public class auction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bales = input.nextInt();
        int farmers = input.nextInt();
        int[] prices = new int[farmers];
        for (int i = 0; i < prices.length; i ++) {
            prices[i] = input.nextInt();

        }
        Arrays.sort(prices);
        int counter = 1;
        int total = 0;
        int maxTotal = 0;
        int keepPrice = 0;
        for (int index = prices.length - 1; index >= 0; index --) {
            
            total = counter * prices[index];
            if (total > maxTotal) {
                maxTotal = total;
                keepPrice = prices[index];
            }
            if (bales == counter) {
                break;

            }
            counter++;
        }

        System.out.printf("%d %d", keepPrice, maxTotal);
        input.close();
    }

}