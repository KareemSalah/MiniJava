package Parser;

import MiniJava.Token;

public class ExpressionDashDashTrue extends ExpressionDashDash {
	private Token trueKeyword;
	
	public ExpressionDashDashTrue(Token trueKeyword) {
		super();
		this.trueKeyword = trueKeyword;
	}

	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : true = " + trueKeyword.getValue());
		System.out.println("--------------------");
	}
	

}
