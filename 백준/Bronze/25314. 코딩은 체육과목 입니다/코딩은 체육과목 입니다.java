import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		String str = "long int";
		
		if(x > 4 && x % 4 == 0) {
			
			for(int i = 1; i <= x / 4 - 1; i++) {
				bw.write("long ");
				
			}
		}
		
		bw.write(str + "\n");
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
		
}