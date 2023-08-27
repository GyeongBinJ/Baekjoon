import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static Long[] arr = new Long[101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr[0] = 0L;
		arr[1] = 1L;
		arr[2] = 1L;
		arr[3] = 1L;
		
		int t = Integer.parseInt(br.readLine());
		
		while(t--> 0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(padovan(n));
		}
		
	}
	
	public static long padovan(int n) {
		if(arr[n] == null) {
			arr[n] = padovan(n - 2) + padovan(n - 3);
		}
		
		return arr[n];
	}
	
}