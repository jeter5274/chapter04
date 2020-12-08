package com.javaex.ex04;

public class Ractangle {
	private int width, height;

	public Ractangle() {}
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println("사각형(가로=" +width+ ", 세로=" +height+ ")를 그렸습니다.");
	}
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
}
