package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

        ArrayList<Goods> item = new  ArrayList<>();
       
        String List;
        String[] Array;
        int num = 1;
        System.out.println("상품을 입력해주세요(종료 q)");
        
        for(int i=0; i<num; i++) {
        	List = sc.nextLine();
        	Array = List.split(",");
        	item.add(new Goods());
        	num = num+1;
        }if( == false) {
        	System.out.println("입력완료");
        }
        
        for(Goods i: item) {
			System.out.println(i.toString());
    	}
    	
        sc.close();
    }

}
