package com.human.ProJect;
//import java.util.Array;

import java.util.Arrays;

public class java_lotto_project {

	public static void main(String[] args) {
		//랜덤 숫자 1~10까지 중에 3개의 숫자를 뽑습니다.
		//그 숫자 중에 가장 큰 수를 출력하시오
		int exNum = 0; //랜덤 값을 받을 변수
		int[] value = {0,0,0}; //랜덤 값을 받아 저장할 배열 변수 [3]
		int result = 0;		// 가장 큰 값을 저장하여 출력할 변수
		
		for(int i=0;i<3;i++) {//0,1,2 총 3번을 도는 for문 //random()*10+1 = 최대값10,최소값1
			exNum =(int)(Math.random()*10)+1;	//exNum 값에 Math.random으로 랜덤 값 입력
			value[i] = exNum;					//value[i]배열에 랜덤값 저장
			
			
			for(int e=0;e<i;e++) {	//중복이 되면 i를 줄여 for를
				if(value[e]==value[i]) {i--; continue;}	//다시 돌린다	
														
			}
		
			
			System.out.println(i+1 +"번째 숫자 " +value[i]);	// 배열에 들어간 랜덤값 출력
		}
			Arrays.sort(value); //배열 오름차순으로 정리
			
			//length로 배열의 끝을 구할때는 -1을 해줘야한다.
			//이유는 지금 배열은 총 3개이므로 배열의 끝은 3이지만(length는 1부터 계산한다.)
			//컴퓨터는 0부터 시작하여 0,1,2다. 그러므로 value 변수 배열의 끝의 값을 가져오려면
			//-1을 해준다.
			//value[value[3 - 1];
			result = value[value.length - 1 ]; //배열의 맨 끝이 가장 큰 수이므로 배열 맨끝을 저장
			System.out.println("3개 중 가장 큰 수는 "+result);	//result 값 출력
			System.out.println("배열의 크기는?" + value.length);//배열의 갯수를 출력함
		
		
		

	}//메인 메서드 끝

}//클래스 끝
