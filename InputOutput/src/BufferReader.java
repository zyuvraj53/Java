import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a number");
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(is);
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n); 
	}
}
