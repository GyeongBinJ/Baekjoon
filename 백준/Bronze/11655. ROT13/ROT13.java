import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String input = br.readLine();
    	
    	for(int i = 0; i < input.length(); i++) {
    		char ch = input.charAt(i);
    		
    		if(ch >= 'A' && ch <= 'Z') {
    			if(ch >= 'N') {
    				ch -= 13;
    			} else {
    				ch += 13;
    			}
    			
    		} else if(ch >= 'a' && ch <= 'z') {
    			if(ch >= 'n') {
    				ch -= 13;
    			} else {
    				ch += 13;
    			}
    		}
    		
    		System.out.print(ch);
    	}
    	
	}
	
}	