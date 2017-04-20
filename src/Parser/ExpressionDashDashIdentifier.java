package Parser;

public class ExpressionDashDashIdentifier implements ExpressionDashDash {
	private Identifier identifier;

	public ExpressionDashDashIdentifier(Identifier identifier) {
		super();
		this.identifier = identifier;
	}

	@Override
	public void printNode() {
		System.out.println("----------ExpressionDashDash----------");
		System.out.println("ExpressionDashDash : identifier = "); identifier.printNode();
		System.out.println("--------------------");
	}
	
	
}
