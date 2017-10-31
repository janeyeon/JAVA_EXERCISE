package icehs.science.chapter03;

public class StatisticsCastingTest {
	public static void main(String[] args) {
		int suntoearth= 150000000;
		long pop = 6973738433L;
		double lotto= 0.0000001235;
		boolean a= true;
		
		System.out.println( "지구태양거리"  +suntoearth);
		System.out.println( "로또당첨확률"+lotto);
		System.out.println( "세계인구수"+pop);
		System.out.println( "위 값들이 정확한가요 ? "+a);
		
		int intlotto= (int)lotto;
		int intpop = (int)pop;
		
		System.out.println( "change to int"  +intlotto);
		System.out.println( "change to int"  +intpop);
		
	}
	
	

}
