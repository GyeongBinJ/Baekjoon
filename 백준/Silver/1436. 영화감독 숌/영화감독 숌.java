import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static boolean[][] arr;
	public static int min = 64; // 8 * 8

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int i = 666;
    	int count = 1;
    	
    	while(n != count) {
    		i++;
    		
    		if(String.valueOf(i).contains("666")) {
    			count++;
    		}
    	}
    	
    	System.out.println(i);
    	
    }
}