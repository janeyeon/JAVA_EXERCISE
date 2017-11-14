package icehs.science.chapter05;

public class GradeIfElseTest2 {

	public static void main(String[] args) {
		 int gradea = 92;
		 
		 if (gradea>=90)
			 System.out.println("A학점입니다.");
		 
		 else if (gradea<90 && gradea>=80)
			 System.out.println("B학점입니다.");
		 
		 else if (gradea<80 && gradea>=70)
			 System.out.println("C학점입니다.");
		 
		 else if (gradea<70 && gradea>=60)
			 System.out.println("D학점입니다.");
		 
		 else
			 System.out.println("F학점입니다.");


	}

}
