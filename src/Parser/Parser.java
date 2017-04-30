package Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import MiniJava.*;

public class Parser {
	Queue<Token> queue = new LinkedList<Token>();
	ArrayList<Token> Tokens = new ArrayList<>();

	public Parser(String fileName) throws IOException {
		// TODO Auto-generated constructor stub
		Tokens = getTokens(fileName);
		
		for (int i = 0; i < Tokens.size(); i++) {
			queue.add(Tokens.get(i));
		}
		System.out.println(queue.size());
		/*for (int i = 0; i < queue.size(); i++) {
			System.out.println(queue.peek());
			Token t = queue.peek();
			System.out.println(t.toString());
			queue.poll();
		}*/

	}

	public ArrayList<Token> getTokens(String fileName) throws IOException {
		Lexiacalanalysis la = new Lexiacalanalysis();
		return la.getAllTokens(fileName);

	}

	// MainClass ::= "class" Identifier "{" "public" "static" "void" "main" "("
	// "String" "[""]" Identifier ")"
	// "{" Statement "}" "}"


	private MainClass mainClassRule() {
		Token t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13;
		t = queue.peek();
		if (!t.getType().equals("CLASS") ) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		Identifier id1 = identifierRule();
		t1 = queue.peek();
		if (!t1.getType().equals("LEFT_CURLY_B") ) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t2 = queue.peek();
		if (!t2.getType().equals("PUBLIC")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t3 = queue.peek();
		if (!t3.getType().equals("STATIC")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t4 = queue.peek();
		if (!t4.getType().equals("VOID") ) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t5 = queue.peek();
		if (!t5.getType().equals("MAIN")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t6 = queue.peek();
		if (!t6.getType().equals("LEFT_ROUND_B") ) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t7 = queue.peek();
		if (!t7.getType().equals("STRING")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t8 = queue.peek();
		if (!t8.getType().equals("LEFT_SQUARE_B")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t9 = queue.peek();
		if (!t9.getType().equals("RIGHT_SQUARE_B")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		Identifier id2 = identifierRule();
		t10 = queue.peek();
		if (!t10.getType().equals("RIGHT_ROUND_B")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t11 = queue.peek();
		if (!t11.getType().equals("LEFT_CURLY_B")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		Statement stmt = stmtRule();
		t12 = queue.peek();
		if (!t12.getType().equals("RIGHT_CURLY_B")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		t13 = queue.peek();
		if (!t13.getType().equals("RIGHT_CURLY_B")) {
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
		if (!Right_Round_B.getType().equals("RIGHT_ROUND_B")) {
			System.out.println("Syntax Error");
			return null;
		} else
			queue.poll();
		Left_Curly_B = queue.peek();
		if (!Left_Curly_B.getType().equals("LEFT_CURLY_B")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();

		var = varDeclarationsRule();
		stmt = stmtDashRule();
		Return = queue.peek();
		if (!Return.getType().equals("RETURN")) {
			System.out.println("Syntax Error");
			return null;
		} else
			queue.poll();
		exp = expressionRule();
		Semicolon = queue.peek();
		if (!Semicolon.getType().equals("SEMICOLON")) {
			System.out.println("Syntax Error ");
			return null;
		} else
			queue.poll();
		Right_Curly_B = queue.peek();
		if (!Right_Curly_B.getType().equals("RIGHT_CURLY_B")) {
			System.out.println("Syntax Error");
			return null;
		} else
			queue.poll();

		return new MethodDeclaration(Left_Round_B, Right_Round_B, Left_Curly_B, Return, Semicolon, Right_Curly_B,
				access, type, id, ps, var, stmt, exp);

	}

	
	

	private StatementDash stmtDashRule() {
		Statement stmt = stmtRule();
		if(stmt!=null){
			StatementDash stmtDash = stmtDashRule();
			if(stmtDash!=null){
				return new StatementDash1(stmt,stmtDash);
			}
		}
		return new StatementDash2(new Epsilon());
	}
	

	private Statement stmtRule() {
		Token first_token = queue.peek();
		if(first_token!=null && first_token.getType().equals("LEFT_CURLY_B")){
			queue.poll();
			StatementDash stmtDash = stmtDashRule();
			if(stmtDash!=null){
				Token right_curly_bracket = queue.peek();
				if(right_curly_bracket!=null && right_curly_bracket.getType().equals("RIGHT_CURLY_B")){
					queue.poll();
					return new Statement1(first_token,stmtDash,right_curly_bracket);
				}
			}
		}
		else if(first_token!=null && first_token.getType().equals("IF")){
				queue.poll();
				Token left_bracket = queue.peek();
				if(left_bracket!=null && left_bracket.getType().equals("LEFT_ROUND_B")){
					queue.poll();
					Expression expression = expressionRule();
					if(expression!=null){
						Token right_bracket = queue.peek();
						if(right_bracket!=null && right_bracket.getType().equals("RIGHT_ROUND_B")){
							queue.poll();
							Statement stmt = stmtRule();
							if(stmt!=null){
								ElseStatement elseStmt = elseStmtRule();
								if(elseStmt!=null){
									return new Statement2(left_bracket,right_bracket,first_token,expression,stmt,elseStmt);
								}
						}
					}
				}
			}
		}
		else if(first_token!=null && first_token.getType().equals("WHILE")){
			queue.poll();
			Token left_bracket = queue.peek();
			if(left_bracket!=null && left_bracket.getType().equals("LEFT_ROUND_B")){
				queue.poll();
				Expression expression = expressionRule();
				if(expression!=null){
					Token right_bracket = queue.peek();
					if(right_bracket!=null && right_bracket.getType().equals("RIGHT_ROUND_B")){
						queue.poll();
						Statement stmt = stmtRule();
						if(stmt!=null){
							return new Statement3(first_token,left_bracket,right_bracket,expression,stmt);
						}
						
					}
					}
				}
		}
		else if(first_token!=null && first_token.getType().equals("SYSTEM.OUT.PRINTLN")){
			queue.poll();
			Token left_bracket = queue.peek();
			if(left_bracket!=null && left_bracket.getType().equals("LEFT_ROUND_B")){
				queue.poll();
				Expression expression = expressionRule();
				if(expression!=null){
					Token right_bracket = queue.peek();
					if(right_bracket!=null && right_bracket.getType().equals("RIGHT_ROUND_B")){
						Token semicolon = queue.peek();
						if(semicolon!=null && semicolon.getType().equals("SEMICOLON")){
							queue.poll();
							return new Statement4(first_token,left_bracket,right_bracket,expression,semicolon);
						}
					}	
				}
			}
		}
		else{
			Identifier identifier = identifierRule();
			if(identifier!=null){
				SquareBracketsStatement squareStmt = squareBracketsStmtRule();
				if(squareStmt!=null){
					Token equal = queue.peek();
					if(equal !=null&&equal.getType().equals("EQUAL")){
						queue.poll();
						Expression expression = expressionRule();
						if(expression!=null){
							Token semicolon = queue.peek();
							if(semicolon!=null && semicolon.getType().equals("SEMICOLON")){
								queue.poll();
								return new Statement5(identifier,squareStmt,equal,expression,semicolon);
							}
						}
					}
				}
			}
		}
		return null;
	}
	
	private ElseStatement elseStmtRule(){
		Token elseToken = queue.peek();
		if(elseToken!=null && elseToken.getType().equals("ELSE")){
			queue.poll();
			Statement stmt = stmtRule();
			if(stmt!=null){
				return new ElseStatement1(elseToken, stmt);
			}
		}
		return new ElseStatement2(new Epsilon());
	}
	
	private SquareBracketsStatement squareBracketsStmtRule(){
		Token left_square_bracket = queue.peek();
		if(left_square_bracket!=null && left_square_bracket.getType().equals("LEFT_SQUARE_B")){
			queue.poll();
			Expression expression = expressionRule();
			if(expression!=null){
				Token right_square_bracket = queue.peek();
				if(right_square_bracket!=null && right_square_bracket.getType().equals("RIGHT_SQUARE_B")){
					queue.poll();
					return new SquareBracketsStatement1(left_square_bracket,expression,right_square_bracket);
				}
			}
		}
		return new SquareBracketsStatement2(new Epsilon());
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
	
	
	private ClassDeclarations classDeclarationsRule(){
		ClassDeclaration classDeclaration = classDeclarationRule();
		if(classDeclaration!=null){
			ClassDeclarations classDeclarations = classDeclarationsRule();
			if(classDeclarations!=null){
				return new ClassDeclarations1(classDeclaration,classDeclarations);
			}
		}
		return new ClassDeclarations2(new Epsilon());
	}
	
	private Goal goalRule(){
		MainClass mainClass = mainClassRule();
		if(mainClass != null){
			ClassDeclarations classDeclarations = classDeclarationsRule();
			if(classDeclarations!=null){
				Token eol = queue.peek();
				if(eol!= null && eol.getType().equals("EOL")){
					queue.poll();
					return new Goal(mainClass,classDeclarations,eol);
				}
			}
		}
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

	// Parameter ::= Type Identifier
	private Parameter ParameterRule() {
		// TODO Auto-generated method stub

		Type t = typeRule();
		Identifier id = identifierRule();
		return new Parameter(t, id);
	}


	// CommaParameters ::= "," Parameter CommaParameters | Lambda

	private CommaParameters CommaParametersRule() {
		// TODO Auto-generated method stub
		Token t = queue.peek();

		if (t.getType().equals("COMMA")) {
			queue.poll();
			Parameter p = ParameterRule();
			CommaParameters cP = CommaParametersRule();
			CommaParameters c = new CommaParameters1(t, p, cP);
			return c;
		}
		CommaParameters c = new CommaParameters2();
		return c;

	}
	private Type typeRule() {
		Token type = queue.peek();
		if (type.getType().equals("INT")) {
			queue.poll();
			Token left = queue.peek();
			if (left.getType().equals("LEFT_SQUARE_B")) {
				queue.poll();
				Token right = queue.peek();
				if (right.getType().equals("RIGHT_SQUARE_B")) {
					queue.poll();
					ArrayType arrType = new ArrayType(left, right);
					IntType intType =  new IntType(arrType, type);
					return intType;

				} else {
					System.out.println("Syntax Error");
					return null;
				}

			}
			ArrayType arrType = new ArrayType();
			IntType inttype = new IntType(arrType, type);
			return inttype;
			
		} else if (type.getType().equals("STRING")) {
			queue.poll();
			Token left = queue.peek();
			if (left.getType().equals("LEFT_SQUARE_B")) {
				queue.poll();
				Token right = queue.peek();
				if (right.getType().equals("RIGHT_SQUARE_B")) {
					queue.poll();
					ArrayType arrType = new ArrayType(left, right);
					StringType strType = new StringType(arrType,type);
					return strType;

				} else {
					System.out.println("Syntax Error");
					return null;
				}

			}
			ArrayType arrType = new ArrayType();
			StringType strType = new StringType(arrType,type);
			return strType;

		} else if (type.getType().equals("CHAR")) {
			queue.poll();
			Token left = queue.peek();
			if (left.getType().equals("LEFT_SQUARE_B")) {
				queue.poll();
				Token right = queue.peek();
				if (right.getType().equals("RIGHT_SQUARE_B")) {
					queue.poll();
					ArrayType arrType = new ArrayType(left, right);
					CharType charType = new CharType(arrType, type);
					return charType;

				} else {
					System.out.println("Syntax Error");
					return null;
				}

			}
			ArrayType arrType = new ArrayType();
			CharType charType = new CharType(arrType,type);
			return charType;
			
		} else if (type.getType().equals("FLOAT")) {
			queue.poll();
			Token left = queue.peek();
			if (left.getType().equals("LEFT_SQUARE_B")) {
				queue.poll();
				Token right = queue.peek();
				if (right.getType().equals("RIGHT_SQUARE_B")) {
					queue.poll();
					ArrayType arrType = new ArrayType(left, right);
					FloatType floatType =new FloatType(arrType, type);
					return floatType;

				} else {
					System.out.println("Syntax Error");
					return null;
				}

			}
			ArrayType arrType = new ArrayType();
			FloatType floatType = new FloatType(arrType,type);
			return floatType;
		} else if (type.getType().equals("BOOLEAN")) {
			queue.poll();
			Token left = queue.peek();
			if (left.getType().equals("LEFT_SQUARE_B")) {
				queue.poll();
				Token right = queue.peek();
				if (right.getType().equals("RIGHT_SQUARE_B")) {
					queue.poll();
					ArrayType arrType = new ArrayType(left, right);
					BooleanType boolType =new BooleanType(arrType, type);
					return boolType;

				} else {
					System.out.println("Syntax Error");
					return null;
				}

			}
			ArrayType arrType = new ArrayType();
			BooleanType boolType = new BooleanType(arrType,type);
			return boolType;
		}

		return null;
	}

	private AccessSpecifier accessSpecifierRule() {
		// TODO Auto-generated method stub
		Token t = queue.peek();
		if (t.equals("PRIVATE")) {
			queue.poll();
			AccessSpecifier a = new AccessSpecifier1(t);
			return a;
		} else if (t.equals("PUBLIC")) {
			queue.poll();
			AccessSpecifier a = new AccessSpecifier2(t);
			return a;

		}
		return null;
	}


	private Identifier identifierRule() {
		// TODO Auto-generated method stub
		Token id = queue.peek();
		if (!id.getType().equals("ID"))
			System.out.println("Syntax Error");
		else
			queue.poll();
		return new Identifier(id);
	}
	
	//VarDeclaration ::= Type Identifier ";"
	private VarDeclaration varDeclarationRule(){
		Type t = typeRule();
		Identifier id = identifierRule();
		Token semicolon = queue.peek();
		if(!semicolon.getType().equals("SEMICOLON")){
			System.out.println("Syntax Error");
			return null;
		}
		queue.poll();
		return new VarDeclaration(t, id, semicolon);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Parser p = new Parser("TC1.txt");
	Parameters p1 = p.parametersRule();
	p1.printNode();
	}

}
