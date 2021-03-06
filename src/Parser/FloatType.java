package Parser;

import MiniJava.Token;


public class FloatType extends Type implements Node {
	
	public FloatType(ArrayType arrayType, Token typeKeyword) {
		super(typeKeyword, arrayType);
	}
	
	@Override
	public void printNode() {
		System.out.println("---------FloatType----------");
		System.out.println(this.typeKeyword.getValue());
		if(this.arrayType!=null)this.arrayType.printNode(); else System.out.println("null");
	}
	
}
