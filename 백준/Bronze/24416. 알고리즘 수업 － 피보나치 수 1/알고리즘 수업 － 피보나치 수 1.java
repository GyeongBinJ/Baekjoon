import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	System.out.println(fibonacci(n) + " " + (n - 2));
	}
	
	public static int fibonacci(int n) {
		int[] fib = new int[n + 1];
		fib[1] = fib[2] = 1;
		
		for(int i = 3; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		
		return fib[n];
	}
	
}
	