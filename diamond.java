import java.util.Scanner;
import java.util.Arrays;
public class diamond {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int diff = input.nextInt();
        int[] diamonds = new int[amount];
        for (int i = 0; i < amount; i ++) {
            diamonds[i] = input.nextInt();
        }

        Arrays.sort(diamonds);

        int keep = 0;

        for (int left = 0; left < amount; left ++) {
            for (int right = 0; right < amount; right ++) {
                if (diamonds[left] + diff >= diamonds[right]) {
                    keep = Math.max(keep, right - left + 1);
                }
            }
        }
        
        System.out.print(keep);
        input.close();

        
        
    }

}