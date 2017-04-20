package Parser;

public class VarDeclarations2 implements VarDeclarations {
	private Epsilon epsilon;

	public VarDeclarations2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}

	@Override
	public void printNode() {
		System.out.println("----------Var declarations----------");
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}	
	
	
}
