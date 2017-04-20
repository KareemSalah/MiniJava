package Parser;

public class SomeExpressions2 implements SomeExpressions {
	private Epsilon epsilon;

	public SomeExpressions2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}

	@Override
	public void printNode() {
		System.out.println("----------SomeExpressions----------");
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}	
}
