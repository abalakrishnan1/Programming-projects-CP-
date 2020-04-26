import java.util.Scanner;
public class cbarn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int barnSize = input.nextInt();

        int[] cows = new int[barnSize];
        for (int cow = 0; cow < barnSize; cow ++) {
            cows[cow] = input.nextInt();
        }

        int distance = 0;
        int minDistance = 0;
        for (int set = 0; set < barnSize; set ++) {
            int startingIndex = set;
            
            for (int room = 0; room < barnSize; room ++) {
                
                int cowExpense = cows[startingIndex] * room;
                distance += cowExpense; 
                startingIndex = (startingIndex + 1) % barnSize;

            }

            if (minDistance == 0) {
                minDistance = distance;
            } else if (minDistance != 0) {
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
            distance = 0;


        } 
        System.out.print(minDistance);
    
        input.close();
    }

}