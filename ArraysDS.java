import java.util.*;
public class ArraysDB{
    public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = input.nextInt();
	}
	for (int j = arr.length; j>0; j--) {
	    System.out.print(arr[j] + " ");
	}
    }
}
