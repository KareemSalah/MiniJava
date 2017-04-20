package Parser;

public class VarDeclarations1 implements VarDeclarations {
	private VarDeclaration varDeclaration;
	private VarDeclarations varDeclarations;
	
	public VarDeclarations1(VarDeclaration varDeclaration, VarDeclarations varDeclarations) {
		super();
		this.varDeclaration = varDeclaration;
		this.varDeclarations = varDeclarations;
	}

	@Override
	public void printNode() {
		System.out.println("----------Var declarations----------");
		System.out.println("VarDeclaration : varDeclaration = "); varDeclaration.printNode();
		System.out.println("VarDeclarations : varDeclarations = "); varDeclarations.printNode();
		System.out.println("--------------------");
	}
}
