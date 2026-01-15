package p2;

public class P2_main {
	public static void main(String[] args) {
		
	}
	
	static int LogRekursiv(int a) {
		if(a==1) {
			return 0;
		}
		return 1 + LogRekursiv(a / 2);
	}
	
	static int LogIterativ(int zahl) {
		if(zahl == 1) {
			return 0;
		}
		int i = 0;
		while(zahl/ 2 != 1) {
			zahl /= 2;
			i++;
		}
		return i;
	}

}
