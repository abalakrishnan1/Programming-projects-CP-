import java.util.Scanner;

public class sym {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int counter = 0;
        while (n % 2 == 1 && m % 2 == 1) {
            counter *= 4;
            counter++;
            n = (n - 1)/2;
            m = (m - 1)/2;
        }
        System.out.print(counter);
        input.close();
    }

}