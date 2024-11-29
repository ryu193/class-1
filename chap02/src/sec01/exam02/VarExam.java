package sec01.exam02;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int hour = 3;
       int minute = 5;
	System.out.println(hour+"시간" +minute+"분");
	
	int totalMinute = (hour*60)+minute;
	System.out.println("총" + totalMinute +"분");
	
	int minute_2 = 185;
	System.out.println(minute_2+"분");
	int totalsec = (minute_2*60);
	System.out.println("총" + totalsec +"초");
	
	int x=10;
	int y=20;
	System.out.println("x의 값 : " + x);
	System.out.println("x+y 의 값: "+(x+y));
	
	x=y;
	System.out.println("x의 값 : " + x);
	
	
//	System.out.println("j:"+j); 위에서 부터 내려오기때문에 아직 "j"가 뭔지모름 그래서 에러남
	int j = 1;
	System.out.println("j:"+j);
	
	{
       System.out.println("j:"+j);
	}
	
	{
	   int i=0;
	   System.out.println("i:"+i);
	}
	
//	 System.out.println("i:"+i); 위에서 }로 i의 영역이 끝났기 때문에 에러남
	
	
	
	
	}

}
