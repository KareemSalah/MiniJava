package Parser;

import MiniJava.Token;

public class OP implements Node{
	private Token operator;

	public OP(Token operator) {
		super();
		this.operator = operator;
	}

	@Override
	public void printNode() {
		System.out.println("----------OP----------");
		System.out.println("OP : operator = " + operator.getValue());
		System.out.println("--------------------");
		
	}
}
