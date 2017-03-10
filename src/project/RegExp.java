package project;

import java.util.ArrayList;

public class RegExp {

	public String type;
	public String regExp;
<<<<<<< HEAD
	public int startIndex;
	public int endIndex;
	public RegExp(String type, String regExp) {
		super();
		this.type = type;
		this.regExp = regExp;
	}

	public RegExp(String type, String regExp,int startIndex) {
		super();
		this.type = type;
		this.regExp = regExp;
		this.startIndex = startIndex; 
=======

	public RegExp(String type, String regExp) {
		super();
		this.type = type;
		this.regExp = regExp;
>>>>>>> e5be714b1e04ffcebb77a9f01375acec3d20cd32
	}

	public RegExp() {

	}
<<<<<<< HEAD

	public ArrayList<RegExp> fill() {

		ArrayList<RegExp> regExps = new ArrayList<>();
		
		
		regExps.add(new RegExp("COMMENT1", "\\b\\/\\/\\b"));
		regExps.add(new RegExp("COMMENT2", "(\\/\\*).*(\\*\\/)"));
		regExps.add(new RegExp("COMMENT_L", "\\b\\/\\*\\b"));
		regExps.add(new RegExp("COMMENT_R", "\\b\\*\\/\\b"));

		
		regExps.add(new RegExp("STRING_LITERAL", "\\b\"[^\"\\\\]*(\\\\.[^\"\\\\]*)*\"\\b"));
		regExps.add(new RegExp("CHAR", "\\b\'.\'\\b"));

		
		regExps.add(new RegExp("FLOAT_LITERAL", "\\b[-]?\\d+\\.\\d+\\b"));
		regExps.add(new RegExp("INTEGRAL_LITERAL", "\\b\\d+\\b"));
		regExps.add(new RegExp("SYSTEM.OUT.PRINTLN", "\\bsystem\\.out\\.println\\b"));

		
		regExps.add(new RegExp("INT", "\\bint\\b"));
		regExps.add(new RegExp("CHARACTER", "\\bchar\\b"));
		regExps.add(new RegExp("STRING", "\\b(^String| String)\\b"));
		regExps.add(new RegExp("BOOLEAN", "\\b(\\s|\\n)boolean\\s\\b"));
		regExps.add(new RegExp("FLOAT", "\\bfloat\\b"));
		
		
		regExps.add(new RegExp("CLASS", "\\b( class |^class)\\b"));
		regExps.add(new RegExp("VOID", "\\b(\\s|\\n)void(\\s|\\n|(?=;))\\b"));
		regExps.add(new RegExp("PUBLIC", "\\public\\b"));
		regExps.add(new RegExp("STATIC", "\\bstatic\\b"));
		regExps.add(new RegExp("NEW", "\\b(?<=(=|\\s))new\\s\\b"));
		regExps.add(new RegExp("EXTENDS", "\\bextends\\b"));
		regExps.add(new RegExp("TRUE", "\\btrue\\b"));
		regExps.add(new RegExp("FALSE", "\\bfalse\\b"));
		regExps.add(new RegExp("THIS", "\\bthis\\b"));
		regExps.add(new RegExp("WHILE", "\\bwhile\\b"));
		regExps.add(new RegExp("LENGTH", "\\b(?<=\\.)length(?=\\(\\))\\b"));
		regExps.add(new RegExp("RETURN", "\\breturn\\b"));
		regExps.add(new RegExp("IF", "\\bif\\b"));
		regExps.add(new RegExp("ELSE", "\\b(\\s|\\n)else(\\s|\\n)\\b"));

		
		regExps.add(new RegExp("EOL", "(\\n)|($)"));
		regExps.add(new RegExp("PLUS", "\\b\\+\\b"));
		regExps.add(new RegExp("MINUS", "\\b-\\b"));
		regExps.add(new RegExp("MULTIPLY", "\\b\\*\\b"));
		regExps.add(new RegExp("EQUAL", "\\b=\\b"));

		regExps.add(new RegExp("LEFT_SQUARE_B", "(?<=(\\s|\\w+))\\[(?=\\s|\\d+|\\])"));
		regExps.add(new RegExp("RIGHT_SQUARE_B", "\\b\\]\\b"));
		regExps.add(new RegExp("RIGHT_CURLY_B", "\\b}\\b"));
		regExps.add(new RegExp("LEFT_CURLY_B", "\\b{\\b"));
		regExps.add(new RegExp("LEFT_ROUND_B", "\\b(\\b"));
		regExps.add(new RegExp("RIGHT_ROUND_B", "\\b)\\b"));

		
		regExps.add(new RegExp("COMMA", "\\b,\\b"));
		regExps.add(new RegExp("SEMICOLON", "\\b;\\b"));
		regExps.add(new RegExp("DOT", "\\b\\.\\b"));
		regExps.add(new RegExp("NOT", "\\b!\\b"));
		regExps.add(new RegExp("AND", "\\b&&\\b"));
		regExps.add(new RegExp("LESSTHAN", "\\b<\\b"));
		regExps.add(new RegExp("GREATERTHAN", "\\b>\\b"));
		regExps.add(new RegExp("SQUOTE", "\\b‘\\b"));
		regExps.add(new RegExp("DQUOTE", "\\b\"\\b"));

		
		regExps.add(new RegExp("MAIN","\bmain\b"));
		regExps.add(new RegExp("ID", "\\b_?[a-zA-Z_]+\\w*\\b"));
=======
	
	public ArrayList<RegExp> fill() {

		ArrayList<RegExp> regExps = new ArrayList<>();

		regExps.add(new RegExp("EOL", "(\\n)|($)"));
		regExps.add(new RegExp("PLUS", "\\+"));
		regExps.add(new RegExp("{", "{"));
		regExps.add(new RegExp("}", "}"));
		regExps.add(new RegExp("LEFT_SQUARE_B", "(?<=(\\s|\\w+))\\[(?=\\s|\\d+|\\])"));
		regExps.add(new RegExp("RIGHT_SQUARE_B", "]")); //TC :: "this ] is sq bracket" ,, el mfrud my3mlsh detect le fa h7tag a3dl this one
		regExps.add(new RegExp("(", "("));
		regExps.add(new RegExp(")", ")"));
		regExps.add(new RegExp("COMMA", ","));
		regExps.add(new RegExp("SEMICOLON", ";"));
		regExps.add(new RegExp(".", "\\."));
		regExps.add(new RegExp("!", "!"));
		regExps.add(new RegExp("EQUAL", "="));
		regExps.add(new RegExp("AND", "&&"));
		regExps.add(new RegExp("-", "-"));
		regExps.add(new RegExp("*", "*"));
		regExps.add(new RegExp("LESSTHAN", "<"));
		regExps.add(new RegExp("GREATERTHAN", ">"));
		regExps.add(new RegExp("IF", "if"));
		regExps.add(new RegExp("INT", "int"));
		regExps.add(new RegExp("ELSE", "(?<=\\s|\\n|\\})else(?=\\s|\\n|\\{)"));
		regExps.add(new RegExp("MAIN", "(^public static void main(String[] args))")); // TO be edited ,, msh moktn3a tb3n :/
		regExps.add(new RegExp("THIS", "this"));
		regExps.add(new RegExp("TRUE", "true"));
		regExps.add(new RegExp("VOID", "(\\s|\\n)void(\\s|\\n|(?=;))"));
		regExps.add(new RegExp("CLASS", "( class |^class)"));
		regExps.add(new RegExp("FALSE", "false"));
		regExps.add(new RegExp("WHILE", "while"));
		regExps.add(new RegExp("LENGTH", "(?<=\\.)length(?=\\(\\))"));
		regExps.add(new RegExp("PUBLIC", "^public"));
		regExps.add(new RegExp("RETURN", "return"));
		regExps.add(new RegExp("STATIC", "static"));
		regExps.add(new RegExp("NEW", "(?<=(=|\\s))new\\s"));
		regExps.add(new RegExp("STRING", "(^String| String) \\w(\\w)*(\\s)*="));
		regExps.add(new RegExp("FLOAT", "float"));
		regExps.add(new RegExp("CHARACTER", "char"));
		regExps.add(new RegExp("BOOLEAN", "(\\s|\\n)boolean\\s"));
		regExps.add(new RegExp("EXTENDS", " extends "));
		regExps.add(new RegExp("SYSTEM.OUT.PRINTLN", "system\\.out\\.println"));
		regExps.add(new RegExp("INTEGRAL_LITERAL", "\\d+"));
		regExps.add(new RegExp("FLOAT_LITERAL", "[-]?\\d+\\.\\d+"));
		regExps.add(new RegExp("STRING_LITERAL", "\"(\\w|\\s)*\""));
		regExps.add(new RegExp("ID", "_?[a-zA-Z_]+\\w*"));
		regExps.add(new RegExp("COMMENT", "\\/\\/"));
		regExps.add(new RegExp("COMMENT2", "(\\/\\*).*(\\*\\/)"));
		regExps.add(new RegExp("SQUOTE", "'"));
		regExps.add(new RegExp("\"", "\""));
		regExps.add(new RegExp("/*", "\\/\\*"));
		regExps.add(new RegExp("COMMENT_R", "\\*\\/"));
		regExps.add(new RegExp("A_CHAR", "'\\w'"));
>>>>>>> e5be714b1e04ffcebb77a9f01375acec3d20cd32

		return regExps;

	}

}
