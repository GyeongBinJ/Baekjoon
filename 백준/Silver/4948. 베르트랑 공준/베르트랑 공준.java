import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	getPrime();
    	
    	while(true) {
    		int num = Integer.parseInt(br.readLine());
    		if(num == 0) break;
    		
    		int count = 0;
    		
    		for(int i = num + 1; i <= num * 2; i++) {
    			if(!prime[i]) count++;
    		}
    		
    		System.out.println(count);
    	}
    	
	}
	
	public static void getPrime() {
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
	
}