import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int num = Integer.parseInt(br.readLine());
       
       // 현재 대각선 칸의 개수, 누적합
       int cnt = 1, sum = 0;
       // 대각선의 순번이 홀수일 때와 짝수일때 읽는 방향이 반대
       // 분모 + 분자는 대각선에 따라 2, 3, 4, 5...순으로 늘어난다.
       // 현재 대각선의 칸 개수와 현재 대각선의 위치는 같다.
       while(true) {
    	   if(num <= cnt + sum) {
    		   if(cnt % 2 == 1) {
    			   System.out.println((cnt - (num - sum - 1)) + "/" + (num - sum));
    			   break;
    		   } else {
    			   System.out.println((num - sum) + "/" + (cnt - (num - sum - 1)));
    			   break;
    		   }
    	   } else {
    		   // 현재 대각선의 위치가 아닐 경우 다음 대각선으로 이동
    		   sum += cnt;
    		   cnt++;
    	   }
       }
	}

}