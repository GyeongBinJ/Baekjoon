import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		queue.offer(i + 1);
    	}
    	
    	while(queue.size() != 1) {
    		queue.poll();
    		
    		queue.offer(queue.poll());
    		
    	}
    	
    	while(!queue.isEmpty()) {
    		sb.append(queue.poll());
    	}
    	
    	System.out.println(sb);
    	
	}
	
}
	