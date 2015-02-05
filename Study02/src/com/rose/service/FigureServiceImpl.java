package com.rose.service;

import java.util.ArrayList;
import java.util.List;

import com.rose.main.MenuBar;
import com.rose.vo.CircleInfoVO;
import com.rose.vo.RectInfoVO;
import com.rose.vo.TriangleInfoVO;

public class FigureServiceImpl implements FigureService {
	// ������ ���� ����Ʈ
	static List<CircleInfoVO> cirList = new ArrayList<CircleInfoVO>();
	// �ﰢ���� ���� ����Ʈ
	static List<TriangleInfoVO> triList = new ArrayList<TriangleInfoVO>();
	// �簢���� ���� ����Ʈ
	static List<RectInfoVO> retList = new ArrayList<RectInfoVO>();

	// ���� vo
	CircleInfoVO cirVO;
	// �ﰢ�� vo
	TriangleInfoVO triVO;
	// �簢�� vo
	RectInfoVO retVO;

	// ���� �߰��ϱ�
	@Override
	public void addCircleService(double cir) {
		cirVO = new CircleInfoVO();
		cirVO.setCir(cir);
		cirList.add(cirVO);
	}

	// �ﰢ�� �߰��ϱ�
	@Override
	public void addTriangleService(double triX, double triY) {
		triVO = new TriangleInfoVO();
		triVO.setTriX(triX);
		triVO.setTriY(triY);
		triList.add(triVO);
	}

	// �簢�� �߰��ϱ�
	@Override
	public void addRectService(double retX, double retY) {
		retVO = new RectInfoVO();
		retVO.setRetX(retX);
		retVO.setRetY(retY);
		retList.add(retVO);
	}

	// ���� �˻��ϱ�
	@Override
	public void searchCircle(double cir) {
		for(int i=0;i<cirList.size();i++){
			if(cirList.get(i).getCir()==cir){
				System.out.println(cirVO.getArea());
			}/*else{
				System.out.println("����� ������ �����ϴ�.");
			}*/
		}
		System.out.println("����� ������ �����ϴ�.");
	}
	
	//�ﰢ�� �˻��ϱ�
	@Override
	public void searchTriangle(double triX, double triY){
		for(int i=0;i<triList.size();i++){
			if(triList.get(i).getTriX()==triX){
				if(triList.get(i).getTriY()==triY){
					System.out.println("���̴� : "+triVO.getArea());
				}else {
					System.out.println("����� ������ �����ϴ�.");
				}
			}else{
				System.out.println("����� ������ �����ϴ�.");
			}
		}
	}
	//�簢�� �˻��ϱ�
	@Override
	public void searchRect(double retX, double retY){
		for(int i=0;i<retList.size();i++){
			if(retList.get(i).getRetX()==retX){
				if(retList.get(i).getRetY()==retY){
					System.out.println("���̴� : "+retVO.getArea());
				}else {
					System.out.println("����� ������ �����ϴ�.");
				}
			}else{
				System.out.println("����� ������ �����ϴ�.");
			}
		}
	}
}

