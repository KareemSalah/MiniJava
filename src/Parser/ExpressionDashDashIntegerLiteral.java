package Parser;

import MiniJava.Token;

public class ExpressionDashDashIntegerLiteral implements ExpressionDashDash{
	private Token intLiteral;

	public ExpressionDashDashIntegerLiteral(Token intLiteral) {
		super();
		this.intLiteral = intLiteral;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : INTEGER_LITERAL = " + intLiteral.getValue());
		System.out.println("--------------------");
	}	
}
