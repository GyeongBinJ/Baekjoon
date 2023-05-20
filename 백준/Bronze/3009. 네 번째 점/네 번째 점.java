import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int[] fir = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
       st = new StringTokenizer(br.readLine());
       int[] sec = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
       st = new StringTokenizer(br.readLine());
       int[] thi = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
       
       int x = 0;
       int y = 0;
       
       if(fir[0] == sec[0]) {
    	   x = thi[0];
       } else if(fir[0] == thi[0]) {
    	   x = sec[0];
       } else {
    	   x = fir[0];
       }
       
       if(fir[1] == sec[1]) {
    	   y = thi[1];
       } else if(fir[1] == thi[1]) {
    	   y = sec[1];
       } else {
    	   y = fir[1];
       }
       
       System.out.println(x + " " + y);
       
	}
}