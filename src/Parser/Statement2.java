package Parser;

import MiniJava.Token;

public class Statement2 implements Statement{
	private Token left_bracket;
	private Token right_bracket;
	private Token if_token;
	private Expression expression;
	private Statement stmt;
	private ElseStatement else_stmt;
	
	public Statement2(Token left_bracket, Token right_bracket, Token if_token,
			Expression expression, Statement stmt, ElseStatement else_stmt) {
		super();
		this.left_bracket = left_bracket;
		this.right_bracket = right_bracket;
		this.if_token = if_token;
		this.expression = expression;
		this.stmt = stmt;
		this.else_stmt = else_stmt;
	}

	@Override
	public void printNode() {
		System.out.println("----------Statement----------");
		System.out.println("Statement : If token = " + if_token.getValue());
		System.out.println("Statement : Left bracket token = " + left_bracket.getValue());
		System.out.println("Statement : Expression = "); expression.printNode();
		System.out.println("Statement : Right bracket token = " + right_bracket.getValue());
		System.out.println("Statement : Statement = "); stmt.printNode();
		System.out.println("Statement : ElseStatement = "); else_stmt.printNode();
	}

}
