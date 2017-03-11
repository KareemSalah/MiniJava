package MiniJava;

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
		regExps.add(new RegExp("COMMENT1", "\\/\\/"));
		regExps.add(new RegExp("COMMENT2", "(\\/\\*).*(\\*\\/)"));
		regExps.add(new RegExp("COMMENT_L", "\\/\\*"));

		regExps.add(new RegExp("COMMENT_R", "\\*\\/"));

		
		regExps.add(new RegExp("STRING_LITERAL", "(\"[^\"\\\\]*(\\\\.[^\"\\\\]*)*\"(?=!(.*\")))")); // check en fe " then ay bs msh " wla \ w b3deen 
		regExps.add(new RegExp("A_CHAR", "\'.\'"));

		
		regExps.add(new RegExp("FLOAT_LITERAL", "[-]?\\d+\\.\\d+"));
		regExps.add(new RegExp("INTEGRAL_LITERAL", "\\b\\d+"));
		regExps.add(new RegExp("SYSTEM.OUT.PRINTLN", "\\bSystem\\.out\\.println\\b"));
		
		regExps.add(new RegExp("MAIN","(?<=public static void )main(?=\\s*\\(String\\s\\[\\] args\\))"));
		
		regExps.add(new RegExp("INT", "\\bint\\b"));
		regExps.add(new RegExp("CHARACTER", "\\bchar\\b"));
		regExps.add(new RegExp("STRING", "((?<!(String\\s))(?<=\\n|\\s|^)String(?=\\s\\s*\\w(\\w)*(\\s)*(=|;))|(?<=\\()String(?= .(\\.*|\\))))")); // yla2e String fl awl aw b3d space *3shan l access modifiers* aw new line *3shan lw code 3la b3du bl String Builder* ,, w b3deen lazm shwyt kalam w lazm fl a5r ; aw = AW yla2e ( w mmkn shwyt spaces w b3den String w b3deen shwyt kalam w b3deen )
		regExps.add(new RegExp("BOOLEAN", "\\bboolean\\b"));
		regExps.add(new RegExp("FLOAT", "\\bfloat\\b"));		
		regExps.add(new RegExp("CLASS", "\\bclass\\b"));
		regExps.add(new RegExp("VOID", "\\bvoid\\b"));
		regExps.add(new RegExp("PUBLIC", "\\bpublic\\b"));
		regExps.add(new RegExp("STATIC", "\\bstatic\\b"));
		regExps.add(new RegExp("NEW", "\\bnew\\b"));
		regExps.add(new RegExp("EXTENDS", "\\bextends\\b"));
		regExps.add(new RegExp("TRUE", "\\btrue\\b"));
		regExps.add(new RegExp("FALSE", "\\bfalse\\b"));
		regExps.add(new RegExp("THIS", "\\bthis\\b"));
		regExps.add(new RegExp("WHILE", "\\bwhile\\b"));
		regExps.add(new RegExp("LENGTH", "(?<=\\.)length(?=(\\(\\)|\\b))"));
		regExps.add(new RegExp("RETURN", "\\breturn\\b"));
		regExps.add(new RegExp("IF", "\\bif\\b"));
		regExps.add(new RegExp("ELSE", "\\belse\\b"));

		
		regExps.add(new RegExp("EOL", "(\\n)|($)"));
		regExps.add(new RegExp("PLUS", "\\+"));
		regExps.add(new RegExp("MINUS", "-"));
		regExps.add(new RegExp("MULTIPLY", "\\*"));
		regExps.add(new RegExp("EQUAL", "="));

		regExps.add(new RegExp("LEFT_SQUARE_B", "\\["));
		regExps.add(new RegExp("RIGHT_SQUARE_B", "\\]"));
		regExps.add(new RegExp("RIGHT_CURLY_B", "\\}"));
		regExps.add(new RegExp("LEFT_CURLY_B", "\\{"));
		regExps.add(new RegExp("LEFT_ROUND_B", "\\("));
		regExps.add(new RegExp("RIGHT_ROUND_B", "\\)"));

		
		regExps.add(new RegExp("COMMA", ","));
		regExps.add(new RegExp("SEMICOLON", ";"));
		regExps.add(new RegExp("DOT", "\\."));
		regExps.add(new RegExp("NOT", "!"));
		regExps.add(new RegExp("AND", "&&"));
		regExps.add(new RegExp("LESSTHAN", "<"));
		regExps.add(new RegExp("GREATERTHAN", ">"));
		regExps.add(new RegExp("SQUOTE", "'"));
		regExps.add(new RegExp("DQUOTE", "\""));
		

		regExps.add(new RegExp("ID", "\\b_?[a-zA-Z_]+\\w*\\b"));

		return regExps;
	}
}
