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
		int[] arr = new int[Integer.parseInt(st.nextToken())];
		int m = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			// 배열의 인덱스는 0부터 시작하기 때문에 -1
			
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			int val = Integer.parseInt(st.nextToken());
			for(int j = start; j <= end; j++) {
				
				arr[j] = val;
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