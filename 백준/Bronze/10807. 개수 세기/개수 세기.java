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

		int[] arr = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i]) {
				result++;
			}
		}
		
		bw.write(result + "\n");
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}