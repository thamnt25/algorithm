import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromePermutation266 {
    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("carerac"));

    }
    // "code" -> False, "aab" -> True, "carerac" -> True.
    public static boolean canPermutePalindrome(String s) {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (letters.contains(s.charAt(i))) {
                letters.remove(s.charAt(i));
            } else {
                letters.add(s.charAt(i));
            }
        }
        return (letters.size() <= 1);
    }

}
