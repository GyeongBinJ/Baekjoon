import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       while(true) {
    	   
    	   int num = Integer.parseInt(br.readLine());
    	   
    	   if(num == -1) {
    		   return;
    	   }
    	   
    	   int[] arr = new int[num];
    	   
    	   int sum = 0;
    	   int index = 0;
    	   
    	   for(int i = 1; i < num; i++) {
    		   if(num % i == 0) {
    			   arr[index++] = i;
    			   sum += i;
    		   }
    	   }
    	   
    	   if(sum != num) {
    		   System.out.println(num + " is NOT perfect.");
    	   } else if(sum == num) {
    		   System.out.print(num + " = ");
    		   for(int i = 0; i < index; i++) {
    			   System.out.print(arr[i]);
    			   if(i + 1 != index) {
    				   System.out.print(" + ");
    			   }
    			   
    		   }
    		   System.out.println();
    	   }
    	   
       }
       
	
	}


}