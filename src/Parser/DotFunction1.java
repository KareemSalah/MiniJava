package Parser;

import MiniJava.Token;

public class DotFunction1 implements DotFunction {
	private Token lengthKeyword;

	public DotFunction1(Token lengthKeyword) {
		super();
		this.lengthKeyword = lengthKeyword;
	}

	@Override
	public void printNode() {
		System.out.println("----------DotFunction----------");
		System.out.println("DotFunction : length = " + lengthKeyword.getValue());
		System.out.println("--------------------");
	}	
}
