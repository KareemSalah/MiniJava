package Parser;

import MiniJava.Token;

public class VarDeclaration implements Node{
	
	private Type type;
	private Identifier identifier;
	Token semiColon;
	
	public VarDeclaration(Type type, Identifier id, Token semiColon) {
		this.type = type;
		this.identifier = id;
		this.semiColon = semiColon;
	}
	
	@Override
	public void printNode() {
		System.out.println("----------------- VarDeclaration ----------------");
		this.type.printNode();
		this.identifier.printNode();
		this.semiColon.getValue();
	}
	
}
