package Parser;

public class StatementDash1 implements StatementDash{
	private Statement stmt;
	private StatementDash stmt_dash;
	
	public StatementDash1(Statement stmt, StatementDash stmt_dash) {
		super();
		this.stmt = stmt;
		this.stmt_dash = stmt_dash;
	}

	@Override
	public void printNode() {
		System.out.println("----------Statement'----------");
		System.out.println("Statement' : Statement = "); stmt.printNode();
		System.out.println("Statement' : Statmenet' = "); stmt_dash.printNode();
	}

}
