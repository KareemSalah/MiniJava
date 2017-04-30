package Parser;

import MiniJava.Token;

public class ArrayType implements Node {
	Token leftsquareBrackets;
	Token rightsquareBrackets;
	int indicator = 0;
	public ArrayType()
	{
		this.indicator = 1;
	}
	public ArrayType(Token leftsquareBrackets, Token rightsquareBrackets) {
		super();
		this.leftsquareBrackets = leftsquareBrackets;
		this.rightsquareBrackets = rightsquareBrackets;
		
	}

		
	@Override
	public void printNode() {
		if (this.indicator == 0) {
		System.out.println("ArrayType:");
		System.out.println(this.leftsquareBrackets.getValue());
		System.out.println(this.rightsquareBrackets.getValue()); }
		else {
			System.out.println("---------Lambda ArrayType----------");
			System.out.println("Epsilion Paramter : Parameter is "+ " Epsilion");
			System.out.println("------------------");

		}

	}
}
