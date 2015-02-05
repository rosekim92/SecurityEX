package com.rose.main;

import java.util.Scanner;

import com.rose.control.FigureController;

public class MenuBar {
	public static Scanner scan = new Scanner(System.in);
	static FigureController fgcon = new FigureController();
	static int inputone;
	static int inputtwo;
	static int inputsear;
	//static초기화
	static{
		inputone=0;
		inputtwo=0;
		inputsear=0;
	}
	
	
	//메인 메뉴
	public static void menuSee() {
		System.out.println("========================");
		System.out.println("1.입력하기 2.조회하기  3.종료하기");
		System.out.println("선택: ");
		inputone = scan.nextInt();
	}
	//입력,조회,종료 선택하기
	public static void menuKey() {
		switch (inputone) {
		case 1:
			fgcon.figureChose();
			break;
		case 2:
			searchKey();
			searchFigure();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}
	//도형종류를 선택하여 입력하기	
	public static void menuFigure(){
		System.out.println("==========================");
		System.out.println("1.원형 2.삼각형 3.사각형 4.뒤로가기");
		System.out.println("입력: ");
		inputtwo = scan.nextInt();
	}
	//도형을 골라서 입력하기
	public static void menuFigKey(){
		switch(inputtwo){
		case 1:
			inputCircle();
			break;
		case 2:
			inputTriangle();
			break;
		case 3:
			inputRect();
			break;
		case 4:
			menuSee();
			menuKey();
			break;
		}
	}
	
	//원형넓이 입력하기
	public static void inputCircle(){
		System.out.println("반지름을 입력하시오");
		double cirinput=scan.nextDouble();
		fgcon.addCircle(cirinput);
		menuFigure();
		menuFigKey();
	}
	//삼각형넓이 입력하기
	public static void inputTriangle(){
		System.out.println("삼각형의 밑변을 입력하시오");
		double tribottom=scan.nextDouble();
		System.out.println("삼각형의 높이를 입력하시오");
		double triheight=scan.nextDouble();
		fgcon.addTriangle(tribottom, triheight);
		menuFigure();
		menuFigKey();
	}
	//사각형넓이 입력하기
	public static void inputRect(){
		System.out.println("사각형의 밑변을 입력하시오");
		double retbottom=scan.nextDouble();
		System.out.println("사각형의 높이를 입력하시오");
		double retheight=scan.nextDouble();
		fgcon.addRect(retbottom, retheight);
		menuFigure();
		menuFigKey();
	}
	//도형종류를 선택하여 조회하기	
	public static void searchKey(){
		System.out.println("==========================");
		System.out.println("1.원형 2.삼각형 3.사각형 4.뒤로가기");
		System.out.println("입력: ");
		inputsear = scan.nextInt();
	}
	//도형을 골라서 입력하기
	public static void searchFigure(){
		switch(inputsear){
		case 1:
			System.out.println("반지름을 입력하세요.");
			System.out.println("입력:");
			double seaCir=scan.nextDouble();
			fgcon.searchCir(seaCir);
			break;
		case 2:
			System.out.println("밑변을 입력하세요.");
			System.out.println("입력:");
			double seatribot=scan.nextDouble();
			System.out.println("높이를 입혁하세요");
			System.out.println("입력:");
			double seatrihei=scan.nextDouble();
			fgcon.searchTri(seatribot, seatrihei);
			break;
		case 3:
			System.out.println("밑변을 입력하세요.");
			System.out.println("입력:");
			double searetbot=scan.nextDouble();
			System.out.println("높이를 입혁하세요");
			System.out.println("입력:");
			double searethei=scan.nextDouble();
			fgcon.searchRet(searetbot, searethei);
			break;
		case 4:
			menuSee();
			menuKey();
			break;
		}
	}
		
			
}






























