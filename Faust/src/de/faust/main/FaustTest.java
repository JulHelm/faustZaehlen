package de.faust.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.faust.classes.StringOccurence;
import de.faust.classes.StringOccurenceAnalyzer;

public class FaustTest {

	public static void main(String[] args) {

		String file = "faust.txt";
		ArrayList<String> words = new ArrayList<>();

		Scanner input;
		try {
			input = new Scanner(Paths.get(file));
		} catch (IOException e) {
			System.err.println("Fehler");
			e.printStackTrace();
			return;
		}

		while (input.hasNext()) {
			words.add(input.next());
		}
		
		StringOccurenceAnalyzer stringoccurrenceAnalyzer = new StringOccurenceAnalyzer();

		List<StringOccurence> occurences = stringoccurrenceAnalyzer.analyse(words);
		int i = 0;
		for (StringOccurence item : occurences) {
			
			i++;
				if (i == 11) {
					break;
				}
			System.out.println(item.getWord() + ": " + item.getValue()); 
		}
	}

}
