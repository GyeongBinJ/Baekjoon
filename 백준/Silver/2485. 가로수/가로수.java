import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] trees = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		trees[i] = Integer.parseInt(br.readLine());
    	}
    	
    	int[] distance = new int[n - 1];
    	
    	for(int i = 0; i < n - 1; i++) {
    		distance[i] = trees[i + 1] - trees[i];
    	}
    	
    	int gcd = 0;
    	
    	gcd = gcd(distance[0], distance[1]);
    	
    	for(int i = 2; i < n - 2; i++) {
    		gcd = gcd(gcd, distance[i]);
    		
    		if(gcd == 1) break;
    	}
    	
    	int count = 0;
    	
    	for(int i = 0; i < n - 1; i++) {
    		count += (distance[i] / gcd) - 1;
    	}
    	
    	System.out.println(count);
    	
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