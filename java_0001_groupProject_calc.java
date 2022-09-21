package com.human.ProJect;

import java.util.Scanner;

public class java_0001_groupProject_calc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int input_num = 0; //숫자
		 String input_calc = " "; //연산자 
		 int temp = 0; //값 저장소
		 String temp_oper = ""; //마지막 연산자 저장하여 계산
		 
		 System.out.println("본 시스템은 숫자와 연산자를 반복적으로 입력 받습니다,"
		            + "=를 입력하면 입력이 완료됩니다");
		 for(;;) {
			 System.out.println("숫자를 입력하시오");
			 input_num=sc.nextInt();
			 sc.nextLine();
	         System.out.println("연산자를 입력하시오");
	         input_calc=sc.nextLine();
	         temp_oper = input_calc;
	         
	         if(input_calc.equals("+")){
	        	 temp = temp + input_num;
	         }
	         else if(input_calc.equals("-")) {
	        	 temp = temp - input_num;
	        	 
	         }
	         else if(input_calc.equals("/")) {
	        	 if(temp==0) temp = temp + input_num;
	        	 
	        	 else temp = temp / input_num;
	         }
	         else if(input_calc.equals("*")) {
	        	 if(temp==0) temp = temp + input_num;
	        	 
	        	 else temp = temp * input_num;
	         }
	         else if(input_calc.equals("=")) {
	        	 if(temp_oper.equals("+")){
		        	 temp = temp + input_num;
		         }
		         else if(temp_oper.equals("-")) {
		        	 temp = temp - input_num;
		        	 
		         }
		         else if(temp_oper.equals("/")) {
		        	 temp = temp / input_num;
		         }
		         else if(temp_oper.equals("*")) {
		        	 temp = temp * input_num;
		         }
	        	 
	        	 System.out.println(temp);
	        	 break;
	         }
	         
			 
			 
		 }
	}//main 끝

}//class 끝
