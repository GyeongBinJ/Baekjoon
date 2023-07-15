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
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	while(t--> 0) {
    		int num = Integer.parseInt(br.readLine());
    		int count = 0;
    		
    		for(int i = 2; i <= num / 2; i++) {
    			if(!prime[i] && !prime[num - i]) count++;
    		}
    		
    		System.out.println(count);
    		
    	}
    	
	}
	
}	