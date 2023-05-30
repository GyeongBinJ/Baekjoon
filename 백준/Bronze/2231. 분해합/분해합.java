import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String sNum = br.readLine();
    	
    	int numLen = sNum.length();
    	
    	int num = Integer.parseInt(sNum);
    	int result = 0;
    	
    	for(int i = (num - (numLen * 9)); i < num; i++) {
    		int sum = 0;
    		int number = i;
    		
    		while(number != 0) {
    		    sum += number % 10;
    		    number /= 10;
    		}

    		if(i + sum == num) {
    		    result = i;
    		    break;
    		}
    	}
    	
    	System.out.println(result);
    }
}