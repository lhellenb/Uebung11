package h2;

public class H2_main {
	public static void main(String[] args) {
		benchmark(30);
	}
	
	
	public static void benchmark(int n) {
		long startRekursiv = System.nanoTime();
		int result1 = fibonacci(n);
		long endRekursiv = System.nanoTime();
		System.out.println("Ergebnis Fibonacci Rekursiv: " + result1);
		System.out.println("Zeit, die die Methode gebraucht hat: " + (endRekursiv - startRekursiv)+ " Nanoseconds");
		
		long startCached = System.nanoTime();
		int result2 = fibonacciCached(n);
		long endCached = System.nanoTime();
		System.out.println("Ergebnis Fibonacci Cached: " + result2);
		System.out.println("Zeit, die die Methode gebraucht hat: " + (endCached - startCached) + " Nanoseconds");
		
		long startIterativ = System.nanoTime();
		int result3 = fibonacciIterativ(n);
		long endIterativ = System.nanoTime();
		System.out.println("Ergebnis Fibonacci Iterativ: " + result3);
		System.out.println("Zeit, die die Methode gebraucht hat: " + (endIterativ - startIterativ) + " Nanoseconds");
		
	}
	
	
	public static int fibonacci(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	static int[] a = new int[1000];
	public static int fibonacciCached(int n) {
		if(n==1) {
			return a[0]=1;
		}
		if(n==2) {
			return a[1]= 1;
		}
		if(a[n] != 0) {
			return a[n];
		}
		return a[n]= fibonacciCached(n-1) + fibonacciCached(n-2);
	}
	
	
	public static int fibonacciIterativ(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
		}
		int begin1 = 1;
		int begin2 = 1; //Anfangswerte
		int current = 0;
		for(int i=3; i<=n;i++) {
			 current = begin1 + begin2;
			 begin2 = begin1;   //begin2 erhöhen
			 begin1 = current;	 //begin1 erhöhen
		}
		return current;
	}

}
