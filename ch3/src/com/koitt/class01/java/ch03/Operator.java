package com.koitt.class01.java.ch03;

public class Operator {

	/*
	 * 연산자 우선순위
	 * 
	 * 종류								연산자							우선순위
	 * 종감 연산자						++,--								1순위
	 * 산술 연산자						+, -, *, /, %						2순위
	 * 시프트 연산자					>>, <<, >>>					3순위
	 * 비교 연산자						>, <, >=, <=, ==. !=			4순위
	 * 비트 연산자						&, |, ^, ~						~만 1순위, 나머지는 5순위
	 * 논리 연산자						&&, ||, !							!만 1순위, 나머지는 6순위
	 * 조건(삼향) 연산자				?, :								7순위
	 * 대입 연산자						=, *=, /=, %=, +=, -=			8순위
	 */

	/*
	 * 대입 연산자
	 * 
	 * 연산자							의미
	 *    =								연산자를 중심으로 오른쪽 변수값을 왼쪽 변수에 대입한다.
	 *   +=								왼쪽 변수에 더하면서 대입한다.
	 *   -=								왼쪽 변수값에 빼면서 대입한다.
	 *   *=								왼쪽 변수값에 곱하면서 대입한다.
	 *   /=								왼쪽 변수에 나누면서 대입한다.
	 *   %=								왼쪽 변수에 나머지 값을 구하면서 대입한다.
   	 */
   
	/*
	 * 증감 연산자
	 * 
	 * 연산자							의미
	 *	  ++								1씩 증가시킨다.
	 *	  --								1씩 감소시킨다.
	 */  
	
	/*
	 *  조건 연산자(삼항 연산자)
	 *  
	 *  연산자							의미														구성
	 *  ?:									제어문의 단일 비교문과 유사하다.				제어문의 단일 비교문과 유사하다.
	 */ 
	
	/*
	 * 비교 연산자(관계 연산자)
	 * 
	 * 연산자							의미
	 * >									크다.
	 * <									작다.
	 * >=									크거나 같다.
	 * <=									작거나 같다.
	 * ==									피연산자들의 값이 같다.
	 * != 									피연산자들의 값이 같지 않다.
	 *   
	 */
	
	/*
	 *  논리 연산자
	 *  
	 *  연산자							의미														설명
	 * 	  &&								and(논리곱)											주어진 조건들이 모두 true일 때만 true를 나타낸다.
	 *    ||								or(논리합)												주어진 조건들 중 하나라도 true이면 true를 나타낸다.
	 *     ! 								not(부정)												true는 false로 false는 true로 나타낸다.		
	 */
	
	/*
	 *  비트 연산자
	 *  
	 *  연산자							의미	
	 *     &								비트 단위의 AND
	 *     |								비트 단위의 OR
	 *     ^								XOR(베타적 OR)
	 *     ~								보수
	 */
	
	/*
	 * 시프트 연산자 (비트 이동 연산자)
	 * 
	 * 연산자           					의미
	 *    >>								bit값을 오른쪽으로 이동(빈 자리는 부호값으로 대입)한다.
	 *   <<								bit값을 왼쪽으로 이동(빈 자리는 0으로 대입)한다.
	 *   >>>								bit값을 오른쪽으로 이동(빈 자리는 0으로 대입)한다.
	 */



}

