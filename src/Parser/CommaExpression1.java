package Parser;

import MiniJava.Token;

public class CommaExpression1 implements CommaExpression {
	private Token comma;
	private Expression expression;
	private CommaExpression commaExpression;
	
	public CommaExpression1(Token comma, Expression expression, CommaExpression commaExpression) {
		super();
		this.comma = comma;
		this.expression = expression;
		this.commaExpression = commaExpression;
	}

	@Override
	public void printNode() {
		System.out.println("----------CommaExpression----------");
		System.out.println("CommaExpression : comma = " + comma.getValue());
		System.out.println("CommaExpression : expression = "); expression.printNode();
		System.out.println("CommaExpression : commaExpression = "); commaExpression.printNode();
		System.out.println("--------------------");
	}
}
