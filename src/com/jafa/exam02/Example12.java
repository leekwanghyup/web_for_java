package com.jafa.exam02;

public class Example12 {
	// 논리연산자 AND '&&' , OR '||'
	public static void main(String[] args) {
		// AND(논리곱) : 피연산자가 모두 true일 경우에만 true를 반환한다.
		boolean result1 = (10>5) && (4==4); // true
		System.out.println(result1);
		
		// &&연산자는 앞의 피연산자가 false이면 뒤의 피연산자를 평가하지 않는다. 
		boolean result2 = (10<5) && (4==4); // false
		System.out.println(result2);
		
		// OR(논리합) : 적어도 하나의 피연산자가 true이면 true를 반환한다.
		boolean result3 = (10<5) || (4 == 4); // true
		System.out.println(result3);
		
		// ||연산자는 앞의 피연산자가 true이면 뒤의 피연산자를 평가하지 않는다.
		boolean result4 = (10>5) || (4 != 4); //true
		System.out.println(result4);
	}
}
