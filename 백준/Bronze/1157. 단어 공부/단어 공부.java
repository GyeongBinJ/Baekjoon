import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().toUpperCase();
		
		// 입력 받은 문자열을 비교할 int 배열 선언(알파벳 철자의 개수 만큼)
		int[] arr = new int [26];
		
		for(int i = 0; i < str.length(); i++) {
			// arr의 해당 문자 인덱스 증가
			arr[str.charAt(i) - 'A']++;
		}
		
		int max = 0;
		char ch = '?';
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if(max == arr[i]) {
				ch = '?';
			}
		}
		
		bw.write(ch);
		
		bw.flush();
		bw.close();
		br.close();
	}
		
}