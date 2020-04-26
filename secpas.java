import java.util.Scanner;
public class secpas {
    public static void main(String[]  args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter = 0;
        
        for (int i = 0; i <= Math.sqrt(n); i ++) {
            int area1 = i * i;
            
            for (int j = 0; j <= Math.sqrt(n); j++) {
                int area2 = j * j;
                
                for (int k = 0; k <= Math.sqrt(n); k ++) {
                    int area3 = k * k;
                    
                    for (int l = 0; l <= Math.sqrt(n); l ++) {
                        int area4 = l * l;
                        
                        if (area1 + area2 + area3 + area4 == n) {
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
        input.close();
        
        
    }
}