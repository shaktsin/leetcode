/**
 * Created by shaktsin on 6/16/17.
 */
public class AllUniqueCharacter {

  public static void main(String[] args) {

    String name = "shs";
    int sum = 0;

    for (int i=0; i<name.length(); i++) {
      sum = sum ^ name.charAt(i);
    }
    //System.out.println(0 ^ 1);
    System.out.println(name.charAt(0) ^ name.charAt(1) );
  }
}
