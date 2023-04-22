import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int newM = m - 45;
		
		if(newM < 0) {
			h = h - 1;
			newM = newM + 60;
			if(h < 0) {
				h = h + 24;
			}
		}
		
		System.out.println(h + " " + newM);
	}
		
}