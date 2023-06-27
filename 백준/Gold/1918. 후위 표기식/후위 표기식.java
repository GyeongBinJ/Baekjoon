import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	String input = br.readLine();
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i = 0; i < input.length(); i++) {
    		char ch = input.charAt(i);
    		
    		if(ch >= 'A' && ch <= 'Z') {
    			sb.append(ch);
    		} else {
    			switch (ch) {
    			case '*':
    			case '/':
    			case '+':
    			case '-':
    				while(!stack.isEmpty() && priority(stack.peek()) >= priority(ch)) {
    					sb.append(stack.pop());
    				}
    				stack.push(ch);
    				break;
    			case '(':
    				stack.push(ch);
    				break;
    			case ')':
    				while(!stack.isEmpty() && stack.peek() != '(') {
    					sb.append(stack.pop());
    				}
    				stack.pop();
    				break;
    				
    			default: sb.append(ch);
    				break;
    			}
    			
    		}
    		
    		
    	}
    	
    	while(!stack.isEmpty()) {
    		sb.append(stack.pop());
    	}
    	
    	System.out.println(sb);
}
	
	public static int priority (char operator) {
		
		if(operator == '*' || operator == '/') {
			return 2;
		} else if(operator == '+' || operator == '-') {
			return 1;
		} else if(operator == '(' || operator == ')') {
			return 0;
		}
		
		return -1;
	}

	
}	