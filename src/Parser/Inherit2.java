package Parser;

public class Inherit2 implements Inherit {
	Epsilon epsilon;

	public Inherit2(Epsilon epsilon) {
		super();
		this.epsilon = epsilon;
	}

	@Override
	public void printNode() {
		System.out.println("----------Inherit----------");
		System.out.println("Epsilon");
		System.out.println("--------------------");
	}
}
