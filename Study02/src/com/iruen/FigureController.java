package com.iruen;

import java.util.ArrayList;
import java.util.List;


public class FigureController {
	List<String> figureList = new ArrayList<String>();
	
	public void figureInput(){
		for(int i=0;i<3;i++){
			System.out.println("도형을 입력하세요 ");
			String figure = MenuBar.scan.next();
			figureList.add(figure);
		}
		MenuBar.menuSee();
		MenuBar.menuKey();
	}
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
}
