package com.human.code220916;

public class Java04_0916 {

	public static void main(String[] args) {
//			
//		관점 - 하나의 행동, 물체 모든 것을 다양한 시점으로 보는 것
//		1.개발자 관점 - 코드의 가독성 - 다른 사람이 본인의 코드를 객관적으로 분석이 가능한가
//		--★변수 이름★ - 변수 이름으로 변수(메서드, 클래스 이름)의 속성을 알 수 있어야 한다.(구체적으로 쓰기)
//		--★띄어쓰기★ - 코드 영역{}을 구분 짓고, 가독성을 높혀 본인 코드 보기 편하게 수정 할 것
//		--★조건절★, 반복문의 위치를 전체적으로 볼 수 있도록 코드 정렬
//		2.컴퓨터(시스템)관점 - 리소스 관리(컴퓨터 성능 최적화)
//		--컴퓨터가 개발자가 쓴 코드를 해석하고 실행하는 횟수를 줄이는 작업
//		시간적 튜닝(알고리즘 개선(빅오표기법))
//		공간적 튜닝(메모리 공간 개선(변수의 갯수를 줄이는 작업)
//		3.사용자 관점 - (일반 유저)의 문제 해결 능력 
//		
		
		
		
//		2,3,4,5의 배수의 갯수 중에 2번째로 많은 배수의 갯수를 가진
//		?배수의 이름을 출력하시오 (단, 지금까지 배웠던 내용을 활용하여 작성하시오)
		
		
//		승점으로 비교
		int max_Number = 30;
		int number = 0;
		int count_1 = 0; int rank_1=0;
		int count_2 = 0; int rank_2=0;
		int count_3 = 0; int rank_3=0;
		int count_4 = 0; int rank_4=0;
		int max_Value = 4;
		
		System.out.println(max_Number + "개의 숫자 중");
		for(number=0;number<=max_Number;number++) {
			
			if(number%2==0) count_1++;
			if(number%3==0) count_2++;
			if(number%4==0) count_3++;
			if(number%5==0) count_4++;
		}
		System.out.println("2의 배수는 " + count_1 + "개 입니다.");
		System.out.println("3의 배수는 " + count_2 + "개 입니다.");
		System.out.println("4의 배수는 " + count_3 + "개 입니다.");
		System.out.println("5의 배수는 " + count_4 + "개 입니다.");
		if(count_1>count_2) rank_1++;
		if(count_1>count_3) rank_1++;
		if(count_1>count_4) rank_1++;
		
		if(count_2>count_1) rank_2++;
		if(count_2>count_3) rank_2++;
		if(count_2>count_4) rank_2++;
		
		if(count_3>count_2) rank_3++;
		if(count_3>count_1) rank_3++;
		if(count_3>count_4) rank_3++;
		
		if(count_4>count_2) rank_4++;
		if(count_4>count_3) rank_4++;
		if(count_4>count_1) rank_4++;
		
		
		
		System.out.println("");
		if(max_Value - rank_1 == 2) System.out.println("2의 배수는 2번째로 많습니다.");
		else if(max_Value - rank_2 == 2) System.out.println("3의 배수는 2번째로 많습니다.");
		else if(max_Value - rank_3 == 2) System.out.println("4의 배수는 2번째로 많습니다.");
		else if(max_Value - rank_4 == 2) System.out.println("5의 배수는 2번째로 많습니다.");
		
		
		
		
		
		
//		if로 하나하나 비교
		System.out.println();
		if(count_1>count_2||count_1>count_3||count_1>count_4)
		{
			
				if(count_1>count_2 && count_1>count_3 && count_1<count_4) {
					System.out.println("2의 배수는 2번째로 많습니다.");
				}
				else if(count_1>count_2 && count_1<count_3 && count_1>count_4) {
					System.out.println("2의 배수는 2번째로 많습니다.");
				}
				else if(count_1<count_2 && count_1>count_3 && count_1>count_4) {
					System.out.println("2의 배수는 2번째로 많습니다.");
				}
			
		}
		
		if(count_2>count_1||count_2>count_3||count_2>count_4)
		{
			if(count_2>count_1 && count_2>count_3 && count_2<count_4) {
				System.out.println("3의 배수는 2번째로 많습니다.");
			}
			else if(count_2>count_1 && count_2<count_3 && count_2>count_4) {
				System.out.println("3의 배수는 2번째로 많습니다.");
			}
			else if(count_2<count_1 && count_2>count_3 && count_2>count_4) {
				System.out.println("3의 배수는 2번째로 많습니다.");
			}
		}
		
		if(count_3>count_2||count_3>count_1||count_3>count_4)
		{
			if(count_3>count_2 && count_3>count_1 && count_3<count_4) {
				System.out.println("4의 배수는 2번째로 많습니다.");
			}
			else if(count_3>count_2 && count_3<count_1 && count_3>count_4) {
				System.out.println("4의 배수는 2번째로 많습니다.");
			}
			else if(count_3<count_2 && count_3>count_1 && count_3>count_4) {
				System.out.println("4의 배수는 2번째로 많습니다.");
			}
	 	}
		
		if(count_4>count_2||count_4>count_3||count_4>count_1)
		{
			if(count_4>count_2 && count_4>count_3&&count_4<count_1) {
				System.out.println("5의 배수는 2번째로 많습니다.");
			}
			else if(count_4>count_2&&count_4<count_3&&count_4>count_1) {
				System.out.println("5의 배수는 2번째로 많습니다.");
			}
			else if(count_4<count_2&&count_4>count_3&&count_4>count_1) {
				System.out.println("5의 배수는 2번째로 많습니다.");
			}
		}
		
//		2022.09.16 history
//		2중 for문 - break;
//		1.단항연산자(피연산자(변수)가 하나인 것)
//		-------------------------------------------------------------------------
//		2.전위연산자, 후위연산자
//		전위연산자 - ex)++i; 계산 완료 후 출력한다.
//		후위연산자 - ex)i++; 계산 전에 출력하고 연산한다.
//		-------------------------------------------------------------------------
//		3.오버플로우(stack over flow 스택 오버 플로우)
//		타입이 갖고있는 max값보다 더 많은 수치를 받을 경우
//		ex)int의 max값은 약 2억 정도인데, 그 이상의 수치를 대입하면 max값인 2억 정도만 출력(저장)된다.
		
	}
}

	

