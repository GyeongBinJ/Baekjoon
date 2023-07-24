import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while(true) {
    		String str = br.readLine();
    		
    		if(str.equals(".")) break;
    		
    		System.out.println(result(str));
    	}
	
	
	}
	
	public static String result(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '[') {
				stack.push(ch);
				
			} else if(ch == ')') {
				if(stack.isEmpty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
				
			} else if(ch == ']') {
				
				if(stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
				
			} 
		}
		
		if(stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}