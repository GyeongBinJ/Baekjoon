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
		
		int king = 1;
		int queen = 1;
		int look = 2;
		int bishop = 2;
		int knight = 2;
		int pawns = 8;
		
		king = king - Integer.parseInt(st.nextToken()); 
		queen = queen - Integer.parseInt(st.nextToken()); 
		look = look - Integer.parseInt(st.nextToken()); 
		bishop = bishop - Integer.parseInt(st.nextToken()); 
		knight = knight - Integer.parseInt(st.nextToken()); 
		pawns = pawns - Integer.parseInt(st.nextToken());
		
		bw.write(king + " " + queen + " " + look + " " + bishop + " "+ knight + " " + pawns);
		
		bw.flush();
		bw.close();
		br.close();
	}
		
}