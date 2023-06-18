import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	Stack<Character> leftStack = new Stack<>();
    	Stack<Character> rightStack = new Stack<>();
    	
    	String str = br.readLine();
    	int m = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < str.length(); i++) {
    		leftStack.push(str.charAt(i));
    	}
    	
    	while(m--> 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		switch (st.nextToken()) {
			case "P":
				leftStack.push(st.nextToken().charAt(0));
				break;
			case "L":
				if(!leftStack.isEmpty()) {
					Character ch = leftStack.pop();
					rightStack.push(ch);
				}
				break;
			case "D":
				if(!rightStack.isEmpty()) {
					Character ch = rightStack.pop();
					leftStack.push(ch);
				}
				break;
			case "B":
				if(!leftStack.isEmpty()) {
					leftStack.pop();
				}
				break;
			}
    		
    	}
    	
    	while(!rightStack.isEmpty()) {
    		leftStack.push(rightStack.pop());
    	}
    	
    	for(Character ch : leftStack) {
    		sb.append(ch);
    	}
    	
    	System.out.println(sb);
    	
	}
	
}