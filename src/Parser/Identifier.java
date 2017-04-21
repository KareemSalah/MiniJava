package Parser;

import MiniJava.Token;


public class Identifier implements Node {

	private Token identifier;
	
	public Identifier(Token identifier) {
		this.identifier = identifier;
	}
			
	@Override
	public void printNode() {
		System.out.println("ID:");
		System.out.println(identifier.getValue());
	}

	
}
