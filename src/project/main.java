package project;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class main {
	public static ArrayList<RegExp> regExps = new ArrayList<>();
	public static ArrayList<String> allTokens = new ArrayList<>();
	public static ArrayList<Boolean> matched = new ArrayList<>();
	public static HashMap<Integer, Token> Result = new HashMap<>();

	public static void main(String[] args) throws IOException {

		RegExp regExp = new RegExp();
		regExps = regExp.fill();
		
		
=======
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
	public static ArrayList<RegExp> regExps = new ArrayList<>();

	public static void main(String[] args) {

		RegExp regExp = new RegExp();
		regExps = regExp.fill();

		String input = "int intval = 10*5";
		tokenize(input);

	}

	public static void tokenize(String input) {
>>>>>>> e5be714b1e04ffcebb77a9f01375acec3d20cd32
		

	}

<<<<<<< HEAD
	
=======
>>>>>>> e5be714b1e04ffcebb77a9f01375acec3d20cd32
}
