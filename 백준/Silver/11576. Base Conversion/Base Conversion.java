import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	
    	int m = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine());
    	Stack<Integer> stack = new Stack<>();
    	
    	for(int i = 0; i < m; i++) {
    		stack.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	int sum = 0;
    	
    	// a진법 -> 10진법
    	for(int i = 0; i < m; i++) {
    		int num = stack.pop();
    		
    		for(int j = 0; j < i; j++) {
    			num *= a;
    		}
    		sum += num;
    	}
    	
    	// 10진법 -> b진법
    	while(sum != 0) {
    		stack.push(sum % b);
    		sum /= b;
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while(!stack.isEmpty()) {
    		sb.append(stack.pop() + " ");
    	}
    	
    	System.out.println(sb);
	}
}	
	