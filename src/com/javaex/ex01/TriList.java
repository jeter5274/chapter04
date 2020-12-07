package com.javaex.ex01;

public class TriList {

	//필드
	private Triangle[] tArray;	//관리배열
	private int index;			//배열의 방번호	
	
	//생성자 - 필드 초기화
	public TriList () {
		tArray = new Triangle[3];
		index = 0;
	}
	
	//메소드 일반 (getter/setter 생략)
	public void input(Triangle t) {
		tArray[index] = t;
		index++;
	}
	
	public Triangle call(int index) {
		return tArray[index];
	}
	
	public int length() {
		return index;
	}
	
}

