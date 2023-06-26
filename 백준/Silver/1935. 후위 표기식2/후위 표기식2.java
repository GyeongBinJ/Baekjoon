import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	String input = br.readLine();
    	Double[] arr = new Double[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = Double.parseDouble(br.readLine());
    	}
    	
    	Stack<Double> stack = new Stack<Double>();
    	
    	for(int i = 0; i < input.length(); i++) {
    		char ch = input.charAt(i);
    		
    		// ch가 문자인 경우
    		if(ch >= 'A' && ch <= 'Z') {
    			// 65만큼 빼면 index 파악 가능
    			stack.push(arr[ch - 65]);
    		} else {
    			if(!stack.isEmpty()) {
    				double firNum = stack.pop();
    				double secNum = stack.pop();
    				
    				switch (ch) {
    				case '+':
    					stack.push(secNum + firNum);
    					break;
    				case '-':
    					stack.push(secNum - firNum);
    					break;
					case '*':
						stack.push(secNum * firNum);
						break;
					case '/':
						stack.push(secNum / firNum);
						break;
					
					}
    			}
    		}
    		
    		
    	}
    	
    	System.out.printf("%.2f", stack.pop());
    	
    	
	}
	
}