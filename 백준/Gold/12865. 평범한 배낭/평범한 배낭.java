import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static Integer[][] dp;
	static int[] wArr;
	static int[] vArr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		wArr = new int[n];
		vArr = new int[n];
		
		dp = new Integer[n][k + 1];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			wArr[i] = Integer.parseInt(st.nextToken());
			vArr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(knapsack(n - 1, k));
		
	}
	
	static int knapsack(int i, int k) {
		
		if(i < 0) {
			return 0;
		}
		
		if(dp[i][k] == null) {
			
			if(wArr[i] > k) {
				dp[i][k] = knapsack(i - 1, k);
			}
			
			else {
				dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - wArr[i]) + vArr[i]);
			}
		}
		
		return dp[i][k];
	}
}
	