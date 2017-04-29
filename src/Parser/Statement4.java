package Parser;

import MiniJava.Token;

public class Statement4 implements Statement {
	private Token systemOut_token;
	private Token left_bracket;
	private Token right_bracket;
	private Expression expression;
	private Token semicolon_token;
	
	public Statement4(Token systemOut, Token left_bracket, Token right_bracket,
			Expression expression, Token semicolon) {
		super();
		this.systemOut_token = systemOut;
		this.left_bracket = left_bracket;
		this.right_bracket = right_bracket;
		this.expression = expression;
		this.semicolon_token = semicolon;
	}

	@Override
	public void printNode() {
		System.out.println("----------Statement----------");
		System.out.println("Statement : System.out.println token = " + systemOut_token.getValue());
		System.out.println("Statement : Left bracket token = " + left_bracket.getValue());
		System.out.println("Statement : Expression = "); expression.printNode();
		System.out.println("Statement : Right bracket token = " + right_bracket.getValue());
		System.out.println("Statement : Semicolon token = " + semicolon_token.getValue());


	}

}