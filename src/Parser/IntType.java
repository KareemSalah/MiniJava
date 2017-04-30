package Parser;

import MiniJava.Token;


public class IntType extends Type implements Node {
	
	public IntType(ArrayType arrayType, Token typeKeyword) {
		super(typeKeyword, arrayType);
		//System.out.println("Constructor ");
	}
	
	@Override
	public void printNode() {
		//System.out.println("herrrrr");
		System.out.println("---------IntType----------");
		System.out.println(this.typeKeyword.getValue());
		if(this.arrayType!=null)this.arrayType.printNode(); else System.out.println("null");
	}
	
}
