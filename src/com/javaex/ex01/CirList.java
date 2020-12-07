package com.javaex.ex01;

public class CirList {

	//필드
	private Circle[] cArray;
	private int crtPos;
	
	//생성자 - 필드 초기화
	public CirList() {
		cArray = new Circle[3];
		crtPos = 0;
	}
	
	//메소드 일반 (getter/setter 생략)
	public void add(Circle c) {
		cArray[crtPos] = c;
		crtPos++;
	}
	
	public Circle get(int Index) {
		return cArray[Index];
	}
	
	public int size() {
		return crtPos;
	}
	
}
