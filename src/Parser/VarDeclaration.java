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
		if(this.type!=null)this.type.printNode();else System.out.println("null");
		if(this.identifier!=null)this.identifier.printNode();else System.out.println("null");
		this.semiColon.getValue();
	}
	
}
