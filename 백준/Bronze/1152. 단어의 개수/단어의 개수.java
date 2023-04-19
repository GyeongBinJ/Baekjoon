import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력 받은 문자열의 앞뒤 공백 제거
		String input = br.readLine().trim();
		
		// 입력 받은 문자열이 공백인 경우 0를 출력하고 메서드 종료
		if(input.isEmpty()) {
			System.out.println(0);
			return;
		}
		
		String[] words = input.split(" ");
		int count = words.length;
		
		System.out.println(count);
		
		bw.close();
		br.close();
		
		
	}
		
}