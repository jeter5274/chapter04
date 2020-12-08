package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		
		//사각형 관리
		RactList rList = new RactList();
		
		Ractangle r01 = new Ractangle(3,9);
		Ractangle r02 = new Ractangle(10,10);
		
		rList.add(r01);
		rList.add(r02);
		
		Ractangle r100 = rList.get(0);
		r100.draw();
		
		System.out.println(rList.size());
		
		//원관리
		CirList cList = new CirList();
		Circle c01 = new Circle(120);
		Circle c02 = new Circle(60);
		
		cList.add(c01);
		cList.add(c02);
		
		Circle c100 = cList.get(1);
		c100.draw();
		
		System.out.println(cList.size());
		
		
		//삼각형 관리
		TriList tList = new TriList();
		Triangle t01 = new Triangle(10,5);
		Triangle t02 = new Triangle(30,28);
		Triangle t03= new Triangle(5,1);
		
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		
		Triangle t100 = tList.get(0);
		t100.draw();
		
		System.out.println(tList.size());
		/*메소드 작명 내맘대로 하기
		TriList tList = new TriList();
		Triangle t01 = new Triangle(10,5);
		Triangle t02 = new Triangle(30,28);
		Triangle t03= new Triangle(5,1);
		
		tList.input(t01);
		tList.input(t02);
		tList.input(t03);
		
		Triangle t100 = tList.call(0);
		t100.draw();
		
		System.out.println(tList.length());
		*/
	}

}
