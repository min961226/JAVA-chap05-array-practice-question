package com.greedy.section03.array_copy;

import java.util.Arrays;

public class Application3 {

	public static void main(String[] args) {
		
		/* 깊은 복사 방법 4가지
		 * 1. for문을 이용한 동일한 인덱스의 값 복사
		 * 2. Object클래스의 clone()을 이용한 복사
		 * 3. System클래스의 arraycopy()를 이용한 복사
		 * 4. Arrays클래스의 copyOf()를 이용한 복사
		 * */
		
		int[] originArr = new int[] {1,2,3,4,5};
		
		print(originArr);
		
		/* 1. for문을 이용한 동일한 인덱스 값 복사 */
		int[] copyArr1 = new int[10];
		
		for(int i = 0; i < originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
		
		print(copyArr1);
		
		/* 2. Object클래스의 clone()을 이용한 복사 */
		int[] copyArr2 = originArr.clone();
		
		print(copyArr2);
		
		/* 3. System 클래스의 arraycopy()를 이용한 복사 */
		int[] copyArr3 = new int[10];
		
		/* (원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이)의 의미이다. */
		System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
		
		print(copyArr3);
		
		/* 4. Arrays 클래스의 copyOf()를 이용한 복사 */
		int[] copyArr4 = Arrays.copyOf(originArr, 7);
		
		print(copyArr4);
	}
	
	public static void print(int[] iarr) {
		
		System.out.println("iarr의 hashCode : " + iarr.hashCode());
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
	}

}
