import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < t; i++) {
    		long n = Long.parseLong(br.readLine());
    		
    		BigInteger num = new BigInteger(String.valueOf(n));
    		
    		if(num.isProbablePrime(10)) {
    			System.out.println(num);
    		} else {
    			System.out.println(num.nextProbablePrime());
    		}
    	}
    	
	}
	
}