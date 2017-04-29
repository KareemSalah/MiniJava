package Parser;

import MiniJava.Token;

public class Statement3 implements Statement {
	private Token while_token;
	private Token left_bracket;
	private Token right_bracket;
	private Expression expression;
	private Statement stmt;
	
	public Statement3(Token while_token, Token left_bracket,
			Token right_bracket, Expression expression, Statement stmt) {
		super();
		this.while_token = while_token;
		this.left_bracket = left_bracket;
		this.right_bracket = right_bracket;
		this.expression = expression;
		this.stmt = stmt;
	}
	
	@Override
	public void printNode() {
		System.out.println("----------Statement----------");
		System.out.println("Statement : While token = " + while_token.getValue());
		System.out.println("Statement : Left bracket token = " + left_bracket.getValue());
		System.out.println("Statement : Expression = "); expression.printNode();
		System.out.println("Statement : Right bracket token = " + right_bracket.getValue());
		System.out.println("Statement : Statement = "); stmt.printNode();

	}

}