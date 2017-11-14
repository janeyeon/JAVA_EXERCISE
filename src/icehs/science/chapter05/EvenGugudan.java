package icehs.science.chapter05;

public class EvenGugudan {

	public static void main(String[] args) {
		for (int dan=1;dan<=9;dan++) {
			
			for(int a=1;a<=9;a++) {
				if((a%2==0)) {
				int result = a* dan;
	       System.out.println(+dan+"*"+a+"="+result);
		}
			}
		}

	}

}
