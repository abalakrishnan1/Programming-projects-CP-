import java.util.*;
class cowsignal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int c = input.nextInt();
        int k = input.nextInt();
		
		for(int i = 0; i < r; i++) {
			String org = input.next();
			for(int numberRow = 0; numberRow < k; numberRow++) {
				for(int j = 0; j < c; j++) {
					for(int fnl = 0; fnl < k; fnl++) {
						System.out.print(org.charAt(j));
					}
				}
				System.out.println();
			}
        }
        input.close();
		
	}
}