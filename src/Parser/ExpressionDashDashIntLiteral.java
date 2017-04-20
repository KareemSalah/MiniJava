package Parser;

import MiniJava.Token;

public class ExpressionDashDashIntLiteral implements ExpressionDashDash {
	private Token integerLiteral;

	public ExpressionDashDashIntLiteral(Token integerLiteral) {
		super();
		this.integerLiteral = integerLiteral;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : INTEGER_LITERAL = " + integerLiteral.getValue());
		System.out.println("--------------------");
	}
}
