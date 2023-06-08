import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String sNum = br.readLine();
    	
    	Integer[] arr = new Integer[sNum.length()];
    	
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = Character.getNumericValue(sNum.charAt(i));
    	}
    	
    	Arrays.sort(arr, Comparator.reverseOrder());
    	
    	for(int i = 0; i < arr.length; i++) {
    		bw.write(arr[i] + "");
    	}
    	
    	bw.flush();
    }
}