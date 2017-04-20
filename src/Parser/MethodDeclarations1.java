package Parser;

public class MethodDeclarations1 implements MethodDeclarations{
	private MethodDeclaration methodDeclaration;
	private MethodDeclarations methodDeclarations;
	
	public MethodDeclarations1(MethodDeclaration methodDeclaration, MethodDeclarations methodDeclarations) {
		super();
		this.methodDeclaration = methodDeclaration;
		this.methodDeclarations = methodDeclarations;
	}

	@Override
	public void printNode() {
		System.out.println("----------Method declarations----------");
		System.out.println("Method declarations : methodDeclaration = "); methodDeclaration.printNode();
		System.out.println("Method declarations : methodDeclarations = "); methodDeclarations.printNode();
		System.out.println("--------------------");
	}	
}
