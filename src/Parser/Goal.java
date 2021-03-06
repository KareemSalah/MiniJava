package Parser;

import MiniJava.Token;

public class Goal implements Node {
	private MainClass mainClass;
	private ClassDeclarations classDeclarations;
	private Token eof;
	
	public Goal(MainClass mainClass, ClassDeclarations classDeclarations,
			Token eof) {
		super();
		this.mainClass = mainClass;
		this.classDeclarations = classDeclarations;
		this.eof = eof;
	}
	
	@Override
	public void printNode() {
		System.out.println("----------Goal----------");
		System.out.println("Goal : MainClass = "); mainClass.printNode();
		System.out.println("Goal : ClassDeclarations = "); classDeclarations.printNode();
		System.out.println("Goal : EOF token = " + eof.getValue());
	}

}
