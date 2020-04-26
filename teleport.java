
/*
id: a.balak
LANG: JAVA
TASK: Teleport
*/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class teleport {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("teleport.in"));
        PrintWriter pw = new PrintWriter(new File("teleport.out"));

        int a = input.nextInt();
        int b = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();

        int distance1 = Math.abs(a - b);
        int distance2 = Math.abs(a - x) + Math.abs(b - y);
        int distance3 = Math.abs(a - y) + Math.abs(b - x);
        int minDistance = Math.min(Math.min(distance1, distance2), distance3);
        pw.println(minDistance);
        pw.close();
        input.close();

    }

    
}