package Parser;

import MiniJava.Token;

public class ElseStatement2 implements ElseStatement {
	private Epsilon epsilon;
	
	public ElseStatement2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}

	@Override
	public void printNode() {
		System.out.println("----------ElseStatement----------");
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}

}
