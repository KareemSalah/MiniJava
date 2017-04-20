package Parser;
import MiniJava.*;

public class AccessSpecifier1 implements AccessSpecifier,Node{
   Token Private ;
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Method Declation-------------");
		System.out.println(" AccessSpecifierPrivate : Access Specifier = " +Private.getValue());
		System.out.println("-------------------------------------");

	}
	public AccessSpecifier1(Token private1) {
		super();
		Private = private1;
	}
	

}
