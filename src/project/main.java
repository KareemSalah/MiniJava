package project;


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
		
		
}
}
