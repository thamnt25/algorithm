package dynamic_programing;

public class PalindromicSubstrings {

	int count = 0;

	public static void main(String[] args) {
		PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
		String s = "aaa";
		System.out.print(palindromicSubstrings.countSubstrings(s));
	}

	public int countSubstrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			explantSubString(s, i, i);
			explantSubString(s, i, i + 1);
		}
		return count;
	}

	public void explantSubString(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			count++;
			left--;
			right++;
		}
	}
}
