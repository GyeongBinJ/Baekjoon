import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int maxNum = 0;
		int indexNum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
				indexNum = i + 1;
			}
		}
		
		bw.write(maxNum + "\n");
		bw.write(indexNum + "");
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}