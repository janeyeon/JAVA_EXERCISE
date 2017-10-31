package icehs.science.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		long wealth = 7000000000L;
		System.out.println( "original value " +wealth );
		
		double doublewealth = wealth;
		System.out.println("change to double" +doublewealth);
		
		int intwealth = (int)wealth;
		System.out.println( "change to int" +intwealth );

	}

}
