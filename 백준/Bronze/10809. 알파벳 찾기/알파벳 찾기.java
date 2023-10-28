import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			sb.append(str.indexOf(ch) + " ");
		}
		System.out.println(sb);
		
		br.close();
		
		
	}
		
}
