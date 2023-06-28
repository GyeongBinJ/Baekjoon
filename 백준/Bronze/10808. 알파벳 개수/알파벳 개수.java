import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	String input = br.readLine();
    	
    	int[] count = new int[26];
    	char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    	
    	for(int i = 0; i < input.length(); i++) {
    		for(int j = 0; j < alphabet.length; j++) {
    			if(input.charAt(i) == alphabet[j]) {
    				count[j]++;
    			}
    		}
    	}
    	
    	for(int i = 0; i < count.length; i++) {
    		sb.append(count[i]).append(" ");
    	}
	
	
    	System.out.println(sb);
	}

	
}	