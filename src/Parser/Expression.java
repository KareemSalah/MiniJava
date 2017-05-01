package Parser;

public class Expression implements Node{
	private ExpressionDashDash expressionDashDash;
	private ExpressionBeta expressionBeta;
	
	protected Expression() {
		super();
	}

	public Expression(ExpressionDashDash expressionDashDash, ExpressionBeta expressionBeta) {
		super();
		this.expressionDashDash = expressionDashDash;
		this.expressionBeta = expressionBeta;
	}

	@Override
	public void printNode() {
		System.out.println("----------Expression----------");
		System.out.println("Expression : ExpressionDashDash = "); expressionDashDash.printNode();
		System.out.println("Expression : ExpressionBeta = "); expressionBeta.printNode();
		System.out.println("--------------------");		
	}
	
}
