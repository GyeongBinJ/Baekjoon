import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int fir = Integer.parseInt(br.readLine());
        int sec = Integer.parseInt(br.readLine());
        int thr = Integer.parseInt(br.readLine());
        
        if(fir == 60 && sec == 60 && thr == 60) {
        	System.out.println("Equilateral");
        } else if(fir + sec + thr == 180) {
        	if(fir == sec || fir == thr || sec == thr) {
        		System.out.println("Isosceles");
        	} else {
        		System.out.println("Scalene");
        	}
        } else {
        	System.out.println("Error");
        }

        br.close();
    }
}