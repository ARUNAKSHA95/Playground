import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int n1_firstdigit=n/100;
      int num = n1_firstdigit;
      System.out.println(+ num);
	}
}