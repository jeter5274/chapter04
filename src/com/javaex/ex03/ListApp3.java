package com.javaex.ex03;

import com.javaex.ex01.Ractangle;
import com.javaex.ex01.Triangle;
import com.javaex.ex02.Circle;

public class ListApp3 {

	public static void main(String[] args) {
		
		//범용 ObjList를 사용
		//메모리에 올릴때(new) 사각형 용으로 만듦
		
		MyList<Ractangle> rList = new MyList<Ractangle>();
		
		Ractangle r01 = new Ractangle(5,5);
		Ractangle r02 = new Ractangle(10,10);
		
		rList.add(r01);
		rList.add(r02);
		
		for(int i=0; i<rList.size();i++){
			rList.get(i).draw();
		}
		
		//범용 ObjList를 사용
		//메모리에 올릴때(new) 원 용으로 만듦
		
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(7);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size();i++){
			cList.get(i).draw();
		}
		
		//범용 ObjList를 사용
		//메모리에 올릴때(new) 삼각형 용으로 만듦
		
		MyList<Triangle> tList = new MyList<Triangle>();
		

	}

}
