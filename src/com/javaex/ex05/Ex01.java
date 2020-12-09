package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		//Set -> HashSet
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		//Integer i01 = new Integer(3);
		//Integer i02 = new Integer(5);
		//Integer i03 = 3; //박싱
		
		//추가
		iSet.add(3);
		iSet.add(5);
		iSet.add(8);
		
		//toString()
		System.out.println(iSet.toString());
		
		//size()
		System.out.println(iSet.size());
		
		//출력:
		//기존 for문은 사용할 수 없음
		//다른 for문 -> 향상된 for문
		for(Integer i : iSet) {	//i에 주소를 줘라
			System.out.println(i.toString());
		}
		
		System.out.println("======================");
		for(int i : iSet) { //언박싱
			System.out.println(i);
		}
		
		//삭제
		System.out.println("remove======================");
		iSet.remove(3);
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		//중복추가
		System.out.println("5추가======================");
		iSet.add(5);	//오류는 안나지만 안들어감
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("8추가======================");
		iSet.add(8);	//오류는 안나지만 안들어감
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
	}

}
