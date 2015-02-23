package com.corruptrobot.compilertest1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Compile("~PleaseTellTheComputerIAmIn~ com.corruptrobot.compilertest1 ~ThankYou~~PleaseLetEverythingSeeThis~ ~CompilationOfProgrammingLanguage~ Main ~InsideHere~~PleaseLetEverythingSeeThis~ ~Static~ ~NonReturning~ main(~String~~Array~ args) ~InsideHere~~PleasePrintThisToTheConsole~~OpenBracket~~Parentheses~ String ~Parentheses~~CloseBracket~~ThankYou~~PleaseCloseInsideHere~~PleaseCloseInsideHere~"));
	}
	
	public static String Compile(String s){
		s = s.replaceAll("~PleaseTellTheComputerIAmIn~", "package");
		s = s.replaceAll("~ThankYou~", ";");
		s = s.replaceAll("~PleaseLetEverythingSeeThis~", "public");
		s = s.replaceAll("~CompilationOfProgrammingLanguage~", "class");
		s = s.replaceAll("~InsideHere~", "{");
		s = s.replaceAll("~Static~", "static");
		s = s.replaceAll("~NonReturning~","void");
		s = s.replaceAll("~String~","String");
		s = s.replaceAll("~NonDecimalNumber~","Int");
		s = s.replaceAll("~DecimalNumber~","Double");
		s = s.replaceAll("~DecimalNumber2~","Float");
		s = s.replaceAll("~EightBitInteger~","byte");
		s = s.replaceAll("~AVeryShortInteger~","short");
		s = s.replaceAll("~AVeryLongInteger~","long");
		s = s.replaceAll("~AYesNoVariable~","boolean");
		s = s.replaceAll("~ASingleCharacter~","char");
		s = s.replaceAll("~PleasePrintThisToTheConsole~","System.out.println");
		s = s.replaceAll("~OpenBracket~","(");
		s = s.replaceAll("~Parentheses~","\"");
		s = s.replaceAll("~CloseBracket~",")");
		s = s.replaceAll("~PleaseCloseInsideHere~","}");
		return s;
	}

}
