import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	int g = 0; // 최대 공약수
    	int l = 0; // 최소 공배수
    	
    	// 최대 공약수 구하기
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= m; j++) {
    			if(n % i == 0) {
    				if(m % j == 0 && i == j) {
    					g = i;
    					break;
    				}
    			}
    		}
    	}
    	
    	int max = Math.max(n, m);
    	// 최소 공배수 구하기
    	for(int i = max; i >= max; i++) {
    		if(i % n == 0 && i % m == 0) {
    			l = i;
    			break;
    		}
    	}
    	
    	System.out.println(g);
    	System.out.println(l);
    	
	}
	
}	
	