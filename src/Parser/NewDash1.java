package Parser;

import MiniJava.Token;

public class NewDash1 implements NewDash {
	private Token intKeyword;
	private Token openSquareBracket;
	private Expression expression;
	private Token closedSquareBracket;
	
	public NewDash1(Token intKeyword, Token openSquareBracket, Expression expression, Token closedSquareBracket) {
		super();
		this.intKeyword = intKeyword;
		this.openSquareBracket = openSquareBracket;
		this.expression = expression;
		this.closedSquareBracket = closedSquareBracket;
	}

	@Override
	public void printNode() {
		System.out.println("----------NewDash----------");
		System.out.println("NewDash : intKeyword = " + intKeyword.getValue());
		System.out.println("NewDash : openSquareBrackets = " + openSquareBracket.getValue());
		System.out.println("NewDash : expression = "); expression.printNode();
		System.out.println("NewDash : closedSquareBracket = " + closedSquareBracket.getValue());
		System.out.println("--------------------");
	}
}
