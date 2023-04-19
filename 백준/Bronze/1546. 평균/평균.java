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

		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double[] arr = new double[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = Double.parseDouble(st.nextToken());;
			
		}
		
		double max = 0;
		
		for(int i = 0; i < n; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = arr[i] / max * 100;
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		bw.write(sum / n + "");
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}