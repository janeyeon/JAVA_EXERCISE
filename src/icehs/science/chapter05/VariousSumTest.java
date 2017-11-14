package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		
		int sum=0;
		
		for( int a=1;a<=1000;a++) {
			
			sum+=a;
		}
		
        System.out.println(sum);
        
        int sum2=0, sum3=0;
        
        for(int c=1;c<=1000;c++) {
        	if((c%2==0)) {
        		sum2+=c;
        	}
        }
        System.out.println("Â¦¼öµéÀÇ ÇÕ:"+sum2);
       
        for(int b=1;b<=1000;b++) {
        	if((b%2==1)) {
        		sum3+=b;
        	}
        }
        System.out.println("È¦¼öµéÀÇ ÇÕ:"+sum3);
        

	}

}
