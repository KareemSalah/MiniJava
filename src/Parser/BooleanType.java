package Parser;

import MiniJava.Token;


public class BooleanType extends Type implements Node {
	
	public BooleanType(ArrayType arrayType, Token typeKeyword) {
		super(typeKeyword, arrayType);
	}
	
	@Override
	public void printNode() {
		System.out.println("---------BooleanType----------");
		System.out.println(this.typeKeyword.getValue());
		this.arrayType.printNode();
	}
	
}