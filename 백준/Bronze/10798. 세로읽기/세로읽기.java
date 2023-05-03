import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       char[][] arr = new char[5][15];
       // 문자열 최대의 길이
       int max = 0;
       
       for(int i = 0; i < 5; i++) {
    	   String input = br.readLine();
    	   if(input.length() > max) {
    		   max = input.length();
    	   }
    	   
    	   for(int j = 0; j < input.length(); j++) {
    		   arr[i][j] = input.charAt(j);
    	   }
       }
       
       for(int i = 0; i < max; i++) {
    	   for(int j = 0; j < 5; j++) {
    		   if(arr[j][i] == ' ' || arr[j][i] == '\0')
    			   continue;
    		   System.out.print(arr[j][i]);
    	   }
       }
       
       br.close();
    }

}