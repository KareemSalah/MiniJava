package Parser;

public class Parameters1 implements Parameters,Node{
    Parameter p;
    CommaParameters CP;
	public Parameters1(Parameter p, CommaParameters cP) {
		super();
		this.p = p;
		CP = cP;
	}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Actual Parameters-------------");
		System.out.println("Actual Parameters : Parameter = ");
		if(p!=null) p.printNode() ; else System.out.println("null");
		System.out.println("Actual Parameters : CommaParameters = ");
		if(CP!=null) CP.printNode() ; else System.out.println("null");
		System.out.println("------------------------------------");

		
	}

}
