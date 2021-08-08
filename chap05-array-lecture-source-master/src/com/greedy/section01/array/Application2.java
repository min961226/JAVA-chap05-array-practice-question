package com.greedy.section01.array;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 배열을 사용하는 방법 */
		
		/* 1. 배열의 선언
		 * 자료형[] 변수명;
		 * 자료형 변수명[]; 로 선언할 수 있다.
		 *  */
		
		/* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
		int[] iarr;
		char carr[];
		
		/* 2. 배열의 할당 
		 * 배열을 할당할 시에는 반드시 배열의 크기를 지정해 주어야 한다.
		 * */
//		iarr = new int[];			//크기를 지정해 주지 않아서 에러 발생
		iarr = new int[5];
		carr = new char[10];
		
		System.out.println("iarr : " + iarr);
		System.out.println("carr : " + carr);
		
		/* hashCode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
		 * 동일 객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체 취급하기 위한 용도로 overriding 해서 사용한다.
		 * */
		System.out.println("iarr의 hashCode : " + iarr.hashCode());
		System.out.println("carr의 hashCode : " + carr.hashCode());
		
		/* 3. 선언과 할당은 동시에 할 수 있다. */
		int[] iarr2 = new int[3];
		
		/* 배열의 길이를 알 수 있는 기능을 필드로 제공하고 있다. */
		System.out.println("iarr의 길이 : " + iarr.length);
		System.out.println("carr의 길이 : " + carr.length);
		
		/* 스캐너로 입력한 값 혹은 변수에 저장된 값을 이용하여 배열의 크기를 지정하여 할당할 수 있다. */
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();
		
		/* 배열의 길이를 음수로 지정하게 되면 NegativeArraySizeException가 발생한다. */
		double[] darr = new double[size];
		
		System.out.println("darr의 hashCode : " + darr.hashCode());
		System.out.println("darr의 length : " + darr.length);
		
		/* 배열은 크기를 한 번 지정하면 변경하지 못한다. */
		darr = new double[30];
		
		System.out.println("수정 후 darr의 hashCode : " + darr.hashCode());
		System.out.println("수정 후 darr의 length : " + darr.length);
		
		/* 한 번 할당된 배열은 개발자가 직접 지울 수 없다.
		 * 다만 레퍼런스 변수(주소를 보관하는 변수)를 null로 변경하게 되면 더 이상 주소를 참조할 수 없게 된다.
		 * 이 때 일정 시간이 지나면 heap의 old 영역으로 이동하여 GC(가비지 컬렉터)가 삭제를 시킨다.
		 * 한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조가 불가능해지게 되니 주의해야 한다.
		 * */
		darr = null;
		
		/* NullPointerException 
		 * 아무 것도 참조하지 않고 null이라는 특수한 값을 참조하고 있는 경우 참조연산자를 사용하게 되면 발생하는 에러이다.
		 * */
		System.out.println("삭제 후 darr의 길이 : " + darr.length);
	}

}
