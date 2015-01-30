package com.iruen;

import java.util.Scanner;

public class MenuBar {
	public static Scanner scan = new Scanner(System.in);
	static FigureController fgcon = new FigureController();
	static int inputone;
	static int inputtwo;
	
	public static void menuSee() {
		System.out.println("==================");
		System.out.println("1.입력하기 2.조회하기  3.종료하기");
		System.out.println("선택: ");
		inputone = scan.nextInt();
	}
	public static void menuFigure(){
		System.out.println("==================");
		System.out.println("1.도형입력 2.조회하기 3.뒤로가기");
		System.out.println("입력: ");
		inputtwo = scan.nextInt();
	}
	public static void menuKey() {
		switch (inputone) {
		case 1:
			fgcon.figureChose();
			break;
		case 2:
			fgcon.searchFigure();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}
	public static void menuFigKey(){
		switch(inputtwo){
		case 1:
			fgcon.figureInput();
		case 2:
			fgcon.searchFigure();
		case 3:
			menuSee();
			
		}
	}
}
