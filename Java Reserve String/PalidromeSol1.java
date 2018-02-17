public class PalidromeSol1{
    public static void main(String[] args) throws Exception {
	String r = "racecar";
	System.out.println(isPali(r));    }
    public static boolean isPali(String s){
	int n = s.length();
	for (int i = 0; i < (n/2); ++i) {
	    if(s.charAt(i) != s.charAt(n-i-1)){
		return false;
	    }
	}
	return true;
    }
}
