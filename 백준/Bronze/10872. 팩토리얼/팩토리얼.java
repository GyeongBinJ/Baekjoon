import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int[] arr = new int[13];
    	
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = i + 1;
    	}
    	
    	int num = Integer.parseInt(br.readLine());
    	int result = 1;
    	
    	for(int i = 0; i < num; i++) {
    		result *= arr[i];
    	}
    	
    	System.out.println(result);
	}
}	
	