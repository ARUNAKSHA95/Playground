import java.util.Scanner;
import java.io.*;
class Main{
	public static void main (String[] args)throws IOException
    {
	   // Type your code here
      BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int t = n;
      String str = String.valueOf(n);
      int len = str.length();
      int rem=0,sum=0;
      while(n!=0)
      {
        rem = n%10;
        sum = sum + (int) Math.pow(rem,len);
        n = n/10;
      }
      if(t==sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
      
	}
}