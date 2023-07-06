import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean[] prime = new boolean[1000001];
    	
    	prime[0] = prime[1] = true;
    	
    	for(int i = 2; i < Math.sqrt(1000000); i++) {
    		if(prime[i]) continue;
    			for(int j = i * i; j < prime.length; j += i) {
    				prime[j] = true;
    			}
    	}
    	
    	while(true) {
    		
    		int num = Integer.parseInt(br.readLine());
    		boolean check = false;
    		
    		if(num == 0) break;
    		
    		for(int i = 2; i <= num / 2; i++) {
    			if(!prime[i] && !prime[num - i]) {
    				System.out.println(num + " = " + i + " + " + (num - i));
    				check = true;
    				break;
    			}
    		}
    		
    		if(!check) System.out.println("Goldbach's conjecture is wrong.");
    		
    	}

    	
    	
	}
}	
	