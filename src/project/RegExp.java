package project;

import java.util.ArrayList;

public class RegExp {

	public String type;
	public String regExp;
	public int startIndex;
	public int endIndex;
	
	public RegExp() {
		super();
	}
	
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
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegExp() {
		return regExp;
	}

	public void setRegExp(String regExp) {
		this.regExp = regExp;
	}


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

		return regExps;
	}

	
}
