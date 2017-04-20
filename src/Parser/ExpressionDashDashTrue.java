package Parser;

import MiniJava.Token;

public class ExpressionDashDashTrue implements ExpressionDashDash {
	private Token trueKeyword;
	
	public ExpressionDashDashTrue(Token trueKeyword) {
		super();
		this.trueKeyword = trueKeyword;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : true = " + trueKeyword.getValue());
		System.out.println("--------------------");
	}
	

}
