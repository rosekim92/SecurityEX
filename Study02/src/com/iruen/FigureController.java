package com.iruen;

import java.util.ArrayList;
import java.util.List;


public class FigureController {
	List<String> figureList = new ArrayList<String>();
	
	//������ �Է����� ��ȸ ����
	public void figureChose(){
		MenuBar.menuFigure();
		MenuBar.menuFigKey();
	}
	//�����Է��� ���ý� �Է�
	public void figureInput(){
		if(figureList.size()<3){ 
			System.out.println("������ �Է��ϼ��� ");
			String figure = MenuBar.scan.next();
			figureList.add(figure);
			FigureOverr.output();
			MenuBar.menuFigure();
			MenuBar.menuFigKey();
		}else{
			System.out.println("���ѵ� ������ ������ �� �Է��ϼ̽��ϴ�.");
			MenuBar.menuSee();
			MenuBar.menuKey();
		}
	}    
	//ù�޴����� ��ȸ
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
	//���ʸ޴����� ��ȸ
	public void searchFigure1(){
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
		MenuBar.menuFigure();
		MenuBar.menuFigKey();
	}
}
