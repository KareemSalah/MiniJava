package Parser;

import MiniJava.Token;

public class ArrayType implements Node {
	Token squareBrackets;
	
	public ArrayType(Token squareBrackets) {
		this.squareBrackets = squareBrackets;
	}
	
	@Override
	public void printNode() {
		System.out.println("ArrayType:");
		System.out.println(this.squareBrackets.getValue());
	}
}
