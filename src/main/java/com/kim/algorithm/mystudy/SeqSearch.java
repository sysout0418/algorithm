package com.kim.algorithm.mystudy;

import java.util.Scanner;

public class SeqSearch {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값 : "); // 키 값을 입력
		int key = scan.nextInt();
		int idx = seqSearch(x, num, key); // 배열 x에서 키 값이 key인 요소를 검색
		
		if (idx == -1) {
			System.out.println("그 값을 요소가 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
	
	// 요솟수가 n인 배열 a에서 key와 가은 요소를 선형 검색
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
			if (i == n) {
				return -1; // 검색 실패 (-1을 반환)
			}
			if (a[i] == key) {
				return i; // 검색 성공 (인덱스를 반환)
			}
			i++;
		}
	}
}
