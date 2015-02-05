package com.rose.service;

public interface FigureService {
	
	//원형추가
	public void addCircleService(double cir);
	//삼각형추가
	public void addTriangleService(double tirX,double tirY);
	//사각형추가
	public void addRectService(double retX,double retY);
	
	//도형 조회
	public void searchCircle(double cir);
	//삼각형 조회
	public void searchTriangle(double tirX,double tirY);
	//사각형 조회
	public void searchRect(double retX, double retY);
	
}