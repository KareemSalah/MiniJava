package Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import MiniJava.Lexiacalanalysis;
import MiniJava.Token;

public class Parser {
	Queue<Token> queue = new LinkedList<Token>();
	ArrayList<Token> Tokens = new ArrayList<>();

	public Parser(String fileName) throws IOException {
		// TODO Auto-generated constructor stub
		Tokens = getTokens(fileName);
		for (int i = 0; i < Tokens.size(); i++) {
			queue.add(Tokens.get(i));
		}
		for (int i = 0; i < queue.size(); i++) {
			Token t = queue.peek();
			System.out.println(t.toString());
			queue.poll();
		}

	}

	public ArrayList<Token> getTokens(String fileName) throws IOException {
		Lexiacalanalysis la = new Lexiacalanalysis();
		return la.getAllTokens(fileName);

	}

	// MainClass ::= "class" Identifier "{" "public" "static" "void" "main" "("
	// "String" "[""]" Identifier ")"
	// "{" Statement "}" "}"
	public Token getToken() {
		Token t = queue.peek();
		return t;
	}

	private MainClass mainClassRule() {
		Token t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13;
		t = queue.peek();
		if (t.getType() != "CLASS") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		Identifier id1 = identifierRule();
		t1 = queue.peek();
		if (t1.getType() != "LEFT_CURLY_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t2 = queue.peek();
		if (t2.getType() != "PUBLIC") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t3 = queue.peek();
		if (t3.getType() != "STATIC") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t4 = queue.peek();
		if (t4.getType() != "VOID") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t5 = queue.peek();
		if (t5.getType() != "MAIN") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t6 = queue.peek();
		if (t6.getType() != "LEFT_ROUND_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t7 = queue.peek();
		if (t7.getType() != "STRING") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t8 = queue.peek();
		if (t8.getType() != "LEFT_SQUARE_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t9 = queue.peek();
		if (t9.getType() != "RIGHT_SQUARE_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		Identifier id2 = identifierRule();
		t10 = queue.peek();
		if (t10.getType() != "RIGHT_ROUND_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t11 = queue.peek();
		if (t11.getType() != "LEFT_CURLY_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		Statement stmt = stmtRule();
		t12 = queue.peek();
		if (t12.getType() != "RIGHT_CURLY_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t13 = queue.peek();
		if (t13.getType() != "RIGHT_CURLY_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		return new MainClass(t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, id1, id2, stmt);

	}
	// MethodDeclaration ::= AccessSpecifier Type Identifier "(" Parameters ")"
	// "{" VarDeclarations Statement' "return" Expression";" "}"

	private ClassDeclaration classDeclarationRule() {
		Token classKeyword = queue.peek();
		if (classKeyword != null && classKeyword.getType().equals("CLASS")) {
			queue.poll();
			Identifier identifier = identifierRule();
			if (identifier != null) {
				Inherit inherit = inheritRule();
				if (inherit != null) {
					Token openCurlyBrackets = queue.peek();
					if (openCurlyBrackets != null && openCurlyBrackets.getType().equals("LEFT_CURLY_B")) {
						queue.poll();
						VarDeclarations varDeclarations = varDeclarationsRule();
						if (varDeclarations != null) {
							MethodDeclarations methodDeclarations = methodDeclarationsRule();
							if (methodDeclarations != null) {
								Token closedCurlyBrackets = queue.peek();
								if (closedCurlyBrackets != null
										&& closedCurlyBrackets.getType().equals("RIGHT_CURLY_B")) {
									queue.poll();
									return new ClassDeclaration(classKeyword, identifier, inherit, openCurlyBrackets,
											varDeclarations, methodDeclarations, closedCurlyBrackets);
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	private Inherit inheritRule() {
		Token extendsKeyword = queue.peek();
		if (extendsKeyword != null && extendsKeyword.equals("EXTENDS")) {
			queue.poll();
			Identifier identifier = identifierRule();
			if (identifier != null) {
				return new Inherit1(extendsKeyword, identifier);
			}
		}
		return new Inherit2(new Epsilon());
	}

	private VarDeclarations varDeclarationsRule() {
		VarDeclaration varDeclaration = varDeclarationRule();
		if (varDeclaration != null) {
			VarDeclarations varDeclarations = varDeclarationsRule();
			if (varDeclarations != null) {
				new VarDeclarations1(varDeclaration, varDeclarations);
			}
		}
		return new VarDeclarations2(new Epsilon());
	}

	private MethodDeclarations methodDeclarationsRule() {
		MethodDeclaration methodDeclaration = methodDeclarationRule();
		if (methodDeclaration != null) {
			MethodDeclarations methodDeclarations = methodDeclarationsRule();
			if (methodDeclarations != null) {
				return new MethodDeclarations1(methodDeclaration, methodDeclarations);
			}
		}
		return new MethodDeclarations2(new Epsilon());
	}

	private MethodDeclaration methodDeclarationRule() {
		Token Left_Round_B, Right_Round_B, Left_Curly_B, Return, Semicolon, Right_Curly_B;
		AccessSpecifier access;
		Type type;
		Identifier id;
		Parameters ps;
		VarDeclarations var;
		StatementDash stmt;
		Expression exp;
		access = accessSpecifierRule();
		type = typeRule();
		id = identifierRule();
		Left_Round_B = queue.peek();
		if (Left_Round_B.getType() != "LEFT_ROUND_B") {
			System.out.println("Syntax Error");
			return null;
		} else
			queue.poll();

		ps = parametersRule();
		Right_Round_B = queue.peek();
		if (Right_Round_B.getType() != "RIGHT_ROUND_B") {
			System.out.println("Syntax Error");
			return null;
		} else
			queue.poll();
		Left_Curly_B = queue.peek();
		if (Left_Curly_B.getType() != "LEFT_CURLY_B") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();

		var = varDeclarationsRule();
		stmt = stmtDashRule();
		Return = queue.peek();
		if (Return.getType() != "RETURN") {
			System.out.println("Syntax Error");
			return null;
		} else
			queue.poll();
		exp = expressionRule();
		Semicolon = queue.peek();
		if (Semicolon.getType() != "SEMICOLON") {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		Right_Curly_B = queue.peek();
		if (Right_Curly_B.getType() != "RIGHT_CURLY_B") {
			System.out.println("Syntax Error");
			return null;
		} else
			queue.poll();

		return new MethodDeclaration(Left_Round_B, Right_Round_B, Left_Curly_B, Return, Semicolon, Right_Curly_B,
				access, type, id, ps, var, stmt, exp);

	}

	private StatementDash stmtDashRule() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * 
	 * Parameters ::= Parameter CommaParameters | Lambda
	 */
	private Parameters parametersRule() {
		// TODO Auto-generated method stub
		Parameter p = ParameterRule();
		if (p == null) {
			Parameters pS = new Parameters2();
			return pS;
		}
		CommaParameters c = CommaParametersRule();
		Parameters pS = new Parameters1(p, c);
		return pS;

	}
	// CommaParameters ::= "," Parameter CommaParameters | Lambda

	private CommaParameters CommaParametersRule() {
		// TODO Auto-generated method stub
		Token t = queue.peek();
		if (t.getType() != "COMMA") {
			CommaParameters c = new CommaParameters2();
			return c;
		}
		Parameter p = ParameterRule();
		CommaParameters cP = CommaParametersRule();
		CommaParameters c = new CommaParameters1(t, p, cP);
		return c;

	}

	// Parameter ::= Type Identifier
	private Parameter ParameterRule() {
		// TODO Auto-generated method stub

		Type t = typeRule();
		Identifier id = identifierRule();
		return new Parameter(t, id);
	}

	private Type typeRule() {

		// TODO Auto-generated method stub
		return null;
	}

	private AccessSpecifier accessSpecifierRule() {
		// TODO Auto-generated method stub
		Token t = queue.peek();
		if (t.equals("PRIVATE")) {
			AccessSpecifier a = new AccessSpecifier1(t);
			return a;
		} else if (t.equals("PUBLIC")) {
			AccessSpecifier a = new AccessSpecifier2(t);
			return a;

		}
		return null;
	}

	private Statement stmtRule() {
		// TODO Auto-generated method stub
		return null;
	}

	private Expression expressionRule() {
		ExpressionDash expressionDash = expressionDashRule();
		if (expressionDash != null) {
			return new ExpressionDash() {
			};
		}
		ExpressionDashDash expressionDashDash = expressionDashDashRule();
		if (expressionDashDash != null) {
			return new ExpressionDashDash() {
			};
		}
		return null;
	}

	private ExpressionDash expressionDashRule() {
		OP op = opRule();
		if (op != null) {
			Expression expression = expressionRule();
			if (expression != null) {
				return new ExpressionDash1(op, expression);
			}
		}

		Token openSquareBrackets = queue.peek();
		if (openSquareBrackets != null && openSquareBrackets.getType().equals("LEFT_SQUARE_B")) {
			queue.poll();
			Expression expression = expressionRule();
			if (expression != null) {
				Token closedSquareBrackets = queue.peek();
				if (closedSquareBrackets != null && closedSquareBrackets.getType().equals("RIGHT_SQUARE_B")) {
					queue.poll();
					return new ExpressionDash2(openSquareBrackets, expression, closedSquareBrackets);
				}
			}
		}

		Token dot = queue.peek();
		if (dot != null && dot.getType().equals("DOT")) {
			queue.poll();
			DotFunction dotFunction = dotFunctionRule();
			if(dotFunction != null){
				return new ExpressionDash3(dot, dotFunction);
			}
		}
		return null;
	}

	private OP opRule(){
		Token token = queue.peek();
		if(token != null){
			if(token.getType().equals("AND") || token.getType().equals("LESSTHAN") || token.getType().equals("PLUS") || token.getType().equals("MINUS") || token.getType().equals("MULTIPLY")){
				queue.poll();
				return new OP(token);
			}
			System.out.println("Invalid operator");
		}
		return null;
	}

	private DotFunction dotFunctionRule(){
		Token lengthKeyword = queue.peek();
		if(lengthKeyword != null && lengthKeyword.getType().equals("LENGTH")){
			queue.poll();
			return new DotFunction1(lengthKeyword);
		}
		
		Identifier identifier = identifierRule();
		if(identifier != null){
			Token openCircleBrackets = queue.peek();
			if(openCircleBrackets != null && openCircleBrackets.getType().equals("LEFT_ROUND_B")){
				queue.poll();
				SomeExpressions someExpressions = someExpressionsRule();
				if(someExpressions != null){
					Token closedCircleBrackets = queue.peek();
					if(closedCircleBrackets != null && closedCircleBrackets.getType().equals("RIGHT_ROUND_B")){
						queue.poll();
						return new DotFunction2(identifier, openCircleBrackets, someExpressions, closedCircleBrackets);
					}
				}
			}
		}
		
		return null;
	}

	private SomeExpressions someExpressionsRule(){
		Expression expression = expressionRule();
		if(expression != null){
			CommaExpression commaExpression = commaExpressionRule();
			if(commaExpression != null){
				return new SomeExpressions1(expression, commaExpression);
			}
		}
		return new SomeExpressions2(new Epsilon());
	}

	private CommaExpression commaExpressionRule(){
		Token comma = queue.peek();
		if(comma != null && comma.getType().equals("COMMA")){
			queue.poll();
			Expression expression = expressionRule();
			if(expression != null){
				CommaExpression commaExpression = commaExpressionRule();
				if(commaExpression != null){
					return new CommaExpression1(comma, expression, commaExpression);
				}
			}
		}
		return new CommaExpression2(new Epsilon());
	}

	private ExpressionDashDash expressionDashDashRule(){
		Token integerLiteral = queue.peek();
		if(integerLiteral != null && integerLiteral.getType().equals("INTEGRAL_LITERAL")){
			queue.poll();
			return new ExpressionDashDashIntegerLiteral(integerLiteral);
		}
		
		Token trueKeyword = queue.peek();
		if(trueKeyword != null && trueKeyword.getType().equals("TRUE")){
			queue.poll();
			return new ExpressionDashDashTrue(trueKeyword);
		}
		
		Token falseKeyword = queue.peek();
		if(falseKeyword != null && falseKeyword.getType().equals("FALSE")){
			queue.poll();
			return new ExpressionDashDashFalse(falseKeyword);
		}
		
		Identifier identifier = identifierRule();
		if(identifier != null){
			return new ExpressionDashDashIdentifier(identifier);
		}
		
		Token thisKeyword = queue.peek();
		if(thisKeyword != null && thisKeyword.getType().equals("THIS")){
			queue.poll();
			return new ExpressionDashDashThis(thisKeyword);
		}
		
		Token newKeyword = queue.peek();
		if(newKeyword != null && newKeyword.getType().equals("NEW")){
			queue.poll();
			NewDash newDash = newDashRule();
			if(newDash != null){
				return new ExpressionDashDashNew(newKeyword, newDash);
			}
		}
		
		Token not = queue.peek();
		if(not != null && not.getType().equals("NOT")){
			queue.poll();
			Expression expression = expressionRule();
			if(expression != null){
				return new ExpressionDashDashNot(not, expression);
			}
		}
		
		Token openCircleBrackets = queue.peek();
		if(openCircleBrackets != null && openCircleBrackets.getType().equals("LEFT_ROUND_B")){
			queue.poll();
			
			Expression expression = expressionRule();
			if(expression != null){
				Token closedCircleBrackets = queue.peek();
				if(closedCircleBrackets != null && closedCircleBrackets.getType().equals("RIGHT_ROUND_B")){
					queue.poll();
					return new ExpressionDashDashBrackets(openCircleBrackets, expression, closedCircleBrackets);
				}
			}
		}
		
		return null;
	}
	
	private NewDash newDashRule(){
		Token intKeyword = queue.peek();
		if(intKeyword != null && intKeyword.getType().equals("INT")){
			queue.poll();
			Token openSquareBrackets = queue.peek();
			if(openSquareBrackets != null && openSquareBrackets.getType().equals("LEFT_SQUARE_B")){
				queue.poll();
				Expression expression = expressionRule();
				if(expression != null){
					Token closedSquareBrackets = queue.peek();
					if(closedSquareBrackets != null && closedSquareBrackets.getType().equals("RIGHT_SQUARE_B")){
						queue.poll();
						return new NewDash1(intKeyword, openSquareBrackets, expression, closedSquareBrackets);
					}
				}
			}
		}
		
		Identifier identifier = identifierRule();
		if(identifier != null){
			Token openCircleBrackets = queue.peek();
			if(openCircleBrackets != null && openCircleBrackets.getType().equals("LEFT_ROUND_B")){
				queue.poll();
				Token closedCircleBrackets = queue.peek();
				if(closedCircleBrackets != null && closedCircleBrackets.getType().equals("RIGHT_ROUND_B")){
					queue.poll();
					return new NewDash2(identifier, openCircleBrackets, closedCircleBrackets);
				}
			}
		}
		
		return null;
	}
	
	private Identifier identifierRule() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Parser p = new Parser("TC4.txt");

	}

}
