package Parser;

public class ExpressionBeta1 implements ExpressionBeta {
	private ExpressionDash expressionDash;
	private ExpressionBeta expressionBeta;
	
	public ExpressionBeta1(ExpressionDash expressionDash, ExpressionBeta expressionBeta) {
		super();
		this.expressionDash = expressionDash;
		this.expressionBeta = expressionBeta;
	}
	
	@Override
	public void printNode() {
		System.out.println("----------ExpressionBeta1----------");
		System.out.println("ExpressionBeta1 :: expressionDash = "); expressionDash.printNode();
		System.out.println("ExpressionBeta1 :: expressionBeta = "); expressionBeta.printNode();
		System.out.println("--------------------");
	}

}
