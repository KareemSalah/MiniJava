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

		
		regExps.add(new RegExp("RIGHT_CURLY_B", "}"));
		regExps.add(new RegExp("RIGHT_ROUND_B", ")"));
		regExps.add(new RegExp("NOT", "!"));
		regExps.add(new RegExp("MULTIPLY", "\\*"));
		regExps.add(new RegExp("INT", "int"));
		regExps.add(new RegExp("TRUE", "true"));
		regExps.add(new RegExp("WHILE", "while"));
		regExps.add(new RegExp("STATIC", "static"));
		regExps.add(new RegExp("CHARACTER", "char"));
		regExps.add(new RegExp("INTEGRAL_LITERAL", "\\d+"));
		regExps.add(new RegExp("COMMENT1", "\\/\\/"));
		regExps.add(new RegExp("COMMENT_L", "\\/\\*"));
		regExps.add(new RegExp("CHAR", "\'\\w\'"));

		return regExps;

	}

}
