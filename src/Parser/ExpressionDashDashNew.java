package Parser;

import MiniJava.Token;

public class ExpressionDashDashNew extends ExpressionDashDash {
	private Token newKeyword;
	private NewDash newDash;
	
	public ExpressionDashDashNew(Token newKeyword, NewDash newDash) {
		super();
		this.newKeyword = newKeyword;
		this.newDash = newDash;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : new = " + newKeyword.getValue());
		System.out.println("ExpressionDashDash : newDash = "); newDash.printNode();
		System.out.println("--------------------");
	}
}
