package com.javaex.ex02;

public class ListApp2 {

	public static void main(String[] args) {
		
		//각가의 리스트 사용X
		//ObjList클래스를 3번 사용
		
		//사각형 관리
		Ractangle r01 = new Ractangle(3,3);
		Ractangle r02 = new Ractangle(5,5);
		
		ObjList rList = new ObjList();
		
		rList.add(r01);
		rList.add(r02);
		
		for(int i=0; i<rList.size();i++){
			((Ractangle)(rList.get(i))).draw();
		}
		
		//원 관리
		ObjList cList = new ObjList();
		Circle c01 = new Circle(120);
		Circle c02 = new Circle(60);
		
		cList.add(c01);
		cList.add(c02); //단점 : 다른 도형이나 Object형태의 데이터가 추가될 수 된다.
		
		for(int i=0; i<cList.size();i++){
			((Circle)(cList.get(i))).draw();
		}
		
		//삼각형 관리 (생략)
		

	}

}
