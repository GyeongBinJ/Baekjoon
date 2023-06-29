import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String input = "";
    	
    	while((input = br.readLine()) != null ) {
    		int[] checkArr = new int[4];
    		
    		for(int i = 0; i < input.length(); i++) {
    			char ch = input.charAt(i);
    			
    			if(Character.isLowerCase(ch)) {
    				checkArr[0]++;
    			}
    			if(Character.isUpperCase(ch)) {
    				checkArr[1]++;
    			}
    			if(Character.isDigit(ch)) {
    				checkArr[2]++;
    			} 
    			if(ch == ' ') {
    				checkArr[3]++;
    			}
    		
    		}
    		
    		for(int i : checkArr) {
    			System.out.print(i + " ");
    		}
    		
    		System.out.println();
    	}
    	
	}

	
}	