import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static Integer[] rDp;
	static Integer[] lDp;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		rDp = new Integer[n];
		lDp = new Integer[n];
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = -1;
		
		for(int i = 0; i < n; i++) {
			LIS(i);
			LDS(i);
		}
		
		for(int i = 0; i < n; i++) {
			max = Math.max(rDp[i] + lDp[i], max);
		}
		
		System.out.println(max - 1);
		
	}
	
	static int LIS(int n) {
		
		if(rDp[n] == null) {
			rDp[n] = 1;
			
			for(int i = n - 1; i >= 0; i--) {
				if(arr[i] < arr[n]) {
					rDp[n] = Math.max(rDp[n], LIS(i) + 1);
				}
			}
		}
		
		return rDp[n];
	}
	
	static int LDS(int n) {
		
		if(lDp[n] == null) {
			lDp[n] = 1;
			
			for(int i = n + 1; i < lDp.length; i++) {
				if(arr[i] < arr[n]) {
					lDp[n] = Math.max(lDp[n], LDS(i) + 1);
				}
			}
		}
		
		return lDp[n];
	}
}