import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int result = a * b;
		
//		int[] digits = Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> arrNum = new ArrayList<>();
		
		while(b > 0) {
			arrNum.add(b % 10);
			
			// b 변수에 10를 나눈 값을 저장
			b /= 10;
		}
		
		for(int i = 0; i < arrNum.size(); i++) {
			
			System.out.println(a * arrNum.get(i));
		}
		System.out.println(result);
		
		bw.close();
	}
		
		
	}
