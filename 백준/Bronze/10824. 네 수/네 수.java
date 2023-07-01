import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	String a = st.nextToken();
    	String b = st.nextToken();
    	String c = st.nextToken();
    	String d = st.nextToken();
    	
    	long num = Long.parseLong(a + b);
    	long num2 = Long.parseLong(c + d);
    	
    	System.out.println(num + num2);
    	
	}

	
}	