package Parser;
import MiniJava.*;
//MainClass ::= "class" Identifier "{" "public" "static" "void" "main" "(" "String" "[""]" 
//Identifier ")" "{" Statement "}" "}"

public class MainClass implements Node{
	Token Class, Left_Curly_B, Public,Static,Void,Main,Left_Round_B,STRING,Left_Square_B,Right_Square_B;
	Token Right_Round_B , Left_Curly_B2 ,  Right_Curly_B2, Right_Curly_B;
	Identifier Id1,Id2;
	Statement stmt ;
	
	
	public MainClass(Token class1, Token left_Curly_B, Token public1, Token static1, Token void1, Token main,
			Token left_Round_B, Token sTRING, Token left_Square_B, Token right_Square_B, Token right_Round_B,
			Token left_Curly_B2, Token right_Curly_B2, Token right_Curly_B, Identifier id1, Identifier id2,
			Statement stmt) {
		super();
		Class = class1;
		Left_Curly_B = left_Curly_B;
		Public = public1;
		Static = static1;
		Void = void1;
		Main = main;
		Left_Round_B = left_Round_B;
		STRING = sTRING;
		Left_Square_B = left_Square_B;
		Right_Square_B = right_Square_B;
		Right_Round_B = right_Round_B;
		Left_Curly_B2 = left_Curly_B2;
		Right_Curly_B2 = right_Curly_B2;
		Right_Curly_B = right_Curly_B;
		Id1 = id1;
		Id2 = id2;
		this.stmt = stmt;
	}


	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Main Class-------------");
		System.out.println("Main Class : Class = "+Class.getValue() + "Main Class: Identifier = ");
		if(Id1!=null) Id1.printNode() ; else System.out.println("null");
		System.out.println("Main Class : Left_Curly_B = "+Left_Curly_B.getValue());
		System.out.println("Main Class : Public = "+Public.getValue());
		System.out.println("Main Class : Static = "+Static.getValue());
		System.out.println("Main Class : Void = "+Void.getValue());
		System.out.println("Main Class : Main = "+Main.getValue());
		System.out.println("Main Class : Left_Round_B = "+Left_Round_B.getValue());
		System.out.println("Main Class : String = "+STRING.getValue());
		System.out.println("Main Class : Left_Square_B = "+Left_Square_B.getValue());
		System.out.println("Main Class : Right_Square_B = "+Right_Square_B.getValue());
		if(Id2!=null) Id2.printNode() ; else System.out.println("null");
		System.out.println("Main Class : Right_Round_B = "+Right_Round_B.getValue());
		System.out.println("Main Class : Left_Curly_B2 = "+Left_Curly_B2.getValue() + "Main Class: Statement = ");
		if(stmt!=null) stmt.printNode() ; else System.out.println("null");
		System.out.println("Main Class : Right_Curly_B2 = "+Right_Curly_B2.getValue());
		System.out.println("Main Class : Right_Curly_B = "+Right_Curly_B.getValue());
		
		
		System.out.println("--------------------");
	}


}
