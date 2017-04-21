package Parser;

public class ClassDeclarations1 implements ClassDeclarations {
	private ClassDeclaration classDeclarartion;
	private ClassDeclarations classDeclarations;
	
	
	public ClassDeclarations1(ClassDeclaration classDeclarartion,
			ClassDeclarations classDeclarations) {
		super();
		this.classDeclarartion = classDeclarartion;
		this.classDeclarations = classDeclarations;
	}

	@Override
	public void printNode() {
		System.out.println("----------ClassDeclarations----------");
		System.out.println("ClassDeclarations : ClassDeclaration = "); classDeclarartion.printNode();
		System.out.println("ClassDeclarations : ClassDeclarations = "); classDeclarations.printNode();
	}

}
