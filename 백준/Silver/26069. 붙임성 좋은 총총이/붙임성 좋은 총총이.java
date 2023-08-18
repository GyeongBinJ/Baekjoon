import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("ChongChong");
		
		while(n--> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			String input2 = st.nextToken();
			
			if(hashSet.contains(input) || hashSet.contains(input2)) {
				hashSet.add(input);
				hashSet.add(input2);
			}
			
		}
		
		System.out.println(hashSet.size());
	}
	
}
	