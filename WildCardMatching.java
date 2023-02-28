package dynamic_programing;

public class WildCardMatching {

	public static void main(String[] args) {
		System.out.println("WildCardMatching");
		WildCardMatching card = new WildCardMatching();
		System.out.println(card.isMatch("adceb", "*a*bcccc"));
	}

	public boolean isMatch(String s, String p) {
		int starIdx = -1;
		int ss = 0, pp = 0, match = 0;
		int send = s.length();
		int pend = p.length();

		while (ss < send) {
			if (pp < pend && (p.charAt(pp) == '?' || p.charAt(pp) == s.charAt(ss))) {
				ss++;
				pp++;
			} else if (pp < pend && p.charAt(pp) == '*') {
				starIdx = pp;
				pp++;
				match = ss;

			} else if (starIdx != -1) {
				pp = starIdx + 1;
				match ++;
				ss = match;
			} else
				return false;
		}
		while (pp < pend && p.charAt(pp) == '*') {
			pp++;
		}
		return pp == pend;
	}
}
