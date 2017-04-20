package Parser;

import MiniJava.Token;

public class ClassDeclaration implements Node{
	private Token classKeyword;
	private Identifier id;
	private Inherit inherit;
	private Token openCurlyBracket;
	private VarDeclarations varDeclarations;
	private MethodDeclarations methodDeclarations;
	private Token closedCurlyBracket;
	
	public ClassDeclaration(Token classKeyword, Identifier id, Inherit inherit, Token openCurlyBracket,
			VarDeclarations varDeclarations, MethodDeclarations methodDeclarations, Token closedCurlyBracket) {
		super();
		this.classKeyword = classKeyword;
		this.id = id;
		this.inherit = inherit;
		this.openCurlyBracket = openCurlyBracket;
		this.varDeclarations = varDeclarations;
		this.methodDeclarations = methodDeclarations;
		this.closedCurlyBracket = closedCurlyBracket;
	}

	@Override
	public void printNode() {
		System.out.println("----------Class Declaration----------");
		System.out.println("Class Declaration : classKeyword = " + classKeyword.getValue());
		System.out.println("Class Declaration : id = "); id.printNode();
		System.out.println("Class Declaration : inherit = "); inherit.printNode();
		System.out.println("Class Declaration : openCurlyBracket = " + openCurlyBracket.getValue());
		System.out.println("Class Declaration : varDeclarations = "); varDeclarations.printNode();
		System.out.println("Class Declaration : methodDeclarations = "); methodDeclarations.printNode();
		System.out.println("Class Declaration : closedCurlyBracket = " + closedCurlyBracket.getValue());		
		
		System.out.println("--------------------");
	}
}
