package Parser;
import MiniJava.*;
//MethodDeclaration ::= AccessSpecifier Type Identifier "(" Parameters ")" 
//"{" VarDeclarations Statement' "return" Expression";" "}"

public class MethodDeclaration implements Node{
	Token Left_Round_B,Right_Round_B,Left_Curly_B,Return,Semicolon,Right_Curly_B ;
	AccessSpecifier access;
	Type type;
	Identifier id;
	Parameters ps;
	VarDeclarations var;
	StatementDash stmt;
	Expression exp;

	public MethodDeclaration(Token left_Round_B, Token right_Round_B, Token left_Curly_B, Token return1,
			Token semicolon, Token right_Curly_B, AccessSpecifier access, Type type, Identifier id, Parameters ps,
			VarDeclarations var, StatementDash stmt, Expression exp) {
		super();
		Left_Round_B = left_Round_B;
		Right_Round_B = right_Round_B;
		Left_Curly_B = left_Curly_B;
		Return = return1;
		Semicolon = semicolon;
		Right_Curly_B = right_Curly_B;
		this.access = access;
		this.type = type;
		this.id = id;
		this.ps = ps;
		this.var = var;
		this.stmt = stmt;
		this.exp = exp;
	}
	//MethodDeclaration ::= AccessSpecifier Type Identifier "(" Parameters ")" 
	//"{" VarDeclarations Statement' "return" Expression";" "}"

	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println("-------Method Declation-------------");
		System.out.println("Method Declation : Access Specifier = ");
		if(access!=null) access.printNode() ; else System.out.println("null");
		System.out.println("Method Declation : Type = ");
		if(type!=null) type.printNode() ; else System.out.println("null");
		System.out.println("Method Declation : Id = ");
		if(id!=null) id.printNode() ; else System.out.println("null");
		System.out.println("Method Declation : Left_Round_B = "+Left_Round_B.getValue());
		System.out.println("Method Declation : Parameters = ");
		if(ps!=null) ps.printNode() ; else System.out.println("null");
		System.out.println("Method Declation : Right_Round_B = "+Right_Round_B.getValue());
		System.out.println("Method Declation : Left_Curly_B = "+Left_Curly_B.getValue());
		System.out.println("Method Declation : VarDeclations = ");
		if(var!=null) var.printNode() ; else System.out.println("null");
		System.out.println("Method Declation : StatementDash = ");
		if(stmt!=null) stmt.printNode() ; else System.out.println("null");
		System.out.println("Method Declation : Return = "+Return.getValue());
		System.out.println("Method Declation : Expression = ");
		if(exp!=null) exp.printNode() ; else System.out.println("null");
		System.out.println("Method Declation : SemiColon = " +Semicolon.getValue());
		System.out.println("Method Declation : Right_Curly_B = "+Right_Curly_B.getValue());

				System.out.println("--------------------");

		
	}
	

}
