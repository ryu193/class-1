package sec01.exam01;

import java.util.Scanner;

public class Ifexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 80;
	//	Scanner scan = new Scanner(System.in );
	//	int score =scan.nextInt();
		
	if(score>=90) {	
	     System.out.println("점수가 90보다 큽니다.");
         System.out.println("등급은 A입니다.");
	}
    
	if(score<90) {	
	     System.out.println("점수가 90보다 작습니다.");
         System.out.println("등급은 B입니다."); 	
	     
	}
	
	if(score>=90) {	
	     System.out.println("점수가 90보다 큽니다.");
         System.out.println("등급은 A입니다.");
	}else {	if(score<90) {	
	     System.out.println("점수가 90보다 작습니다.");
	     System.out.println("등급은 B입니다.");}
	}
	
	
//문제 1
//z1이 x1과 y1사이에 있는지 확인	

    int x1 = 15;
    int y1 = 20;
    int z1 = 16;
    
    boolean r1 = z1 >= x1;
    boolean r2 = z1 <= y1;
    
    if (r1 && r2) {
    	System.out.println(z1+": 사이에 있다");
    } else { 
    	System.out.println(z1+": 사이에 없다");
    }
    
    
    int no = 4;
    		
    boolean no2= no%2 == 0;
    
    if (no2) {
    	System.out.println("짝수");
    } else { 
    	System.out.println("홀수");
    }
    
    
    //문제 2 
    /* 
     *어제 온도가 -3도 였을때 
     *
     *1오늘온도가 영상인지 영하인지
     *
     *2만약 영하라면  "영하 1도 입니다"
     *영상이라면 "영상2도 입니다"
     *
     *3 어제보다 온도가 높습니다/낮습니다
     * 
     *4 어제보다 2도 높습니다
     * 
     */
    int yt = -4;
    int t = -10;
    
boolean t1 = t<0;
    
    if (t1) {
    	System.out.println("영하");
    } else { 
    	System.out.println("영상");
    }
    if (t1) {
    	System.out.println("영하"+(-t)+"도입니다");
    } else { 
    	System.out.println("영상"+t+"도입니다");
    }
    
boolean t2 = yt < t;   
    
	if (t2) {
		System.out.println("어제보다 온도가 높습니다");
	} else { 
		System.out.println("어제보다 온도가 낮습니다");
	}
	
	int t3 = t - yt;
	boolean t4 = t3>yt;
	if (t4) {
		System.out.println("어제보다 온도가"+ t3 + "도 높습니다");
	} else { 
		System.out.println("어제보다 온도가"+ -t3 + "도 낮습니다");
	}
    
    //문제3 
    /*
     * 어떤수가 있을때 
     * 
     * 입력한 수는 100보다 크다/작다
     * 면서 양수이고 음수 홀수 짝수  
     * 
     */
	
	int n = -11;
	
