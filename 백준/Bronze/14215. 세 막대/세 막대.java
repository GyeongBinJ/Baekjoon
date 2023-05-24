import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        	int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        	Arrays.sort(arr); // 배열 오름차순으로 정렬
        	
        	if(arr[2] < arr[0] + arr[1]) {
        		System.out.println(arr[0] + arr[1] + arr[2]);
        	} else {
        		arr[2] = arr[0] + arr[1] - 1;
        		System.out.println(arr[0] + arr[1] + arr[2]);
        	}
    }
}