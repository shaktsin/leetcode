/**
 * Created by shaktsin on 6/15/17.
 */
public class ZigZag {

  public static String convert(String s, int numRows) {
    StringBuilder st = new StringBuilder();

    return s;
  }

  public static int findAPlace(String s) {
    return (s.length()) - ((Double) (s.length() * Math.random())).intValue();
  }

  public static void main(String[] args) {
    String s = "Lovedebeechchickerkhurana";
    StringBuilder st = new StringBuilder();

    int nRows = 3;
    for (int i=0; i < nRows - 1; i++) {
      int place = findAPlace(s);
      st.append(s.substring(0, place));
      st.append("\n");
      st.append(s.substring(place, s.length()));
      s = st.toString();
      st.setLength(0);
    }

    System.out.println(s);
  }
}
