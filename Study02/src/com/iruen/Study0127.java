package com.iruen;

import java.util.Scanner;

class MenuBar {
	public static Scanner scan = new Scanner(System.in);

	public static void menuSee() {
		System.out.println("==================");
		System.out.println("������ �Է��ϼ���(1.�Է� 2.��ȸ  3.����)");
		System.out.println("�Է� : ");
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
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
	}
}

