import java.util.Scanner;

public class echo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        int comLimit = Math.min(s1.length(), s2.length());

        int count1 = 0;
        int count2 = 0;

        for (int i = comLimit; i >= 0; i --) {
            String sub1 = s1.substring(0, i);
            String sub2 = s2.substring(s2.length() - 1, i + 1);
            if (sub1.equals(sub2)) {
                count1 = sub1.length();
                break;
            }
        }

        for (int i = comLimit; i>= 0; i --) {
            String sub2 = s2.substring(0, i);
            String sub1 = s2.substring(i, 0);
            
        }


        input.close();
    }

}