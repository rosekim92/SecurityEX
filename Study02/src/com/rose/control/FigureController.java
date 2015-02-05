package com.rose.control;

import com.rose.main.MenuBar;
import com.rose.service.FigureService;
import com.rose.service.FigureServiceImpl;


public class FigureController {
	
	private FigureService figSer = new FigureServiceImpl();
	
	//������� �Է����� ����
	public void figureChose(){
		MenuBar.menuFigure();
		MenuBar.menuFigKey();
	}
	
	//���� �߰�
	public void addCircle(double cir){
		figSer.addCircleService(cir);
	}
	
	//�ﰢ�� �߰�
	public void addTriangle(double triX, double triY){
		figSer.addTriangleService(triX, triY);
	}
	
	//�簢�� �߰�
	public void addRect(double retX, double retY){
		figSer.addRectService(retX, retY);
	}
	//���� �˻��ϱ�
	public void searchCir(double cir){
		figSer.searchCircle(cir);
	}
	//�ﰢ�� �˻��ϱ�
	public void searchTri(double triX, double triY){
		figSer.searchTriangle(triX, triY);
	}
	//�簢�� �˻��ϱ�
	public void searchRet(double retX, double retY){
		figSer.searchRect(retX, retY);
	}
}
