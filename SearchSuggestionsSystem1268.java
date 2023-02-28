package binarytree_breadthfirstsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem1268 {
	public static void main(String[] args) {
		SearchSuggestionsSystem1268 search1268 = new SearchSuggestionsSystem1268();
		String[] products = { "havana" };
		String searchWord = "havana";
		System.out.println(search1268.suggestedProducts(products, searchWord));
	}

	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
		List<List<String>> matchingWords = new ArrayList<List<String>>();
		Arrays.sort(products);
		String prefix = "";
		int bsStart = 0, start = 0;
		for (char c : searchWord.toCharArray()) {
			prefix += c;
			start = lower_bound(products, bsStart, prefix);
			matchingWords.add(new ArrayList<String>());
			for (int i = start; i < Math.min(start + 3, products.length); i++) {
				if (products[i].length() < prefix.length() || !products[i].substring(0, prefix.length()).equals(prefix))
					break;
				matchingWords.get(matchingWords.size() - 1).add(products[i]);
			}
			bsStart = start;
		}
		return matchingWords;
	}

	public int lower_bound(String[] products, int start, String word) {
		int i = start, j = products.length - 1;
		int m = 0;
		while (i < j) {
			m = (i + j) / 2;
			if (products[m].compareTo(word) >= 0) {
				j = m;
			} else {
				i = m + 1;
			}
		}
		return i;

	}
}
