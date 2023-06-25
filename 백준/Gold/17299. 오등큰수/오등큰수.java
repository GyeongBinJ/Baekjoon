import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());
    	int[] arr = new int[n];
    	int[] cntArr = new int[1000001];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    		cntArr[arr[i]]++;
    	}
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	int result[] = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		
    		while(!stack.isEmpty() && cntArr[arr[stack.peek()]] < cntArr[arr[i]]) {
    			result[stack.pop()] = arr[i];
    		}
    		
    		stack.push(i);
    	}
    	
    	while(!stack.isEmpty()) {
    		result[stack.pop()] = -1;
    	}
    	
    	for(int i = 0; i < n; i++) {
    		sb.append(result[i]).append(" ");
    	}
    	
    	System.out.println(sb);
	}
	
}