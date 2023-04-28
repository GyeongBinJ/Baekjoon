import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		StringBuffer sb = new StringBuffer(str);
		String reStr = sb.reverse().toString();
		
		if(str.equals(reStr)) {
			bw.write("1");
		} else {
			bw.write("0");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
		
}
