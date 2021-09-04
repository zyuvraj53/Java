package telusko;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args)throws Exception {
		
		int n;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			 n = Integer.parseInt(br.readLine());
		}//no need to write finally with try
		
		System.out.println(n); 
		
	}

}
