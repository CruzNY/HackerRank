import java.util.*;
public class SimpleArraySum{
    public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < n; i++) {
	    arr[i] = input.nextInt();
	}
	int result = simpleArraySum(n, arr);
	System.out.println(result);
    }
    static int SimpleArraySum(int n, int[] arr){
	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
	    sum += arr[i];
	}
	return sum;
    }
    
}
