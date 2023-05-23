import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0;
        
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int fir = Integer.parseInt(st.nextToken());
        	int sec = Integer.parseInt(st.nextToken());
        	int thr = Integer.parseInt(st.nextToken());
        	
        	if(fir == 0 && sec == 0 && thr == 0)
				break;
        	
        	max = Math.max(Math.max(fir, sec),thr);
        	int sum = 0;
        	
        	if(max == fir) {
        		sum = sec + thr;
        	} else if(max == sec) {
        		sum = fir + thr;
        	} else {
        		sum = fir + sec;
        	}
        	
        	if(max >= sum) {
        		System.out.println("Invalid");
        	} else {
        		if(fir == sec && sec == thr) {
        			System.out.println("Equilateral");
        		} else {
        			if(fir == sec || fir == thr || sec == thr) {
        				System.out.println("Isosceles");
        			} else {
        				System.out.println("Scalene");
        			}
        		}
        	}
        	
        
        }
        
        
    }
}