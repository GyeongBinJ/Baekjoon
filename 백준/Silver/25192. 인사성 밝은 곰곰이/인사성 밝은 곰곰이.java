import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		HashSet<String> hashSet = new HashSet<>();
		
		while(n--> 0) {
			String str = br.readLine();
			
			if(str.equals("ENTER")) {
				count += hashSet.size();
				hashSet.clear();
				continue;
			}
			
			hashSet.add(str);
		}
		
		System.out.println(count + hashSet.size());
	}
	
}