import java.util.*;

public class PalidromeSol2{
    public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
	String s = input.next();
	System.out.println( s.equals( new StringBuilder(s).reverse().toString()) 
    ? "Yes" : "No" );
    }
    
}
