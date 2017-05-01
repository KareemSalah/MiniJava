package Parser;

import MiniJava.Token;

public class ExpressionDash3 extends ExpressionDash {
	private Token dot;
	private DotFunction dotFunction;
	
	public ExpressionDash3(Token dot, DotFunction dotFunction) {
		super();
		this.dot = dot;
		this.dotFunction = dotFunction;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDash----------");
		System.out.println("ExpressionDash : dot = " + dot.getValue());
		System.out.println("ExpressionDash : dotFunction = "); dotFunction.printNode();
		System.out.println("--------------------");
	}
	
	
}
