package Parser;

import MiniJava.Token;

public class ExpressionDashDashFalse implements ExpressionDashDash {
	private Token falseKeyword;

	public ExpressionDashDashFalse(Token falseKeyword) {
		super();
		this.falseKeyword = falseKeyword;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : False = " + falseKeyword.getValue());
		System.out.println("--------------------");
	}
}
