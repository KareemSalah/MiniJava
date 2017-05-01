package Parser;

import MiniJava.Token;

public class ExpressionDashDashThis extends ExpressionDashDash {
	private Token thisKeyword;

	public ExpressionDashDashThis(Token thisKeyword) {
		super();
		this.thisKeyword = thisKeyword;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : this = " + thisKeyword.getValue());
		System.out.println("--------------------");
	}
}
