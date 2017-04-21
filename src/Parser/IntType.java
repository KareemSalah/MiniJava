package Parser;

import MiniJava.Token;


public class IntType extends Type implements Node {
	
	public IntType(ArrayType arrayType, Token typeKeyword) {
		super(typeKeyword, arrayType);
	}
	
	@Override
	public void printNode() {
		System.out.println("---------IntType----------");
		System.out.println(this.typeKeyword.getValue());
		this.arrayType.printNode();
	}
	
}
