package com.iruen;

import java.util.Scanner;

class MenuBar {
	public static Scanner scan = new Scanner(System.in);

	public static void menuSee() {
		System.out.println("==================");
		System.out.println("도형을 입력하세요(1.입력 2.조회  3.종료)");
		System.out.println("입력 : ");
	}

}
public class Study0127 {

	public static void main(String[] args) {
		FigureController fgcon=new FigureController();
		MenuBar.menuSee();
		
		String input=MenuBar.scan.next();
		
		switch(input){
		case "1":
			fgcon.figureInput();
			//MenuBar.menuSee();
		case "2":
			fgcon.searchFigure();
			break;
		case "3":
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}
}

