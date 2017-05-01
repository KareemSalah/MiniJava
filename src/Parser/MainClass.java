package Parser;
import MiniJava.*;



public class MainClass implements Node {
	private Token[] tokens = new Token[14];
	private Identifier Id1, Id2;
	private Statement stmt;

	
	public MainClass(Token[] tokens, Identifier Id1, Identifier Id2, Statement stmt) {
		this.tokens = tokens;
		this.Id1 = Id1;
		this.Id2 = Id2;
		this.stmt = stmt;
	}
	
	@Override
	public void printNode() {
		System.out.println("-------Main Class-------------");
		for(int i = 0;i < 14;i++) {
			System.out.println(this.tokens[i].getType() + ": " + this.tokens[i].getValue());
		}
	}
	
}
