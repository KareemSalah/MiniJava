package Parser;

public class ExpressionBeta2 implements ExpressionBeta {
	Epsilon epsilon;
		
	public ExpressionBeta2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}
	
	@Override
	public void printNode() {
		System.out.println("----------ExpressionBeta2----------");
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}

}
