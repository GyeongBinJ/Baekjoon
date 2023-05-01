import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int count = 0;
        int i = 0;
        
        while (i < str.length()) {
        	// 크로아티아 알파벳을 찾을 때 마지막 글자라면 index 오류가 발생할 수 있기 때문에
            if (i < str.length() - 1) {
                if (str.substring(i, i + 2).equals("c=") ||
                    str.substring(i, i + 2).equals("c-") ||
                    str.substring(i, i + 2).equals("d-") ||
                    str.substring(i, i + 2).equals("lj") ||
                    str.substring(i, i + 2).equals("nj") ||
                    str.substring(i, i + 2).equals("s=") ||
                    str.substring(i, i + 2).equals("z=")) {
                    i += 2;
                } else if (i < str.length() - 2 && str.substring(i, i + 3).equals("dz=")) {
                    i += 3;
                } else {
                    i++;
                }
            } else {
                i++;
            }
            count++;
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }

}