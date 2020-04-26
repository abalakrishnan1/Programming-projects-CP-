/*
ID: a.balak1
LANG: JAVA
TASK: ride
*/


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ride {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ride.in"));
        PrintWriter pw = new PrintWriter(new File("ride.out"));

        if (numberForm(sc.nextLine()) % 47 == (numberForm(sc.nextLine()) % 47)){

            pw.println("GO");
        } else {
            pw.println("STAY");
        }
        pw.close();



    }

    public static int numberForm(String t) {

        int finaln = 1;

        for (int i = 0; i < t.length(); i++)
        {
            int value = (t.charAt(i) - 64);

            finaln *= value;
        }

        return finaln;
    }
}