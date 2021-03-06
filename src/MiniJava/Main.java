package MiniJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Main {

	public static ArrayList<RegExp> regExps = new ArrayList<>();
	public static Character terminator = '#';
	final public static Integer priority1 = 5;

	@SuppressWarnings("finally")
	public static void main(String[] args) throws IOException {

		RegExp regExp = new RegExp();
		regExps = regExp.fill();

		// Should replace this line and get code from file and store in
		// stringBuilder
		StringBuilder input = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader("TC4.txt"));
		try {

			String line = br.readLine();
			while (line != null) {
				input.append(line);
				input.append("\n");
				line = br.readLine();
			}
		} finally {
			br.close();
		}
		// tokenizing the code
		ArrayList<Token> tokens = new ArrayList<>();
		try {
			tokens = tokenize(input);
		} catch (InvalidTokenException e) {
			e.printStackTrace();
			System.out.println(e.message);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Terminating");
			return;
		}

		java.util.Collections.sort(tokens, new Comparator<Token>() {
			public int compare(Token t1, Token t2) {
				if (t1.getOffset() > t2.getOffset())
					return 1;
				if (t1.getOffset() < t2.getOffset())
					return -1;
				return 0;
			}
		});
		File fout = new File("out.txt");
		FileOutputStream fos = new FileOutputStream(fout);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bw.write("Successs");
		bw.newLine();
		System.out.println("Success");
		for (Token token : tokens) {
			String res = token.toString();
			bw.write(res);
			bw.newLine();
			System.out.println(res);
		}
		bw.close();

	}

	public static ArrayList<Token> tokenize(StringBuilder input) throws InvalidTokenException {

		ArrayList<Token> tokens = new ArrayList<>();

		// cleaning input from comment2 and string_literals first
		for (int i = 0; i < input.length(); i++) {

			// starting a string literal
			if (input.charAt(i) == '"') {
				for (int j = i + 1; j < input.length(); j++) {
					if (input.charAt(j) == '"') {

						Token token = new Token(i, regExps.get(4).getType(), input.substring(i, j + 1));
						tokens.add(token);
						for (int k = i; k <= j; k++) {
							input.setCharAt(k, terminator);
						}
						i = j;
						break;
					}
				}
			}

			// starting a comment2 literal
			if (i > 0 && input.charAt(i - 1) == '/' && input.charAt(i) == '*') {
				for (int j = i + 2; j < input.length(); j += 2) {
					if (input.charAt(j) == '/' && input.charAt(j - 1) == '*') {
						Token token = new Token(i, regExps.get(1).getType(), input.substring(i - 1, j + 1));
						tokens.add(token);
						for (int k = i - 1; k <= j; k++) {
							input.setCharAt(k, terminator);
						}
						i = j;
						break;
					}
				}
			}
		}

		// start matching top priority expressions first
		// notice that IDs are matched outside this loop
		for (int i = 0; i < regExps.size() - 1; i++) {
			RegExp expression = regExps.get(i);
			Pattern pattern = Pattern.compile(expression.getRegExp());
			Matcher matcher = pattern.matcher(input);

			while (matcher.find()) {
				int start = matcher.start();
				int end = matcher.end();
				Token token = new Token(start, expression.getType(), matcher.group(0));
				tokens.add(token);

				// substituting the found token in code with a terminator
				// character
				while (start < end) {
					input.setCharAt(start, terminator);
					start += 1;
				}
			}
		}

		// matching the ids of variables
		RegExp expression = regExps.get(regExps.size() - 1);
		Pattern pattern = Pattern.compile(expression.getRegExp());
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			Token token = new Token(start, expression.getType(), matcher.group(0));
			tokens.add(token);

			// substituting the found token in code with a terminator character
			while (start < end) {
				input.setCharAt(start, terminator);
				start += 1;
			}
		}

		// detecting non-matched tokens
		for (int i = 0; i < input.length(); i++) {
			String Temp = "";
			if (input.charAt(i) != '#' && input.charAt(i) != ' ') {
				int start = i;
				for (int j = i;; j++) {
					if (input.charAt(j) != '#' && input.charAt(j) != ' ') {
						Temp += input.charAt(j);
					}
					if (input.charAt(j) == '#' || input.charAt(j) == ' ') {
						System.out.println("Here");

						Token token = new Token(start, "Error", Temp);
						tokens.add(token);
						i = j;
						Temp = "";
						break;
					}

				}
				// throw new InvalidTokenException();
			}
		}

		return tokens;
	}

}
