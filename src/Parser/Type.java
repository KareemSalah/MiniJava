package Parser;

import MiniJava.Token;


public class Type implements Node {
	
	protected Token typeKeyword;
	protected ArrayType arrayType;

	
	public Type(Token typeKeyword, ArrayType arrayType) {
		this.typeKeyword = typeKeyword;
		this.arrayType = arrayType;
	}
	
	@Override
	public void printNode() {
//		System.out.println("---------Type------------");
//		System.out.println(this.typeKeyword.getValue());
//		this.arrayType.printNode();
	}

}
