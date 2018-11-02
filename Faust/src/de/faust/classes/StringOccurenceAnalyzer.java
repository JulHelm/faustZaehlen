package de.faust.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StringOccurenceAnalyzer {

	public List<StringOccurence> analyse(List<String> words) {
		HashMap<String, Integer> occurences = new HashMap<>();

		for (String word : words) {
			if (occurences.containsKey(word)) {
				int n = occurences.get(word);
				occurences.put(word, n + 1);
			} else {
				occurences.put(word, 1);
			}
		}

		ArrayList<StringOccurence> list = new ArrayList<>();

		for (Map.Entry<String, Integer> e : occurences.entrySet()) {
			list.add(new StringOccurence(e.getKey(), e.getValue()));
		}
		
		Collections.sort(list, new StringoccurenceComparator());

		return list;

	}
}
