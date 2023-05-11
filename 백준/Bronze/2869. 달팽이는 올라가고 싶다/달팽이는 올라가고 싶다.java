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
       
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       int V = Integer.parseInt(st.nextToken());
       
       // 낮동안 이동할 수 있는 거리 A, 밤동안 미끄러지는 거리 B를 빼서
       // 하루동안 이동할 수 있는 거리를 계산
       int distancePerDay = A - B;
       int count = (V - A) / distancePerDay + 1;
       
       // 만약 낮동안 이동할 수 있는 거리 % 하루동안 이동할 수 있는 거리가 0이 아니라면
       // 하루를 더 count한다.
       if((V - A) % distancePerDay != 0) {
    	   count++;
       }
       
       
       bw.write(String.valueOf(count));
       
       br.close();
       bw.close();
	
	}

}