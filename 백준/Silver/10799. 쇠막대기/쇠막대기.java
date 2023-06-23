import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String str = br.readLine();
    	int count = 0;
    	int result = 0;
    	
    	for(int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		// 여는 괄호일 때 count(막대기) 증가
    		if(ch == '(') {
    			count++;
    		// 닫는 괄호일 때 	
    		} else {
    			count--;
    				// '()' 레이저인 경우 이전까지 잘린 막대기 갯수를 더함
    				if(str.charAt(i - 1) == '(') {
    					result += count;
    				} else {
    				// 막대기의 끝인 경우 레이저는 막대를 무조건 자르기 때문에
    				// 막대 갯수가 늘어남	
    					result++;
    				}
    		
    		}
    		
    	}
    	
    	System.out.println(result);
	}
	
}