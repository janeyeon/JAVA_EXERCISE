package icehs.science.chapter03;

public class StatisticsCastingTest {
	public static void main(String[] args) {
		int suntoearth= 150000000;
		long pop = 6973738433L;
		double lotto= 0.0000001235;
		boolean a= true;
		
		System.out.println( "�����¾�Ÿ�"  +suntoearth);
		System.out.println( "�ζǴ�÷Ȯ��"+lotto);
		System.out.println( "�����α���"+pop);
		System.out.println( "�� ������ ��Ȯ�Ѱ��� ? "+a);
		
		int intlotto= (int)lotto;
		int intpop = (int)pop;
		
		System.out.println( "change to int"  +intlotto);
		System.out.println( "change to int"  +intpop);
		
	}
	
	

}