boolean n1= n%2 == 0;
    
	    if (n1) {
	    	System.out.println("짝수");
	    } else { 
	    	System.out.println("홀수");
	    }
	    if (n<0) {
	    	System.out.println("음수");
	    } else { 
	    	System.out.println("양수");
	    }
	    

    
	
    
    //문제4
    /*
     * a b 두가지 수가 있을때 둘중 큰값 출력
     * 
     */
    
    int a1 = 8;
    int b1 = 5;
    
    boolean x2 = a1<b1;
    
	    if (x2) {
	    	System.out.println(b1);
	    }else { 
	    	System.out.println(a1);
	    }
    
    
    //문제5 
    /*
     * 숫자가 
     * 1일때 "일"
     * 2일때 "이"
     * 3일때 "삼"
     * 그외 "그외"
     */
    
    
    int g = 1;
    
	      if (g>=4) {
	    	System.out.println("그외");
	    } else if (g>=3){ 
	    	System.out.println("삼");
	    } else if(g>=2){ 
	    	System.out.println("이");
	    } else if(g>=1){ 
	    	System.out.println("일");
	    }
    
    
    
    //문제6 
    /* 
     * 월에따라서 
     * 4계절 출력
     * 3 4 5 봄
     * 6 7 8 여름
     * 9 10 11 가을
     * 12 1 2 겨울
     */
	      
    int s=9;
    
    
    if (s<=2) {
    	System.out.println("겨울"); 	
    } else if (s<=5){ 
    	System.out.println("봄");
    } else if(s<=8){ 
    	System.out.println("여름");
    } else if(s<=11){ 
    	System.out.println("가을");
    } else if(s<=12){ 
    	System.out.println("겨울");
    } 
    
    
	
    /*두자리의 정수가 10의 자리와	
     * 1의 자리가 같은지 판단
     * 
     * 
     * 사각형의 한쪽 모서리 : (10,10)
     *                   (90,100)
     *                  
     *    새로운점 (x,y)가 사각형에 포함되는가?
       */
	
	int j= 66;
	
	int j2 = j/10;
	int j3 = j%10;
	
	if (j2==j3) {
    	System.out.println("같다"); 	
    } else { 
    	System.out.println("다르다");
    }
	
	 
	int u = 10; 
    int x10 =80;
    int p = 90;
    int k =10;
    int y10=10;
    int m =100;
    
    boolean x11 = x10 >= u;
    boolean x12 = x10 <= p;
    boolean y11 = y10 >= k;
    boolean y12 = y10 <= m;
    
    
    if ((x11 && x12) && (y11&&y12)){
    	System.out.println("포함된다");
    } else { 
    	System.out.println("포함하지 않는다");
    	
    	
    }
    
    
 // random 사용법
    /*
     * Math.random();
     * 0<= Math.random()<1
     * 
     */
     
    double rand = Math.random();
	System.out.println("rand :" +rand );

	
	//쉽게 사용하기
//	int rnd1 = (int) (Math.random() * 60);
//	int rnd2 = rnd1 % 6;
//	int rnd3 = rnd2 +1;
//	System.out.println(rnd3);
	
	//로또 번호 뽑기
	int num =(int) (Math.random()*45)+1;
	System.out.println(num);
	
	//가위바위보
	/*
	 * 가위바위보 
	 * 내가이기는지 랜덤으로 나온 컴퓨터가 이기는지
	 * 
	 * 
	 */
	
