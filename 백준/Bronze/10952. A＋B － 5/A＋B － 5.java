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
		
		int a = 0;
		int b = 0;
		
		int sum = 1;
		
		while(sum != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum = a + b;
				if (sum != 0) {
	                bw.write(sum + "\n");
	            }
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}