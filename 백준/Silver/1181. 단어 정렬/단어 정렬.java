import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	String[] arr = new String[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = br.readLine();
    	}
    	
    	HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
    	String[] resultArr = hashSet.toArray(new String[0]);
    	
    	Arrays.sort(resultArr, new Comparator<String>() {
    		public int compare(String s1, String s2) {
    			if(s1.length() == s2.length()) {
    				return s1.compareTo(s2);
    			} else {
    				return s1.length() - s2.length();      
    			}
    		}
    	});		
    	
    	
    	for(int i = 0; i < resultArr.length; i++) {
    		System.out.println(resultArr[i]);
    	}
    	
    }
}