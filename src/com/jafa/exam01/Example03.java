package com.jafa.exam01;

public class Example03 {

	// 정수형 데이터 타입 byte
	public static void main(String[] args) {
		/*
		   byte 타입 : 1byte (8bit)
		   	파일, 이미지 등 이진데이터를 처리할 때 주로 사용
		   	표현 범위 : -128 ~ 127(2byte) 
		*/  
		byte bin1 = -128;
		byte bin2 = -30; 
		byte bin3 = 0;
		byte bin4 = 30; 
		byte bin5 = 127; 
		
		System.out.println(bin1);
		System.out.println(bin2);
		System.out.println(bin3);
		System.out.println(bin4);
		System.out.println(bin5);
		
		// 표현범위를 넘는 데이터 값을 저장할 수 없다. 
//		byte bin6 = 128;
//		byte bin7 = -129
		 
	}
}
