package com.rose.service;

public interface FigureService {
	
	//�����߰�
	public void addCircleService(double cir);
	//�ﰢ���߰�
	public void addTriangleService(double tirX,double tirY);
	//�簢���߰�
	public void addRectService(double retX,double retY);
	
	//���� ��ȸ
	public void searchCircle(double cir);
	//�ﰢ�� ��ȸ
	public void searchTriangle(double tirX,double tirY);
	//�簢�� ��ȸ
	public void searchRect(double retX, double retY);
	
}