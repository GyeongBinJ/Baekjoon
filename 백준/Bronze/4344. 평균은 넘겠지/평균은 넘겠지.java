import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int students = Integer.parseInt(st.nextToken());
			int[] stuArr = new int[students];
			int sum = 0;
			for(int j = 0; j < students; j++) {
				int score = Integer.parseInt(st.nextToken());
				// 평균을 내기 위한 sum변수와 학생들의 점수를 저장할 배열
				sum += score;
				stuArr[j] = score;
			}
			double avg = (double) sum / students;
			int count = 0;
			for(int j = 0; j < stuArr.length; j++) {
				if(stuArr[j] > avg) {
					count++;
				}
			}
			// 결과를 소수점 셋째자리까지 출력
			String result = String.format("%.3f", (double) count / students * 100);
			bw.write(result + "%\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	};
		
}