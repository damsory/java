package day13;

import java.util.regex.Pattern;

public class PatternEx1 {
	/* ^[abc]$ */
	public static void main(String[] args) {
		//  pattern 클래스를 이용하여 문자열이 정규표현식에 맞는지 확인 예제
		String str = "zbc";
		String regex ="^[a-zA-Z]{3}$";
		if(Pattern.matches(regex, str)) {
			System.out.println("영문자이고 3자입니다.");
		}else {
			System.out.println("영문자가 아니거나 3자가 아닙니다.");
		}
	}

}
