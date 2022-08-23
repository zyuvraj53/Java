public class Question1 {
	public static void main(String[] args) {
		int a = 0 + (int)(Math.random() * ((100 - 0) + 1));
		System.out.println(a);
		double quotient = a/3;
		double rem = a%3;
		int ans = 0;
		if(rem != 0) {
			ans = (int) (Math.floor(quotient) + 1);
		}else {
			ans = (int) quotient;
		}
		System.out.println(ans);
	}
}
