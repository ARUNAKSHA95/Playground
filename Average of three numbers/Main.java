import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int n1= in.nextInt();
      int n2= in.nextInt();
      int sum = n+n1+n2;
      int avg = sum/3;
      System.out.println(+ avg);
	}
}