import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	sb.append("<");
    	
    	for(int i = 1; i <= n; i++) {
    		queue.offer(i);
    	}
    	
    	while(!queue.isEmpty()) {
    		for(int i = 0; i < k; i++) {
    			if(i == k - 1) {
    				int num = queue.remove();
    				
    				if(queue.size() == 0) {
    					sb.append(num);
    				} else {
    					sb.append(num).append(", ");
    				}
    			} else {
    				queue.offer(queue.remove());
    			}
    		}
    	}
    	
    	sb.append(">");
    	System.out.println(sb);
	}
	
}