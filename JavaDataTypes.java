import java.util.*;
public class JavaDataTypes {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i = 0; i<t; i++) {
			try {
				long x = input.nextLong();
				System.out.println(" can be fitted in: ");
				if(x>= -128 && x<= 127)
					System.out.println("* byte");
				if(x>= -Math.pow(2,15) && x<=Math.pow(2, 15)-1)
					System.out.println("* short");
				if(x>= -Math.pow(2, 32) && x<=Math.pow(2, 32)-1)
					System.out.print("* int");
				if(x>= -Math.pow(2, 63) && x<= Math.pow(2, 63)-1)
					System.out.println("* Long");
			}
			catch(Exception e) {
				System.out.println(input.next()+ " Cant be fitted anywhere.");
			}
		}
	}

}
