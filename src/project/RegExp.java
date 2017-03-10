package project;

import java.util.ArrayList;

public class RegExp {

	public String type;
	public String regExp;

	public RegExp(String type, String regExp) {
		super();
		this.type = type;
		this.regExp = regExp;
	}

	public RegExp() {

	}

	public ArrayList<RegExp> fill() {

		ArrayList<RegExp> regExps = new ArrayList<>();

		
		regExps.add(new RegExp("RIGHT_CURLY_B", "\\b}\\b"));
		regExps.add(new RegExp("RIGHT_ROUND_B", "\\b)\\b"));
		regExps.add(new RegExp("NOT", "\\b!\\b"));
		regExps.add(new RegExp("MULTIPLY", "\\b\\*\\b"));
		regExps.add(new RegExp("INT", "\\bint\\b"));
		regExps.add(new RegExp("TRUE", "\\btrue\\b"));
		regExps.add(new RegExp("WHILE", "\\bwhile\\b"));
		regExps.add(new RegExp("STATIC", "\\bstatic\\b"));
		regExps.add(new RegExp("CHARACTER", "\\bchar\\b"));
		regExps.add(new RegExp("INTEGRAL_LITERAL", "\\b\\d+\\b"));
		regExps.add(new RegExp("COMMENT1", "\\b\\/\\/\\b"));
		regExps.add(new RegExp("COMMENT_L", "\\b\\/\\*\\b"));
		regExps.add(new RegExp("CHAR", "\\b\'.\'\\b"));

		return regExps;

	}

}
