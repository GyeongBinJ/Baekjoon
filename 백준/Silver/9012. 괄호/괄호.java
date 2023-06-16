import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < t; i++) {
    		sb.append(result(br.readLine())).append("\n");
    	}
    	
    	System.out.println(sb);
	
	
	}
	
	public static String result(String s) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				count++;
			} else if(count == 0) {
				
				return "NO";
			
			} else {
				count--;
			}
		}
		
		if(count == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}