//	int sys=1;
//	int rk=2;
//	int pp=3;
//	
//	int rn1 = (int) (Math.random() * 60);
//	int rn2 = rnd1 % 3;
//	int rn3 = rnd2 +1;
//	
//	boolean sysw = rn3==3;
//	boolean sysw1 = sys==1;
//	boolean sysL = rn3==2;
//	
//	
//	if (sysw && sysw1){
//    	System.out.println("컴퓨터는 보! 내가이겼다"); 
//    } else if (sysL && sysw1) {
//    	System.out.println("컴퓨터는 주먹!내가졌다");
//    }
//	else { 
//    	System.out.println("컴퓨터도 가위! 비겼다");
//    }
	
	
	int rsp=1;
	// 1=가위 2=바위 3=보
	
	int rn1 = (int) (Math.random() * 60);
	int rn2 = rn1 % 3;
	int rn3 = rn2 +1;
	
	boolean sys1 = rn3==1;
    boolean sys2 = rn3==2;
    boolean sys3 = rn3==3;
    boolean rsp1 = rsp==1;
    boolean rk1 = rn3==1;
    boolean rk2 = rn3==2;
    boolean rk3 = rn3==3;
    boolean rsp2 = rsp==2;
    boolean pp1 = rn3==1;
    boolean pp2 = rn3==2;
    boolean pp3 = rn3==3;
    boolean rsp3 = rsp==3;
    
    
    
    if (rsp1&&sys1) {
    	System.out.println("컴퓨터도 가위!비겼다"); 	
    } else if (rsp1&&sys2){ 
    	System.out.println("컴퓨터는 바위!졌다");
    } else if(rsp1&&sys3){ 
    	System.out.println("컴퓨터는 보! 이겼다");
    } else if(rsp2&&rk1){ 
    	System.out.println("컴퓨터는 가위! 이겼다");
    } else if(rsp2&&rk2){ 
    	System.out.println("컴퓨터도 바위 비겼다");
    } else if(rsp2&&rk3){ 
    	System.out.println("컴퓨터는 보! 졌다");
    } else if(rsp3&&pp1){ 
    	System.out.println("컴퓨터는 가위! 졌다");
    } else if(rsp3&&pp2){ 
    	System.out.println("컴퓨터는 바위! 이겼다");
    } else if(rsp3&&pp3){ 
    	System.out.println("컴퓨터는 보! 비겼다");
    } 
	
    
    int num2 = (int) (Math.random() * 6) +1 ;
    switch(num2) {
    case 1:
    	System.out.println("1번이 나왔습니다");
    	break;
    case 2:
    	System.out.println("2번이 나왔습니다");
    	break;
    case 3:
    	System.out.println("3번이 나왔습니다");
    	break;
    case 4:
    	System.out.println("4번이 나왔습니다");
    	break;
    case 5:
    	System.out.println("5번이 나왔습니다");
    	break;
    default :
    	System.out.println("6번이 나왔습니다");
    	break;
    }
	
    
    int month = 7;
    switch ( month) {
    case 1:
    	System.out.println("겨울");
    	break;
    case 2:
    	System.out.println("겨울");
    	break;
    case 3:
    	System.out.println("봄");
    	break;
    case 4:
    	System.out.println("봄");
    	break;
    case 5:
    	System.out.println("봄");
    	break;
    case 6:
    	System.out.println("여름");
    	break;
    case 7:
    	System.out.println("여름");
    	break;
    case 8:
    	System.out.println("여름");
    	break;
    case 9:
    	System.out.println("가을");
    	break;
    case 10:
    	System.out.println("가을");
    	break;
    case 11:
    	System.out.println("가을");
    	break;
    default:
    	System.out.println("겨울");
    	break;
    	}
  
    
    // 변수에 통장잔액이 써있음 10000원
    /* 이걸 출금할거임 (입력받아서)
     * 만원보다 높은금액을 적으면 잔액이 부족합니다
     * 얼마 출금했고 얼마 남앗습니다
     * 음수일 경우 정확히 입력해주세요
     * 
     */
    
//    int money1 = 10000;
//    int cxc = 2000;
//    int ccc= money1 - cxc;
//    
//    
//    boolean cxc1 = money1 < cxc;
//    boolean cxx = cxc<=0;
//    
//    if (cxc1) {
//    	System.out.println("잔액이 부족합니다"); 	
//    } else if (cxx){ 
//    	System.out.println("출금하고자 하는 금액을 정확히 입력하세요");
//    } else{
//    	money1-=cxc;
//    	System.out.println(cxc+"원을 출금해서"+money1+"원남았습니다"); 
//    }
    
    
    
//	    if (cxc1) {
//	    	System.out.println("잔액이 모자랍니다");
//	    }else if (cxx){ 
//	    	System.out.println("컴퓨터는 바위!졌다");
//	    else if  { 
//	    	System.out.println(cxc+"원을 출금해서"+ccc+"원남았습니다");
//	    }
    
    int money1 = 10000;  // 초기 잔액
    int cxc = 1000;      // 출금하고자 하는 금액

    boolean cxc1 = money1 < cxc;  // 잔액 부족 체크
    boolean cxx = cxc <= 0;       // 출금 금액이 0 이하 체크

    if (cxc1) {
        System.out.println("잔액이 부족합니다");
    } else if (cxx) {
        System.out.println("출금하고자 하는 금액을 정확히 입력하세요");
    } else {
        money1 -= cxc;  // 잔액을 출금 금액만큼 차감
        System.out.println(cxc + "원을 출금해서 " + money1 + "원이 남았습니다");
    }
    
    
    
    
    
    
    
    
    
		
    }
}
