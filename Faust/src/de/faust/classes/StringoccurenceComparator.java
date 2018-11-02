package de.faust.classes;

import java.awt.List;
import java.util.Comparator;

public class StringoccurenceComparator implements Comparator<StringOccurence>{

	@Override
	public int compare(StringOccurence o1, StringOccurence o2) {
		if (o1.getValue()<o2.getValue()) {
			return 1;
		} else if(o1.getValue() == o2.getValue()) {
			return 0;
		}else
		return -1;
	}

}
