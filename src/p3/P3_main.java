package p3;

public class P3_main {
	public static void main(String[] args) {
		
	}
	
	static int KapitalZinsen(int Kapital, int n) {
		if(n==0) {
			return Kapital;
		}
		return KapitalZinsen((int) (Kapital * (1.05)), n-1);
	}

}
