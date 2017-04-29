package Parser;

import MiniJava.Token;

public class ElseStatement1 implements ElseStatement {
	private Token else_token;
	private Statement stmt;
	
	public ElseStatement1(Token else_token, Statement stmt) {
		super();
		this.else_token = else_token;
		this.stmt = stmt;
	}
	
	@Override
	public void printNode() {
		System.out.println("----------ElseStatement----------");
		System.out.println("ElseStatement : Else token = " + else_token.getValue());
		System.out.println("ElseStatement : Statement = "); stmt.printNode();
	}

}