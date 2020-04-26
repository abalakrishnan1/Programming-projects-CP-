import java.util.*;
 
public class practice2 
{
 
    public static void main(String[] args) 
    {
	    Scanner input = new Scanner(System.in);
	    int radius = input.nextInt();
	    double [] x = new double[360];
        double [] y = new double[360];
        for (int i = 0; i < 360; i++) {
		    double thetaX = Math.cos(i) * radius;
		    double thetaY = Math.sin(i) * radius;
		    double roundX = Math.round((thetaX * 100.0) / 100.0);
		    double roundY = Math.round((thetaY * 100.0) / 100.0);
		    x[i] = roundX;
		    y[i] = roundY;
        }
        for(int i = 0; i < 360; i++)
        {
		    if(i < 359){
                System.out.printf("fill~%f~~%f~%f~%f~%s\n",x[i], y[i], x[i+1], y[i + 1], "-4 oak_log");
		    }
        }
        
        input.close();
    }
}

