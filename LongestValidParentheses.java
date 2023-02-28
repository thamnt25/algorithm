package dynamic_programing;

import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		LongestValidParentheses prentheses = new LongestValidParentheses();
		String s = "()(()";
		System.out.print(prentheses.longestValidParentheses(s));
	}

	public int longestValidParentheses(String s) {
		int count = 0;
		if (s.length() == 0)
			return count;
		return count;
	}
}
