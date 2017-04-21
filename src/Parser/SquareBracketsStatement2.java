package Parser;


public class SquareBracketsStatement2 implements SquareBracketsStatement {
	private Epsilon epsilon;
	
	
	public SquareBracketsStatement2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}


	@Override
	public void printNode() {
		System.out.println("----------SquareBracketsStatement----------");		
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}

}
