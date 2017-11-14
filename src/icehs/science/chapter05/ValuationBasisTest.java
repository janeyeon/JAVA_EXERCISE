package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int a=10, b=20, c=40, d=50, e=80;
		
		double f=(double)a*b/2;
		double g=(double)(c+d)/2;
		double h=(double)(f*0.6)+(g*0.13)+(e*0.27);
		
		System.out.println("평가결과:"+h);
		
		if (h>=95)
			 System.out.println("Special Class");
		
		 else if (h<95 && h>=90)
			 System.out.println("Gold Class");
		
		 else if (h<90 && h>=85)
			 System.out.println("Silver Class");
		
		 else if (h<85 && h>=80)
			 System.out.println("Bronze Class");
		
		 else 
			 System.out.println("Member");


		
		

	}

}
