package com.javaex.ex03;

public class MyList<T> {
	
	private T[] oArray;
	private int crtPos;
	
	public MyList() {
		oArray = (T[])(new Object[3]); //T타입의 배열로 형변환
		crtPos = 0;
	}
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public T get(int index) {
		return oArray[index]; 
	}
	
	public int size() {
		return crtPos; 
	}
}
