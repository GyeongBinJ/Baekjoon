import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       String str;
       
       while((str = br.readLine()) != null) {
    	   StringTokenizer st = new StringTokenizer(str);
    	   int fir = Integer.parseInt(st.nextToken());
    	   int sec = Integer.parseInt(st.nextToken());
    	   
    	   if(fir == 0 && sec == 0) {
    		   break;
    	   }
    	   
    	   if(sec % fir == 0) {
    		   System.out.println("factor");
    	   } else if(fir % sec == 0) {
    		   System.out.println("multiple");
    	   } else {
    		   System.out.println("neither");
    	   }
    	   
       }
       
       br.close();
	
	}


}