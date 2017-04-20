package Parser;

import MiniJava.Token;

public class ExpressionDashDashBrackets implements ExpressionDashDash {
	private Token openCircleBrackets;
	private Expression expression;
	private Token closedCircleBrackets;
	
	public ExpressionDashDashBrackets(Token openCircleBrackets, Expression expression, Token closedCircleBrackets) {
		super();
		this.openCircleBrackets = openCircleBrackets;
		this.expression = expression;
		this.closedCircleBrackets = closedCircleBrackets;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : openCircleBrackets = " + openCircleBrackets.getValue());
		System.out.println("ExpressionDashDash : Expression = "); expression.printNode();
		System.out.println("ExpressionDashDash : closedCircleBrackets = " + closedCircleBrackets.getValue());
		System.out.println("--------------------");
	}
}
