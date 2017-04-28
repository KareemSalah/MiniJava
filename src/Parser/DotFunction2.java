package Parser;

import MiniJava.Token;

public class DotFunction2 implements DotFunction {
	private Identifier identifier;
	private Token openCircleBrackets;
	private SomeExpressions someExpressions;
	private Token closedCircleBrackets;
	
	public DotFunction2(Identifier identifier, Token openCircleBrackets, SomeExpressions someExpressions,
			Token closedCircleBrackets) {
		super();
		this.identifier = identifier;
		this.openCircleBrackets = openCircleBrackets;
		this.someExpressions = someExpressions;
		this.closedCircleBrackets = closedCircleBrackets;
	}

	@Override
	public void printNode() {
		System.out.println("----------DotFunction----------");
		System.out.println("DotFunction : identifier = "); identifier.printNode();
		System.out.println("DotFunction : openCircleBrackets = " + openCircleBrackets.getValue());
		System.out.println("DotFunction : SomeExpressions = "); someExpressions.printNode();
		System.out.println("DotFunction : closedCircleBrackets = " + closedCircleBrackets.getValue());
		System.out.println("--------------------");
	}
	
	
}
