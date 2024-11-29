package sec02_exam04;

public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = false;
		System.out.println("a : " + a);
		
		a=!a;
		System.out.println("a : " + a);
		
		double b = 7.0;
		System.out.println( b/2 );
		
		int c = 46234;
		int d = 5;
		System.out.println("몫 : "+(c/d));
		System.out.println("나머지 : "+(c%d));
		
		
	    int f = 12000;
	    int g = 4700;
	    System.out.println("먹을수있는 커피 잔수 : "+(f/g));
		System.out.println("커피사고 남은돈 : "+(f%g));
		
		
		int min=713;
		int h= 60;
		System.out.print((min/h)+"시간");
		System.out.println((min%h)+"분");
		
		double tea = 5000;
	    double stick = 30000;
		double sale= 0.85;
		
		System.out.println("홍차값 :"+ (tea*sale) );
		System.out.println("홍차+립스틱값 :" +(tea+stick)*sale );
		
		
		int mn=8790;
		int u=5000;
		int i=1000;
		int o=500;
		int p=100;
		int k=50;
		int L=10;
		int m=1;
		int mn1=mn%u;
		int mn2=mn%i;
		int mn3=mn%o;
		int mn4=mn%p;
		int mn5=mn%k;
		System.out.print("오천원권:"+mn/u+"장");
		System.out.print("    천원권:"+mn1/i+"장");
		System.out.print("    오백원:"+mn2/o+"개");
		System.out.print("    백원:"+mn3/p+"개");
		System.out.print("    오십원:"+mn4/k+"개");
		System.out.print("    십원:"+mn5/L+"개");
		System.out.println("  일원:"+mn%L+"개");
		
		
		
		boolean bool = 3>5;
		System.out.println(bool);
		System.out.println('c' < 'j');
		
		String s1 = "유빈";
		String s2 = "유빈";
		System.out.println(s1==s2);
		// 하지만 글씨비교는 == 사용 절대금지 암튼안댐
		//아래 양식사용
		System.out.println(s1.equals(s2));
		System.out.println(!s1.equals(s2));
		
		int i1 = 87;
		System.out.println(i1+"은 B학점인가?");
		System.out.println((i1>=80)||(i1<90) );
		
		System.out.println( 10| 1 );
		
		int k1=7;
		int k2=15;
		int k3=17;
		System.out.println("k3이 가장 큰 값인가?" );
		System.out.println((k1<k2)&&(k2<k3));
		
		
		int m1 = 5;
		//m1 = m1+2;
		//m1 += 2;
		int m2=30;
		//m2= m2*4;
		//m2*=4;
		
// 위 두가지는 같음
		
		int n1=10;
		n1=n1+1;
		n1+=1;
		n1++;
		++n1;
		n1=n1-1;
		n1-=1;
		n1--;
		--n1;
		
		int n2 = 10;
		System.out.println(++n2);
//		System.out.println(n2++);
		System.out.println(n2);
		
		
		
	
		int z = 1;
		int y =1;
		System.out.println(z++ + ++z);
		System.out.println(z);
		
		int score = 90;
		char grade = (score>90)? 'A' : 'B';
		System.out.println(grade);
		
		
		double var1 = 5;
		double var2 = 2;
		double var3 = var1 / var2;
		double var4 =(var3*var2);
		System.out.println((int)var4);
		
		int value = 356;
		System.out.println(value/100*100);
		System.out.println(value-(value%100));
		// vi/v2
		//내가푼거 잘못했음 v1이나 v2값 바뀌면 못씀
		double v1 = 1000;
		double v2 = 457;
		double v3 = (double)1000/457*1000-2188;
		System.out.println(v3);
		System.out.println(v1/v2-v3/1000);
		
		//강사님이 푼것
		double v4 = 1000;
		double v5 = 457;
		double v6 = (v4/v5)*1000;
		int v7 = (int)v6;
		double v8 = (double) v7 /1000;
		System.out.println(v8);
		
		
		
         
		
	           		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
	    
		
		
		
		
	    
	    		
		
	}

}
