package com.iruen;

import java.util.ArrayList;
import java.util.List;


public class FigureController {
	List<String> figureList = new ArrayList<String>();
	
	//도형을 입력할지 조회 선택
	public void figureChose(){
		MenuBar.menuFigure();
		MenuBar.menuFigKey();
	}
	//도형입력을 선택시 입력
	public void figureInput(){
		if(figureList.size()<3){ 
			System.out.println("도형을 입력하세요 ");
			String figure = MenuBar.scan.next();
			figureList.add(figure);
			FigureOverr.output();
			MenuBar.menuFigure();
			MenuBar.menuFigKey();
		}else{
			System.out.println("제한된 도형의 갯수를 다 입력하셨습니다.");
			MenuBar.menuSee();
			MenuBar.menuKey();
		}
	}    
	//첫메뉴에서 조회
	public void searchFigure(){
		if(figureList.size()==0){
			System.out.println("입력된 도형이 없습니다.");
		}else{
		System.out.println("정해진 갯수의 도형을 다 입력하셨습니다.");
		System.out.println("======입력한 도형=====");
		for(int i=0;i<figureList.size();i++){
			String result=figureList.get(i);
			System.out.println(result+" ");
		}
		System.out.println("==================");
		}
		MenuBar.menuSee();
		MenuBar.menuKey();
	}
	//안쪽메뉴에서 조회
	public void searchFigure1(){
		if(figureList.size()==0){
			System.out.println("입력된 도형이 없습니다.");
		}else{
		System.out.println("정해진 갯수의 도형을 다 입력하셨습니다.");
		System.out.println("======입력한 도형=====");
		for(int i=0;i<figureList.size();i++){
			String result=figureList.get(i);
			System.out.println(result+" ");
		}
		System.out.println("==================");
		}
		MenuBar.menuFigure();
		MenuBar.menuFigKey();
	}
}
