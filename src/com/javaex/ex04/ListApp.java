package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		
		//ArrayList사용 + Ractangle
		
		//ArrayList<Ractangle> rList = new ArrayList<Ractangle>();
		//LinkedList<Ractangle> rList = new LinkedList<Ractangle>();
		
		//ArrayList ↔ LinkedList 변환이 가능하도록 List인터페이스를 통해 공통메소드만 사용하도록함
		List<Ractangle> rList = new LinkedList<Ractangle>();
		
		Ractangle r01 = new Ractangle(3,3);
		Ractangle r02 = new Ractangle(4,4);
		
		
		rList.add(r01);
		rList.add(r02);
		
		
		Ractangle r = rList.get(0);
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		r.draw();
		System.out.println(r.toString());
		
		//size()
		System.out.println(rList.size());
		
		//전체 출력
		for(int i=0;i<rList.size();i++) {
			rList.get(i).draw();
		}
		
		System.out.println("add2=========================");
		//위치 지정 추가
		Ractangle r03 = new Ractangle(100,100);
		rList.add(1, r03);
		
		for(int i=0;i<rList.size();i++) {
			rList.get(i).draw();
		}
		
		System.out.println("toString=========================");
		System.out.println(rList.toString());
		
		System.out.println("remove=========================");

		//삭제 remove()
		rList.remove(0);	//위치값 지정
		
		for(int i=0;i<rList.size();i++) {
			rList.get(i).draw();
		}
		
		System.out.println("remove2=========================");
		
		rList.remove(r02); //주소값 지정
		
		for(int i=0;i<rList.size();i++) {
			rList.get(i).draw();
		}
		
		

		
		//////////////////////////////////////////////////////////////
		//Circle
		
		System.out.println("Circle=========================");
		
		//ArrayList<Circle> cList = new ArrayList<Circle>();
		LinkedList<Circle> cList = new LinkedList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(500);
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(r01); //Generic 발동!
		
		for(int i=0;i<cList.size();i++) {
			cList.get(i).draw();
		}
	}

}
