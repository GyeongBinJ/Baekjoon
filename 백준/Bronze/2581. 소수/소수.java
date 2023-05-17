import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int M = Integer.parseInt(br.readLine());
       int N = Integer.parseInt(br.readLine());
       int sum = 0;
       int minNum = N;
       
       
       for(int i = M; i <= N; i++) {
    	   int num = i;
    	   boolean isPrime = true;
    	   
    	   if(i == 1) {
    		   continue;
    	   }
		   for(int j = 2; j <= Math.sqrt(num); j++) {
			   if(i % j == 0) {
				   isPrime = false;
				   break;
			   }
			   
		   }
    		   
		   if(isPrime) {
			   sum += i;
			   
			   if(minNum > i) {
				   minNum = i;
			   }
		   }
		   
       }
       
       if(sum == 0) {
    	   System.out.println(-1);
       } else {
    	   System.out.println(sum);
    	   System.out.println(minNum);
       }

	
	}
}