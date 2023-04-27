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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		int[] newArr = new int[n];
		
		// 배열에 바구니 수만큼 1번부터 int값을 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// m번 만큼 바구니의 순서 회전
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			// 배열의 인덱스는 0부터 시작하기 때문에 - 1을 해준다.
			int begin = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			int mid = Integer.parseInt(st.nextToken()) - 1;
			
			int num = begin;
			
			// begin부터 end까지 바구니를 움직일 시 항상 end - begin + 1개의 바구니가 회전
			for(int j = 0; j < end - begin + 1; j++) {
				// 기준 바구니의 index가 end 바구니의 인덱스가 될 때까지
				if(j + mid <= end) {
					newArr[begin + j] = arr[mid + j];
				} else {
					newArr[begin + j] = arr[num];
					num++;
				}
			}
			
			for(int j = 0; j < newArr.length; j++) {
				if(newArr[j] != 0) {
					arr[j] = newArr[j];
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
		
}