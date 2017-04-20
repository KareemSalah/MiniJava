package Parser;

import MiniJava.Token;

public class ExpressionDash2 implements ExpressionDash {
	private Token openSquareBrackets;
	private Expression expression;
	private Token closedSquareBrackets;
	
	public ExpressionDash2(Token openSquareBrackets, Expression expression, Token closedSquareBrackets) {
		super();
		this.openSquareBrackets = openSquareBrackets;
		this.expression = expression;
		this.closedSquareBrackets = closedSquareBrackets;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDash----------");
		System.out.println("ExpressionDash : openSquareBrackets = " + openSquareBrackets.getValue());
		System.out.println("ExpressionDash : expression = "); expression.printNode();
		System.out.println("ExpressionDash : closedSquareBrackets = " + closedSquareBrackets.getValue());
		System.out.println("--------------------");
	}
}
