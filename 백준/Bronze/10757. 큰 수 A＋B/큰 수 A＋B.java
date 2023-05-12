import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       String A = st.nextToken();
       String B = st.nextToken();
       
       int max = Math.max(A.length(), B.length());
       
       // 더했을 때 자릿수가 늘어날 수 있으므로 + 1 lenngth
       int[] arr = new int[max + 1];
       int[] arr2 = new int[max + 1];
       
       
       // 배열에 역순으로 대입
       for(int i = A.length() - 1, j = 0; i >= 0; i--, j++) {
    	   arr[j] = A.charAt(i) - '0';
       }
       
       for(int i = B.length() - 1, j = 0; i >= 0; i--, j++) {
    	   arr2[j] = B.charAt(i) - '0';
       }
       
       // 배열에 더하기
       for(int i = 0; i < max; i++) {
    	   arr[i + 1] += (arr[i] + arr2[i]) / 10;
    	   arr[i] = (arr[i] + arr2[i]) % 10;
       }
       
       if(arr[max] != 0) {
    	   System.out.print(arr[max]);
       }
       
       for(int i = max - 1; i >= 0; i--) {
    	   System.out.print(arr[i]);
       }
      
       
       br.close();
	
	}


}