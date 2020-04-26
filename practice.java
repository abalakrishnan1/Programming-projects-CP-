import java.util.Random;
import java.util.Scanner;

public class practice {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int[] histogram = new int[10];
        int numberofSamples = input.nextInt();
        for (int i = 0; i < numberofSamples; i ++) {
            int rand = random.nextInt(10);
            histogram[rand]++; 
        }
        for (int j = 0; j < 10; j ++) {
            double percent = (double) histogram[j] / numberofSamples;
            System.out.printf(j + "%s%.2f", percent);
            System.out.println(" ");
        }
        input.close();
    }
    
}