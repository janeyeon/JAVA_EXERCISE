package icehs.science.chapter03;

public class StringevariableEx {

	public static void main(String[] args) {
		
		String name = "±èÇÏ¿¬";
		String math = "96";
		int eng= 82;
		
		int parsemath = Integer.parseInt (math);
		
		System.out.println( "name"  +name);
		System.out.println( "math"  +math);
		System.out.println( "english"  +eng);
		System.out.println( "----------------- ");
		System.out.println( math+eng );
		System.out.println( parsemath + eng );
		
				

	}

}
