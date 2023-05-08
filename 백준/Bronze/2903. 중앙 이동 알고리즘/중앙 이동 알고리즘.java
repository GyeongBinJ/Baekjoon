import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int num = Integer.parseInt(br.readLine());
       // 점이 제곱으로 늘어나기 때문에(4 -> 9 -> 25 -> 81) 기본값인 2(의제곱)을 선언
       int point = 2;
       
       for(int i = 0; i < num; i++) {
       // 2 -> 3 -> 5 -> 9로 진행되는데 이 값의 차는 1(+2), 2(+3), 4(+5)..로 2의 제곱이다.
       // 기본값에 i만큼 제곱하여 구함
    	   point += (int)Math.pow(2, i);
       }
       
       System.out.println((int)Math.pow(point, 2));
       
       br.close();
    }

}