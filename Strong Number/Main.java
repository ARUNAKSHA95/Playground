import java.util.Scanner;
import java.io.*;
class Main{
	public static void main (String[] args)throws IOException
    {
	    // Type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int num = Integer.parseInt(br.readLine());
      int t = num;
      int sum =0,rem=0,fa = 1;
      while(num!=0)
      {
        rem = num % 10;
        fa = Main.fact(rem);
        sum = sum + fa;
        num = num/10;
        
      }
      if(t == sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
  public static int fact(int n)
  { 
    int f=1;
    while(n!=1)
    {
      f = f * n;
      n--;
    }
    return f;
  }
}