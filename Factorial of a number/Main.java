import java.util.Scanner;
import java.io.*;
class Main{
	public static void main (String[] args)throws IOException
    {
        // Type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int fact = 1;
      while(n!=1)
      {
        fact = fact * n;
        n--;
      }
      System.out.println(fact);
	}
}