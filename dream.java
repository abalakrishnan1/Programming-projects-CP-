import java.util.Scanner;

public class dream {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int lastNumber = input.nextInt();
        int[] numbers = new int[lastNumber - firstNumber + 1];
        int[] counter = new int[10];
        for (int i = 0; i <= lastNumber - firstNumber; i ++) {
            numbers[i] = firstNumber + i;
        }

        int newNumber;
        for (int j = 0; j < numbers.length; j ++) {
            int number = numbers[j];

            while (number != 0) {
                newNumber = number % 10;
                counter[newNumber]++;
                number /= 10; 
            }
        }

        for (int k = 0; k < counter.length; k ++) {
            System.out.print(counter[k] + " ");
        }

        input.close();

    }

}