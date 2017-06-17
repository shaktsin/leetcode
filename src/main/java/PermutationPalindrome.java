/**
 * Created by shaktsin on 6/17/17.
 */
public class PermutationPalindrome {

  public static void main(String[] args) {
    int[] charsets = new int[256];
    String src = "aaaaab";
    int trueLength = 0;
    int noOfOdd = 0;
    boolean isPermutaionOfPalindrome = false;

    for (int i=0; i < src.length(); i++) {
      if (Character.isLetter(src.charAt(i))) {
        Character ch = Character.toLowerCase(src.charAt(i));
        charsets[ch] = charsets[ch] + 1;
        trueLength ++;
      }
    }

    for (int x: charsets) {
      if (x % 2 != 0) {
        noOfOdd++;
      }
    }

    if (trueLength % 2 == 0 && noOfOdd == 0) {
      isPermutaionOfPalindrome = true;
    } else if (trueLength % 2 != 0 && noOfOdd == 1) {
      isPermutaionOfPalindrome = true;
    }

    System.out.println("Is Permutation of Palindrome :: "+ isPermutaionOfPalindrome);


  }
}
