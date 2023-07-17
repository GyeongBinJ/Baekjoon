import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] p = new int[n + 1];
    	int[] resultArr = new int[n + 1];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i = 1; i <= n; i++) {
    		p[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= i; j++) {
    			resultArr[i] = Math.max(resultArr[i], resultArr[i - j] + p[j]);
    		}
    	}
    	
    	System.out.println(resultArr[n]);
    	
	}
	
}	