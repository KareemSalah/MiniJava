package Parser;

import MiniJava.Token;


public class StringType extends Type implements Node {
	
	public StringType(ArrayType arrayType, Token typeKeyword) {
		super(typeKeyword, arrayType);

	}
	
	@Override
	public void printNode() {
		System.out.println("---------StringType----------");
		System.out.println(this.typeKeyword.getValue());
		if(this.arrayType!=null)this.arrayType.printNode(); else System.out.println("null");
	}
	
}
