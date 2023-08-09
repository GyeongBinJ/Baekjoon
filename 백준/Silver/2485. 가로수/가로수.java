import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] trees = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		trees[i] = Integer.parseInt(br.readLine());
    	}
    	
    	Arrays.sort(trees);
    	
    	int gcd = 0;
    	
    	for(int i = 0; i < n - 1; i++) {
    		int distance = trees[i + 1] - trees[i];
    		gcd = gcd(distance, gcd);
    	}
    	
    	System.out.println((trees[n - 1] - trees[0]) / gcd + 1 - trees.length);
    	
	}
	
	public static int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
	
}