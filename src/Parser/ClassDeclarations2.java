package Parser;

public class ClassDeclarations2 implements ClassDeclarations {
	private Epsilon epsilon;
	
	
	public ClassDeclarations2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}


	@Override
	public void printNode() {
		System.out.println("----------ClassDeclarations----------");		
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}

}