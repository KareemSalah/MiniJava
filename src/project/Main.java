package project;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static ArrayList<RegExp> regExps = new ArrayList<>();
	public static Character terminator = '#';
	final public static Integer priority1 = 5;
	
	@SuppressWarnings("finally")
	public static void main(String[] args) {

		RegExp regExp = new RegExp();
		regExps = regExp.fill();
		
		// Should replace this line and get code from file and store in stringBuilder
		StringBuilder input = new StringBuilder("tst");
		
		// tokenizing the code
		ArrayList<Token> tokens = new ArrayList<>();
		try {
			tokens = tokenize(input);
		} catch(InvalidTokenException e) {
			e.printStackTrace();
			System.out.println(e.message);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Terminating");
			return;
		}
		
	}
	
	public static ArrayList<Token> tokenize(StringBuilder input) throws InvalidTokenException {
		
		ArrayList<Token> tokens = new ArrayList<>();
		
		// cleaning input from comment2 and string_literals first
		for(int i = 0;i < input.length();i++) {
			
			// starting a string literal
			if(input.charAt(i) == '"') {
				for(int j = + 1;j < input.length();j++) {
					if(input.charAt(j) == '*') {
						Token token = new Token(i, regExps.get(2).getType(), input.substring(i, j+1));
						tokens.add(token);
						for(int k = i;k <= j;k++) {
							input.setCharAt(k, terminator);
						}
						i = j;
						break;
					}
				}
			}
			
			// starting a comment2 literal
			if(i > 0 && input.charAt(i-1)=='/' && input.charAt(i)=='*') {
				for(int j = i + 2;j < input.length();j += 2) {
					if(input.charAt(j) == '/' && input.charAt(j-1) == '*') {
						Token token = new Token(i, regExps.get(0).getType(), input.substring(i, j+1));
						tokens.add(token);
					}
					for(int k = i;k <= j;k++) {
						input.setCharAt(k, terminator);
					}
					i = j;
					break;
				}
			}
		}
		
		// start matching top priority expressions first
		// notice that IDs are matched outside this loop
		for(int i = 0;i < regExps.size() - 1;i++) {
			RegExp expression = regExps.get(i);
			Pattern pattern = Pattern.compile(expression.getRegExp());
			Matcher matcher = pattern.matcher(input);
			
			while(matcher.find()) {
				int start = matcher.start();
				int end = matcher.end();
				Token token = new Token(start, expression.getType(), matcher.group(0));
				tokens.add(token);
				
				// substituting the found token in code with a terminator character
				while(start <= end) {
					input.setCharAt(start, terminator);
					start += 1;
				}
			}
		}
		
		// matching the ids of variables
		RegExp expression = regExps.get(regExps.size()-1);
		Pattern pattern = Pattern.compile(expression.getRegExp());
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			Token token = new Token(start, expression.getType(), matcher.group(0));
			tokens.add(token);
			
			// substituting the found token in code with a terminator character
			while(start <= end) {
				input.setCharAt(start, terminator);
				start += 1;
			}
		}
		
		// detecting non-matched tokens
		for(int i = 0;i < input.length();i++) {
			if(input.charAt(i) != '#') {
				throw new InvalidTokenException();
			}
		}
		
		return tokens;
	}

}
