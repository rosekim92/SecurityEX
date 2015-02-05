package com.rose.control;

import com.rose.main.MenuBar;
import com.rose.service.FigureService;
import com.rose.service.FigureServiceImpl;


public class FigureController {
	
	private FigureService figSer = new FigureServiceImpl();
	
	//어떤도형을 입력할지 선택
	public void figureChose(){
		MenuBar.menuFigure();
		MenuBar.menuFigKey();
	}
	
	//원형 추가
	public void addCircle(double cir){
		figSer.addCircleService(cir);
	}
	
	//삼각형 추가
	public void addTriangle(double triX, double triY){
		figSer.addTriangleService(triX, triY);
	}
	
	//사각형 추가
	public void addRect(double retX, double retY){
		figSer.addRectService(retX, retY);
	}
	//원형 검색하기
	public void searchCir(double cir){
		figSer.searchCircle(cir);
	}
	//삼각형 검색하기
	public void searchTri(double triX, double triY){
		figSer.searchTriangle(triX, triY);
	}
	//사각형 검색하기
	public void searchRet(double retX, double retY){
		figSer.searchRect(retX, retY);
	}
}
