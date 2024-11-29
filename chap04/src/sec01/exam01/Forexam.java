package sec01.exam01;

public class Forexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		//1씩 증가하는걸 5번하고싶다
	
		sum +=1; //sum +1;
		sum +=1;
		sum +=1;
		sum +=1;
		sum +=1;
		System.out.println("sum" +sum);
		
		
		//1+2+3+4+5
		//1~n까지의합
		//n(n+1) /2
		
		sum=0;
	
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum" +sum);
		
		
		int i = 1;
		
		sum=0;
		
		sum = sum + i; // 1
		i++;
		sum = sum + i; // 2
		
		i++;
		sum = sum + i; // 3
		
		i++;
		sum = sum + i; // 4
		
		/*
		 *반복문을 만드는 원리
		 *
		 *1. 반복되는것 찾기
		 *     ctrl c+v 했을때 바뀌지않는것
		 *
		 *2. 반복 되지 않는 것 찾기
		 *     규칙 (패턴) 을 찾을수있으면 반복문으로 만들수 있음
		 *     변수를 활용해서 더이상 바뀌지않게 만들기
		 *3. 시작 조건
		 *
		 *4. 종료 조건
		 *
		 *   for문:반복 횟수를 아는경우
		 *   while문: 반복횟수를 모르는 경우
		 *    
		 */
		
		int sum2=0;
		for(int e=0; e <= 100; e++) {
			sum2 = sum2 + e;
	}
		
		System.out.println(sum2);
		
		
		
		
//		int sum3 = 1;
//		for(int f=1;f<=8; f++) {
//			sum3 = f; 
//		 System.out.println(sum3);		
//		}
//	
      
		//깜짝 퀴즈 10부터 1까지
		
		
		
		int sum4 = 10;
		for (int r = 10; r >= 1; r--) { // 10에서 1까지 감소
		    sum4 = r;
		
		    System.out.println(sum4);
		}
		//문제1. 1 부터 20까지 짝수만 출력
		//문제2. 1 부터 20까지 3의 배수만 출력 
		
		 System.out.println("-------------------");
		
		int sum3 = 1;
		for(int f=1;f<=20/(2); f++) {
			sum3 = 2*f; 
		 System.out.println(sum3);		
		}
	
		
		int sum5 = 1;
		for(int j=1;j<=20/(3); j++) {
			sum5 = 3*j; 
		 System.out.println(sum5);		
		}
		
		//홀짝 나타내기
		int sum6 = 1;
		for (int t = 1; t <=11; t++) { 	
		    sum6 = t;
		    boolean jj = t%2==1;
		    if (jj) {
		    	System.out.println(t+": 홀수");
		    }else { 
		    	System.out.println(t+": 짝수");
		    }
		}
		
//1~20 홀수합
		int hol=1;
		for(int hh=1; hh <= 20/(2); hh++) { //1 2 3 4 5 6 7 8 9...20
			hol = hol + 2*hh;
			
	}
		System.out.println(hol);
		
//1~20 홀수의 수

		//1~10까지 옆으로 3개씩
		//1 2 3
		//4 5 6
		//7 8 9
		//10
		
//구구단 2단 출력		
		
		
		
		
	}

}
