import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] arr;
	public static Integer[] dp;
	public static int max;
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	arr = new int[n];
    	dp = new Integer[n];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	dp[0] = arr[0];
    	max = arr[0];
    	
    	search(n - 1);
    	
    	System.out.println(max);
	}
	
	public static int search(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(search(n - 1) + arr[n], arr[n]);
			
			max = Math.max(dp[n], max);
		}
		
		return dp[n];
	}
}	