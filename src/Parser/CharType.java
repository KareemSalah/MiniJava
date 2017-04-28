package Parser;

import MiniJava.Token;


public class CharType extends Type implements Node {
	
	public CharType(ArrayType arrayType, Token typeKeyword) {
		super(typeKeyword, arrayType);
	}
	
	@Override
	public void printNode() {
		System.out.println("---------CharType----------");
		System.out.println(this.typeKeyword.getValue());
		this.arrayType.printNode();
	}
	
}
