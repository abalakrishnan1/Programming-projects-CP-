import java.util.Scanner;


public class charms {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int numCharms = input.nextInt();
        int nailSpot = input.nextInt();
        int measure = input.nextInt();
        if (measure < length) {
            for (int i = 0; i < numCharms; i ++) {
                int charmLength = measure;
                int position = input.nextInt();
                int totalLength = Math.abs(position - nailSpot) + charmLength;
                System.out.println(totalLength);
            }
        }

        for (int i = 0; i < numCharms; i ++) {
            int charmLength = input.nextInt();
            int position = input.nextInt();
            int totalLength = Math.abs(position - nailSpot) + charmLength;
            System.out.println(totalLength);

        }
        input.close();
    }

}