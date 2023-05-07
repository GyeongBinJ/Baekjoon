import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int t = Integer.parseInt(br.readLine());
       
       for(int i = 0; i < t; i++) {
    	   
    	   int money = Integer.parseInt(br.readLine());
    	   
    	   int qCnt = money / 25;
    	   money %= 25;
    	   int dCnt = money / 10;
    	   money %= 10;
    	   int nCnt = money / 5;
    	   money %= 5;
    	   int pCnt = money / 1;
    	   
    	   System.out.println(qCnt + " " + dCnt + " " + nCnt + " " + pCnt);
       }
       
       br.close();
    }

}