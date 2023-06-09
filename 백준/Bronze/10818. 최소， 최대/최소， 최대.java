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
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int maxNum = arr[0];
		int minNum = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
			if(minNum > arr[i]) {
				minNum = arr[i];
			}
		}
		
		bw.write(minNum + " " + maxNum);
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}