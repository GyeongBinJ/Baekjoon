import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	
    	int c = Integer.parseInt(st.nextToken());
    	int d = Integer.parseInt(st.nextToken());
    	
    	int numerator = a * d + b * c;
    	int denominator = b * d;
    	
    	reduceFraction(numerator, denominator);
	}
	
	public static void reduceFraction(int numerator, int denominator) {
		int gcd = gcd(numerator, denominator);
		
		int reduceNumerator = numerator / gcd;
		int reducedDenominator = denominator / gcd;
		
		System.out.println(reduceNumerator + " " + reducedDenominator);
	}
	
	public static int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
	
}