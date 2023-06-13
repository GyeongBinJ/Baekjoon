import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] arr = new int[n];
    	int[] sortArr = new int[n];
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	// 데이터 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		arr[i] = sortArr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	// 오름차순 정렬
    	Arrays.sort(sortArr);
    	
    	int rank = 0;
    	
    	for(int v : sortArr) {
    		if(!map.containsKey(v)) {
    			map.put(v, rank);
    			rank++;
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(int key : arr) {
    		int ranking = map.get(key);
    		sb.append(ranking).append(" ");
    	}
    	
    	System.out.println(sb);
    	
    }
}