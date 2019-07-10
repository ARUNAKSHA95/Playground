import java.util.Scanner;
import java.io.*;
class Main{
	public static void main (String[] args)throws IOException{
	    // Type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      for(int i=1;i<=n;i++)
      {
        if(n%i == 0)
        {
          System.out.println(i);
        }
      }
	}
}