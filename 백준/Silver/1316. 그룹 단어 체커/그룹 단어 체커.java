import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i = 0; i < num; i++) {
        	String str = br.readLine();
        	boolean[] alphabet = new boolean[26];
        	boolean isGroupWord = true;
        	
        	for(int j = 0; j < str.length(); j++) {
        		char ch = str.charAt(j);
        		int index = ch - 'a';
        		
        		// 연속된 문자인지 체크, 이전에 나온 문자인지 체크
        		if(j > 0 && ch != str.charAt(j - 1) && alphabet[index]) {
        			isGroupWord = false;
        			break;
        		}
        		alphabet[index] = true;
        	}
        	
        	if(isGroupWord) {
        		count++;
        	}
        }
        
        System.out.println(count);

        br.close();
    }

}