package Parser;

public class ExpressionDash1 implements ExpressionDash {
	private OP op;
	private Expression expression;
	
	public ExpressionDash1(OP op, Expression expression) {
		super();
		this.op = op;
		this.expression = expression;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDash----------");
		System.out.println("ExpressionDash : op = "); op.printNode();
		System.out.println("ExpressionDash : expression = "); expression.printNode();
		System.out.println("--------------------");
	}
}
