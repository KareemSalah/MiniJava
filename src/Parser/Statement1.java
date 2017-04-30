package Parser;

import MiniJava.Token;

public class Statement1 implements Statement{
	private Token left_curly_bracket;
	private StatementDash stmtDash;
	private Token right_curly_bracket;
	
	public Statement1(Token left_curly_bracket, StatementDash stmtDash,
			Token right_curly_bracket) {
		super();
		this.left_curly_bracket = left_curly_bracket;
		this.stmtDash = stmtDash;
		this.right_curly_bracket = right_curly_bracket;
	}
	
	public void printNode() {
		System.out.println("----------Statement----------");
		System.out.println("Statement : Left curly bracket token = " + left_curly_bracket.getValue());
		System.out.println("Statement : Statement' = "); stmtDash.printNode();
		System.out.println("Statement : Right curly bracket token = " + right_curly_bracket.getValue());
	}

	
}
