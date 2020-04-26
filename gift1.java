/*
id: a.balak1
LANG: JAVA
TASK: gift1
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

class gift1 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
        HashMap<String, Integer> tracker = new HashMap <String, Integer>();
        int numPeople = Integer.parseInt(br.readLine());
        String[] count = new String[numPeople];
        for (int i = 0; i < numPeople; i ++) 
        {
            count[i] = br.readLine();
            tracker.put(count[i], 0);
        }
        
        for (int i = 0; i < numPeople; i ++) 
        {
            String gifter = br.readLine();
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int amount = Integer.parseInt(tk.nextToken());
            int numberRecieve = Integer.parseInt(tk.nextToken());
            if (numberRecieve > 0) 
            {
                amount = amount/numberRecieve * numberRecieve;
                tracker.put(gifter, tracker.get(gifter) - amount);
                amount = amount/numberRecieve;
                for (int j = 0; j < numberRecieve; j ++ ) 
                {
                    String reciever = br.readLine();
                    tracker.put(reciever, tracker.get(reciever) + amount);
                }
            }
        }
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

        for (int i = 0; i < numPeople; i++) {

            pw.print(count[i]);
            pw.print(" ");
            pw.println(tracker.get(count[i]));
        }
        pw.close();
        br.close();
    }     
}
