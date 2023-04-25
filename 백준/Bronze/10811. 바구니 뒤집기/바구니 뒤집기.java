import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			while(start < end) {
				int val = arr[start];
				arr[start] = arr[end];
				arr[end] = val;
				
				start++;
				end--;
				
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}