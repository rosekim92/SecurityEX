package com.rose.service;

import java.util.ArrayList;
import java.util.List;

import com.rose.main.MenuBar;
import com.rose.vo.CircleInfoVO;
import com.rose.vo.RectInfoVO;
import com.rose.vo.TriangleInfoVO;

public class FigureServiceImpl implements FigureService {
	// 원형을 담을 리스트
	static List<CircleInfoVO> cirList = new ArrayList<CircleInfoVO>();
	// 삼각형을 담을 리스트
	static List<TriangleInfoVO> triList = new ArrayList<TriangleInfoVO>();
	// 사각형을 담을 리스트
	static List<RectInfoVO> retList = new ArrayList<RectInfoVO>();

	// 원형 vo
	CircleInfoVO cirVO;
	// 삼각형 vo
	TriangleInfoVO triVO;
	// 사각형 vo
	RectInfoVO retVO;

	// 원형 추가하기
	@Override
	public void addCircleService(double cir) {
		cirVO = new CircleInfoVO();
		cirVO.setCir(cir);
		cirList.add(cirVO);
	}

	// 삼각형 추가하기
	@Override
	public void addTriangleService(double triX, double triY) {
		triVO = new TriangleInfoVO();
		triVO.setTriX(triX);
		triVO.setTriY(triY);
		triList.add(triVO);
	}

	// 사각형 추가하기
	@Override
	public void addRectService(double retX, double retY) {
		retVO = new RectInfoVO();
		retVO.setRetX(retX);
		retVO.setRetY(retY);
		retList.add(retVO);
	}

	// 원형 검색하기
	@Override
	public void searchCircle(double cir) {
		for(int i=0;i<cirList.size();i++){
			if(cirList.get(i).getCir()==cir){
				System.out.println(cirVO.getArea());
			}/*else{
				System.out.println("저장된 도형이 없습니다.");
			}*/
		}
		System.out.println("저장된 도형이 없습니다.");
	}
	
	//삼각형 검색하기
	@Override
	public void searchTriangle(double triX, double triY){
		for(int i=0;i<triList.size();i++){
			if(triList.get(i).getTriX()==triX){
				if(triList.get(i).getTriY()==triY){
					System.out.println("넓이는 : "+triVO.getArea());
				}else {
					System.out.println("저장된 도형이 없습니다.");
				}
			}else{
				System.out.println("저장된 도형이 없습니다.");
			}
		}
	}
	//사각형 검색하기
	@Override
	public void searchRect(double retX, double retY){
		for(int i=0;i<retList.size();i++){
			if(retList.get(i).getRetX()==retX){
				if(retList.get(i).getRetY()==retY){
					System.out.println("넓이는 : "+retVO.getArea());
				}else {
					System.out.println("저장된 도형이 없습니다.");
				}
			}else{
				System.out.println("저장된 도형이 없습니다.");
			}
		}
	}
}

