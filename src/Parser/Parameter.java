package Parser;
//Parameter ::= Type Identifier
public class Parameter implements Node{
   Type type;
   Identifier id;
public Parameter(Type type, Identifier id) {
	super();
	this.type = type;
	this.id = id;
}
@Override
public void printNode() {
	// TODO Auto-generated method stub
	System.out.println("-------Parameter-------------");
	System.out.println("Parameter : Type = ");
	
	if(type!=null) type.printNode() ; else System.out.println("null");

	System.out.println("Parameter : ID = ");
	if(id!=null) id.printNode() ; else System.out.println("null");
	System.out.println("--------------------");
	
	
}
   
}
