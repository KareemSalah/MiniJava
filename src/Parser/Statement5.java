package Parser;

import MiniJava.Token;

public class Statement5 implements Statement {
	private Identifier id;
	private SquareBracketsStatement stmt;
	private Token equal_sign;
	private Expression expression;
	private Token semicolon;
	
	public Statement5(Identifier id, SquareBracketsStatement stmt,
			Token equal_sign, Expression expression, Token semicolon) {
		super();
		this.id = id;
		this.stmt = stmt;
		this.equal_sign = equal_sign;
		this.expression = expression;
		this.semicolon = semicolon;
	}

	@Override
	public void printNode() {
		System.out.println("----------Statement----------");
		System.out.println("Statement : Identifier = "); id.printNode();
		System.out.println("Statement : Square brackets statement = "); stmt.printNode();
		System.out.println("Statement : Equal sign token = " + equal_sign.getValue());
		System.out.println("Statement : Expression = "); expression.printNode();
		System.out.println("Statement : Semicolon token = " + semicolon.getValue());

	}

}
