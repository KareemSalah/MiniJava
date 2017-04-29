package Parser;

import MiniJava.Token;

public class SquareBracketsStatement1 implements SquareBracketsStatement {
	private Token left_square_bracket;
	private Expression expression;
	private Token right_square_bracket;
	
	public SquareBracketsStatement1(Token left_square_bracket,
			Expression expression, Token right_square_bracket) {
		super();
		this.left_square_bracket = left_square_bracket;
		this.expression = expression;
		this.right_square_bracket = right_square_bracket;
	}
	
	@Override
	public void printNode() {
		System.out.println("----------SquareBracketsStatement----------");
		System.out.println("SquareBracketsStatement : Left squre bracket token = " + left_square_bracket.getValue());
		System.out.println("SquareBracketsStatement : Expression = "); expression.printNode();
		System.out.println("SquareBracketsStatement : Right square bracket token = " + right_square_bracket.getValue());

	}

}