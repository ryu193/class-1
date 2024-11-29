package sec01.exam02;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =2+(3*4);
		long b =(long)a;
	
		long c =a;
		
		long d =3000000000L;
	    int e = (int)d;
	    System.out.println("e : "+e);
	    
	    long f = 10;
	    
	    int g = 3;
	    long h = 4L;
	    long i= (long)g + h;
	    
	    long i2= g + h;
	    double j =3.3;
	    double k =(double)g + j;
	    double k2 = g + j;
	    System.out.println("(double)g : " +(double)g );
	    double j2 = (int)j;
	    System.out.println((int)j2);
	    
	  
	    
	    int z =30;  //z값은 x로 x값은 z 로
	    int x= 407;
	    int q= x;
	    int r= z;
	    z=q;
	    x=r;
	    System.out.println( z );
	    System.out.println( x );
	  
	    
	    
	    double total = 47.5;
	    int count = 9;
	    double n = (total/count);
	    double n2 = (int)n;
	    double n_1=(int)(total/count);
	    double n3 = (total-n_1*count)+n_1;
	    double n4 =(n3+(count-1)*n2);
	    System.out.println("엔빵 : "+ n2);
	    System.out.println("주최자 :"+ n3);
	    System.out.println("금액맞는지확인 : "+ n4);
	    
	    
	    
	    	
	    
	 
	    		
	    
	    
	    
	    
  	
	}

}
