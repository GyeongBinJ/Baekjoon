import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(tile(n));
		
	}
	
	public static int tile(int n) {
		
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		
		int val1 = 1;
		int val2 = 2;
		int sum = 0;
		
		for(int i = 2; i < n; i++) {
			sum = (val2 + val1) % 15746;
			val1 = val2;
			val2 = sum;
		}
		
		return sum;
	}

}
	