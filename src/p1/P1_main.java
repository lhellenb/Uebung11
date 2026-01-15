package p1;

public class P1_main {
	public static void main(String[] args) {
		System.out.println(potenz(5,2));
		System.out.println(potenzIt(5,3));
	}
	
	static double potenz(double a, int b) {
		if(b==1) {
			return a;
		}
		return a*potenz(a, b-1);
	}
	
	static double potenzIt(double a, int b) {
		double c = a;
		if(b==0) {
			return 1.0;
		}
		for(int i=1; i<b;i++) {
			c*=a;
		}
		return c;
	}

}
