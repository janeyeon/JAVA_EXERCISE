package icehs.science.chapter05;
import java.util.*;

public class NumberCheckTest {

	public static void main(String[] args) {
		
		System.out.println(" ù��° ���� �Է��ϼ���");
		int first = getUserInput();
		System.out.println("ù��° ����"+first+"�̱���");
		
		System.out.println("�ι�° ���� �Է��ϼ���");
		int second = getUserInput();
		
		if((first*second)<0)
			System.out.println("������ Ȯ�������ʽ��ϴ�.");
		else if((first*second/10)==0)
			System.out.println("���ڸ� ���Դϴ�.");
		else if ((first*second/100)==0)
			System.out.println("���ڸ� ���Դϴ�");
		else 
			System.out.println("���ڸ� �� �̻��Դϴ�");
	}

	private static int getUserInput() {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}

