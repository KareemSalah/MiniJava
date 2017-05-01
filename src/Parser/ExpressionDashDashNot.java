package Parser;

import MiniJava.Token;

public class ExpressionDashDashNot extends ExpressionDashDash {
	private Token not;
	private Expression expression;
	
	public ExpressionDashDashNot(Token not, Expression expression) {
		super();
		this.not = not;
		this.expression = expression;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : not = " + not.getValue());
		System.out.println("ExpressionDashDash : Expression = "); expression.printNode();
		System.out.println("--------------------");
	}
}
