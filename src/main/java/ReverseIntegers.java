/**
 * Created by shaktsin on 6/15/17.
 */
public class ReverseIntegers {

  public static int reverse(int x) {

    int result = 0, t=0, MAX = Integer.MAX_VALUE / 10, MIN=Integer.MIN_VALUE / 10;
    boolean isNegative=false, large=false;
    int absX = x;
    if (x < 0) {
      absX = -1 * x;
      isNegative = true;
    }

    for (t=absX;  t / 10 != 0; t = t / 10) {
      result = 10 * result + (t%10);

      if (result >= MAX) {
        result = 0;
        large = true;
        break;
      }

      if (isNegative && -1*result <= MIN) {
        result = 0;
        large = true;
        break;
      }
    }
    if (t != 0 && !large) {
      result = 10 * result + (t%10);
    }

    return isNegative ? -1 * result : result;
  }

  public static void main(String[] args) {


    //System.out.println(reverse(-2147483648));
    System.out.println(2147483647);
    System.out.println(746384741*10);
  }
}
