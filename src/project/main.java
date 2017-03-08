package project;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
	public static ArrayList<RegExp> regExps = new ArrayList<>();

	public static void main(String[] args) {

		RegExp regExp = new RegExp();
		regExps = regExp.fill();

		String input = "int intval = 10*5";
		tokenize(input);

	}

	public static void tokenize(String input) {
		

	}

}
