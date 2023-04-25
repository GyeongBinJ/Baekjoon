import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[30];
		int[] arr2 = new int[28];
		
		for(int i = 0; i < arr2.length; i++) {
			int num = Integer.parseInt(br.readLine());
			
			arr2[i] = num;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr[i] == arr2[j]) {
					arr[i] = 0;
				}
				
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				bw.write((i + 1) + "\n");
			}			
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}