import java.util.HashMap;
import java.util.Map;

/**
 * Created by shaktsin on 6/15/17.
 */
public class Atoi {


  public int getDigit(char c) {
    int value = -1;
    switch (c) {
      case '0':
        value = 0;
        break;
      case '1':
        value = 1;
        break;
      case '2':
        value = 2;
        break;
      case '3':
        value = 3;
        break;
      case '4':
        value = 4;
        break;
      case '5':
        value = 5;
        break;
      case '6':
        value = 6;
        break;
      case '7':
        value = 7;
        break;
      case '8':
        value = 8;
        break;
      case '9':
        value = 9;
        break;
      default:
        value = -1;
    }
    return value;
  }

  public int myAtoi(String str) {
    int probeStartsWithIndex=0;
    boolean isNegative = false;
    int result = 0;
    if (str.length() > 0) {
    if (str.charAt(0) == '-' || str.charAt(0) == '+') {
      probeStartsWithIndex = 1;
      if (str.charAt(0) == '-') isNegative = true;
    }

    str = str.trim();

    for (int i=probeStartsWithIndex; i < str.length() && getDigit(str.charAt(i)) != -1 ;  i++) {
      result = 10*result + getDigit(str.charAt(i));
    }}

    if (isNegative) {
      result = -1*result;
    }
    return result;
  }

  public static void main(String[] args) {
    String text = "2147483648";
    Atoi atoi = new Atoi();
    System.out.println(atoi.myAtoi(text));
  }
}
