import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int[][] arr = new int[100][100];
       int paper = Integer.parseInt(br.readLine());
       int count = 0;
       
       for(int i = 0; i < paper; i++) {
    	   StringTokenizer st = new StringTokenizer(br.readLine());
    	   int x = Integer.parseInt(st.nextToken());
    	   int y = Integer.parseInt(st.nextToken());
    	   
    	   for(int j = x; j < x + 10; j++) {
    		   for(int k = y; k < y + 10; k++) {
    			   arr[j][k]++;
    		   }
    	   }
       }
       
       for(int i = 0; i < arr.length; i++) {
    	   for(int j = 0; j < arr.length; j++) {
    		   if(arr[i][j] != 0) {
    			   count++;
    		   }
    	   }
       }
       
       System.out.println(count);
       
       br.close();
    }

}