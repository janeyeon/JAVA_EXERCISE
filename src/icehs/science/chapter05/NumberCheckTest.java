package icehs.science.chapter05;
import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		
		System.out.println(" 첫번째 수를 입력하세요");
		int first = getUserInput();
		System.out.println("첫번째 수는"+first+"이군요");
		
		System.out.println("두번째 수를 입력하세요");
		int second = getUserInput();
		
		if((first*second)<0)
			System.out.println("음수는 확인하지않습니다.");
		else if((first*second/10)==0)
			System.out.println("한자리 수입니다.");
		else if ((first*second/100)==0)
			System.out.println("두자리 수입니다");
		else 
			System.out.println("세자리 수 이상입니다");
	}

	private static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}

