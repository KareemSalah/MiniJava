package Parser;

public class MethodDeclarations2 implements MethodDeclarations {
	private Epsilon epsilon;

	public MethodDeclarations2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}

	@Override
	public void printNode() {
		System.out.println("----------Method declarations----------");
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}
	
	
}
