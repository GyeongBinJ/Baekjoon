import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int num = Integer.parseInt(br.readLine());
       int xMin = 0, xMax = 0, yMin = 0, yMax = 0;
       
       if(num >= 2) {
    	   for(int i = 0; i < num; i++) {
    		   StringTokenizer st = new StringTokenizer(br.readLine());
    		   
    		   int x = Integer.parseInt(st.nextToken());
    		   int y = Integer.parseInt(st.nextToken());
    		   
    		   if(i == 0) {
    			   xMin = x;
    			   xMax = x;
    			   
    			   yMin = y;
    			   yMax = y;
    		   } else {
    			   
    			   if(xMin > x) {
    				   xMin = x;
    			   }
    			   
    			   if(xMax < x) {
    				   xMax = x;
    			   }
    			   
    			   if(yMin > y) {
    				   yMin = y;
    			   }
    			   
    			   if(yMax < y) {
    				   yMax = y;
    			   }
    			   
    		   }
    	   }
    	   
    	   System.out.println((xMax - xMin) * (yMax - yMin));
    	   
       } else {
    	   System.out.println(0);
       }
	}
}