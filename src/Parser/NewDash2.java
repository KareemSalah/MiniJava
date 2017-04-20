package Parser;

import MiniJava.Token;

public class NewDash2 implements NewDash {
	private Identifier identifier;
	private Token openCircleBrackets;
	private Token closedCircleBracket;
	
	public NewDash2(Identifier identifier, Token openCircleBrackets, Token closedCircleBracket) {
		super();
		this.identifier = identifier;
		this.openCircleBrackets = openCircleBrackets;
		this.closedCircleBracket = closedCircleBracket;
	}

	@Override
	public void printNode() {
		System.out.println("----------NewDash----------");
		System.out.println("NewDash : identifier = "); identifier.printNode();
		System.out.println("NewDash : openCircleBrackets = " + openCircleBrackets.getValue());
		System.out.println("NewDash : closedCircleBrackets = " + closedCircleBracket.getValue());
		System.out.println("--------------------");
	}
}
