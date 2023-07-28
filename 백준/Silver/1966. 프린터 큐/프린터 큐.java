import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	while(t--> 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		int n = Integer.parseInt(st.nextToken());
    		int m = Integer.parseInt(st.nextToken());
    		
    		LinkedList<int[]> qLinkedList = new LinkedList<>();
    		st = new StringTokenizer(br.readLine());
    		
    		for(int i = 0; i < n; i++) {
    			qLinkedList.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
    		}
    		
    		int count = 0;
    		
    		while(!qLinkedList.isEmpty()) {
    			
    			int[] front = qLinkedList.poll();
    			boolean isMax = true;
    			
    			for(int i = 0; i < qLinkedList.size(); i++) {
    				
    				if(front[1] < qLinkedList.get(i)[1]) {
    					
    					qLinkedList.offer(front);
    					
    					for(int j = 0; j < i; j++) {
    						qLinkedList.offer(qLinkedList.poll());
    					}
    					
    					isMax = false;
    					break;
    				}
    			}
    			
    			if(isMax == false) {
    				continue;
    			}
    			
    			count++;
    			if(front[0] == m) {
    				break;
    			}
    			
    		}
    		
    		sb.append(count).append("\n");
    	}
    	
    	System.out.println(sb);
	}
	
}