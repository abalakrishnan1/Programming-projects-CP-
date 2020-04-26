import java.util.Scanner;

public class dreamSolution2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int[] counter = new int[10];

        for (int i = firstNumber; i <= secondNumber; i ++) {
            String numS = Integer.toString(i);
            for (int string = 0; string < numS.length(); string ++) {
                char c = numS.charAt(string);
                int count = c - '0';
                counter[count]++;
            }
        }

        for (int i = 0; i < 10; i ++) {
            System.out.print(counter[i] + " ");
        }
        input.close();
    }

}