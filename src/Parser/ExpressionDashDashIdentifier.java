package Parser;

public class ExpressionDashDashIdentifier extends ExpressionDashDash {
	private Identifier identifier;

	public ExpressionDashDashIdentifier(Identifier identifier) {
		super();
		this.identifier = identifier;
	}

	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : identifier = "); identifier.printNode();
		System.out.println("--------------------");
	}
	
	
}
