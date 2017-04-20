package Parser;

public class CommaExpression2 implements CommaExpression {
	Epsilon epsilon;

	public CommaExpression2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}

	@Override
	public void printNode() {
		System.out.println("----------CommaExpression----------");
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}
}
