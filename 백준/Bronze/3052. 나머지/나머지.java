import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer[] arr = new Integer[10];
		
		for(int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(br.readLine());
			
			arr[i] = num % 42;
			
		}
		
		Set<Integer> arrSet = new HashSet<Integer>(Arrays.asList(arr));
		
		bw.write(arrSet.size() + "");
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}