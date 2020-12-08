package com.javaex.ex02;

public class ObjList {
	
	private Object[] oArray;
	private int crtPos;
	
	public ObjList() {
		oArray = new Object[3];
		crtPos = 0;
	}
	
	public void add(Object o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public Object get(int index) {
		return oArray[index]; 
	}
	
	public int size() {
		return crtPos; 
	}
}
