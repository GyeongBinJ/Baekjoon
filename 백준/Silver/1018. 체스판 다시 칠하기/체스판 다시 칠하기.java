import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static boolean[][] arr;
	public static int min = 64; // 8 * 8

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	// 체스판 2차원 배열
    	arr = new boolean[n][m];
    	
    	// 검은색일 경우 1, 흰색일 경우 0
    	for(int i = 0; i < n; i++) {
    		String str = br.readLine();
    		
    		for(int j = 0; j < m; j++) {
    			if(str.charAt(j) == 'W') {
    				arr[i][j] = true;
    			} else {
    				arr[i][j] = false;
    			}
    		}
    	}
    	
    	int row = n - 7;
    	int col = m - 7;
    	
    	for(int i = 0; i < row; i++) {
    		for(int j = 0; j < col; j++) {
    			findColor(i, j);
    		}
    	}
    	System.out.println(min);
    	
    }
    
    public static void findColor(int x, int y) {
    	boolean firstC = arr[x][y];
    	int count = 0;
    	
    	for(int i = x; i < (x + 8); i++) {
    		for(int j = y; j < (y + 8); j++) {
    			
    			if(arr[i][j] != firstC) {
    				count++;
    			}
    			
    			// 체스판은 다음 칸이 색이 바뀜
    			firstC = (!firstC);
    		}
    		
    		firstC = !firstC;
    	}
    	
    	count = Math.min(count, 64 - count);
    	
    	min  = Math.min(min, count);
    	
    }
}