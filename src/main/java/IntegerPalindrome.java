/**
 * Created by shaktsin on 6/15/17.
 */
public class IntegerPalindrome {

  public boolean isPalindrome(int x) {
    boolean palindrome = true;
    int temp = x, digits = 0;
    if (x < 0) {
      return false;
    }
    while (temp != 0) {
      digits = digits + 1;
      temp = temp / 10;
    }
    temp = x;
    for (int j=  digits-1; j >= 1;  j = j - 2) {
      int pow = (int) Math.pow(10, j);
      int leftMost = temp / pow;
      int rightMost = temp % 10;
      if (leftMost != rightMost) {
        palindrome=false;
        break;
      }
      int tail = temp % pow;
      temp = tail / 10;
    }

    return palindrome;
  }

  public static void main(String[] args) {
    IntegerPalindrome ip = new IntegerPalindrome();
    System.out.println(ip.isPalindrome(-2147447412));

  }
}
