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

		
		regExps.add(new RegExp("+", "+"));
		regExps.add(new RegExp("{", "{"));
		regExps.add(new RegExp("RIGHT_CURLY_B", "}"));
		regExps.add(new RegExp("[", "["));
		regExps.add(new RegExp("]", "]"));
		regExps.add(new RegExp("(", "("));
		regExps.add(new RegExp("RIGHT_ROUND_B", ")"));
		regExps.add(new RegExp(",", ","));
		regExps.add(new RegExp(";", ";"));
		regExps.add(new RegExp(".", "."));
		regExps.add(new RegExp("NOT", "!"));
		regExps.add(new RegExp("=", "="));
		regExps.add(new RegExp("&&", "&&"));
		regExps.add(new RegExp("-", "-"));
		regExps.add(new RegExp("MULTIPLY", "\\*"));
		regExps.add(new RegExp("<", "<"));
		regExps.add(new RegExp(">", ">"));
		regExps.add(new RegExp("IF", "if"));
		regExps.add(new RegExp("INT", "int"));
		regExps.add(new RegExp("ELSE", "else"));
		regExps.add(new RegExp("MAIN", "main"));
		regExps.add(new RegExp("THIS", "this"));
		regExps.add(new RegExp("TRUE", "true"));
		regExps.add(new RegExp("VOID", "void"));
		regExps.add(new RegExp("CLASS", "class"));
		regExps.add(new RegExp("FALSE", "false"));
		regExps.add(new RegExp("WHILE", "while"));
		regExps.add(new RegExp("LENGTH", "length"));
		regExps.add(new RegExp("PUBLIC", "public"));
		regExps.add(new RegExp("RETURN", "return"));
		regExps.add(new RegExp("STATIC", "static"));
		regExps.add(new RegExp("NEW", "new"));
		regExps.add(new RegExp("STRING", "string"));
		regExps.add(new RegExp("FLOAT", "float"));
		regExps.add(new RegExp("CHARACTER", "char"));
		regExps.add(new RegExp("BOOLEAN", "bool"));
		regExps.add(new RegExp("EXTENDS", "extends"));
		regExps.add(new RegExp("SYSTEM.OUT.PRINTLN", "system\\.out\\.println"));
		regExps.add(new RegExp("INTEGRAL_LITERAL", "\\d+"));
		regExps.add(new RegExp("FLOAT_LITERAL", "[-+]?\\d+\\.\\d+"));
		regExps.add(new RegExp("STRING_LITERAL", "\"[^\"\\\\]*(\\\\.[^\"\\\\]*)*\""));
		regExps.add(new RegExp("ID", ""));
		regExps.add(new RegExp("COMMENT1", "\\/\\/"));
		regExps.add(new RegExp("‘", "‘"));
		regExps.add(new RegExp("\"", "\\"));
		regExps.add(new RegExp("COMMENT_L", "\\/\\*"));
		regExps.add(new RegExp("", "\\*\\/"));
		regExps.add(new RegExp("CHAR", "\'\\w\'"));

		return regExps;

	}

}
