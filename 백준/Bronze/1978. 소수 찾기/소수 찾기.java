import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int input = Integer.parseInt(br.readLine());
       int count = 0;
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       for(int i = 0; i < input; i++) {
    	   int num = Integer.parseInt(st.nextToken());
    	   boolean isPrime = true;
    	   
    	   if(num == 1) {
    		   continue;
    	   }
		   for(int j = 2; j <= Math.sqrt(num); j++) {
			   if(num % j == 0) {
				   isPrime = false;
				   break;
			   }
			   
		   }
    		   
		   if(isPrime) {
			   count++;
		   }
       }

       System.out.println(count);
	
	}
}