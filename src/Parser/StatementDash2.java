package Parser;

public class StatementDash2 implements StatementDash{
	private Epsilon epsilon;
	
	
	public StatementDash2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}


	@Override
	public void printNode() {
		System.out.println("----------Statement'----------");		
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}

}
