import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

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
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				stack.push(ch);
			} else if(stack.isEmpty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}