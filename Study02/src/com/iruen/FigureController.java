package com.iruen;

import java.util.ArrayList;
import java.util.List;


public class FigureController {
	List<String> figureList = new ArrayList<String>();
	
	public void figureInput(){
		for(int i=0;i<3;i++){
			System.out.println("������ �Է��ϼ��� ");
			String figure = MenuBar.scan.next();
			figureList.add(figure);
		}
		MenuBar.menuSee();
		MenuBar.menuKey();
	}
	public void searchFigure(){
		if(figureList.size()==0){
			System.out.println("�Էµ� ������ �����ϴ�.");
		}else{
		System.out.println("������ ������ ������ �� �Է��ϼ̽��ϴ�.");
		System.out.println("======�Է��� ����=====");
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
