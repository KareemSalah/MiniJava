package Parser;

public class SomeExpressions1 implements SomeExpressions{
	private Expression expression;
	private CommaExpression commaExpression;
	
	public SomeExpressions1(Expression expression, CommaExpression commaExpression) {
		super();
		this.expression = expression;
		this.commaExpression = commaExpression;
	}

	@Override
	public void printNode() {
		System.out.println("----------SomeExpressions----------");
		System.out.println("SomeExpressions : Expression = "); expression.printNode();
		System.out.println("SomeExpressions : CommaExpression = "); commaExpression.printNode();
		System.out.println("--------------------");
	}
}
