import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int s = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[n];
    	
    	st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < arr.length; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		arr[i] = Math.abs(s - num);
    	}
    	
    	int result = arr[0];
    	
    	for(int i = 1; i < arr.length; i++) {
    		result = gcd(result, arr[i]);
    	}
    	
    	System.out.println(result);
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