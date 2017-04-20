package Parser;

import MiniJava.Token;

public class AccessSpecifier2 implements AccessSpecifier,Node{
   Token Public ;
	public AccessSpecifier2(Token public1) {
	super();
	Public = public1;
}
	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Method Declation-------------");
		System.out.println(" AccessSpecifierPublic : Access Specifier = " +Public.getValue());
		System.out.println("-------------------------------------");

		
	}
	

}
