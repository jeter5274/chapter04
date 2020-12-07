package com.javaex.ex01;

public class RactList {
	
	private Ractangle[] rArray;
	private int crtPos;
	
	public RactList() {
		rArray = new Ractangle[3];
		crtPos = 0;
	}
	
	public void add(Ractangle r) {
		rArray[crtPos] = r;
		crtPos++;
	}
	
	public Ractangle get(int index) {
		return rArray[index]; 
	}
	
	public int size() {
		return crtPos; 
	}
}
