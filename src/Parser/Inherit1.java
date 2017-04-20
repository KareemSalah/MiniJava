package Parser;

import MiniJava.Token;

public class Inherit1 implements Inherit {
	private Token extendsKeyword;
	private Identifier identifier;
	
	public Inherit1(Token extendsKeyword, Identifier identifier) {
		super();
		this.extendsKeyword = extendsKeyword;
		this.identifier = identifier;
	}

	@Override
	public void printNode() {
		System.out.println("----------Inherit----------");
		System.out.println("Inherit : extendsKeyword = " + extendsKeyword.getValue());
		System.out.println("Identifier : identifier = "); identifier.printNode();
		System.out.println("---------- ----------");
	}
	
	
}
