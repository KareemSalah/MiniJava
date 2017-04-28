package Parser;

import MiniJava.*;
public class CommaParameters1 implements CommaParameters,Node{
	Token Comma;
	Parameter P;
	CommaParameters CP1;
	public CommaParameters1(Token comma, Parameter p, CommaParameters cP1) {
		super();
		Comma = comma;
		P = p;
		CP1 =  cP1;
	}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Comma Parameters -------------");
		System.out.println("Comma Parameters : Comma = "+ Comma.getValue());
		System.out.println("Comma Parameters : Parameter = ");
		if(P!=null) P.printNode() ; else System.out.println("null");
		System.out.println("Comma Parameters : CommaParameter = ");
		if(CP1!=null) CP1.printNode() ; else System.out.println("null");
		System.out.println("----------------");

		
	}
	
	
	

}
