import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int n1_firstdigit=n/10;
      int n2_seconddigit=n%10;
      int sum = n1_firstdigit + n2_seconddigit;
      System.out.println(+ sum);
	}
}