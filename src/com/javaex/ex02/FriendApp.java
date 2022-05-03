package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;


public class FriendApp {

	public static void main(String[] args) {
    	
		ArrayList<Friend> fList = new ArrayList<>();
    	
    	Scanner sc = new Scanner(System.in);
    	String Line; //값배정
    	String[] Array; //배열이름
    	System.out.println("친구 3명을 입력하세요");
    	
    	for(int i=0; i<3; i++) {
    		Line = sc.nextLine();//배열 텍스트
    		Array = Line.split(" ");//배열을 나누는 기준
    		fList.add(new Friend(Array[0],Array[1],Array[2]));//Friend값생성자
    	}
    	
    	for(Friend i: fList) {
			System.out.println(i.toString());
    	}
    	
  


    	sc.close();
    	
    }

}
