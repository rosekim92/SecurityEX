package com.iruen;

import java.util.Scanner;

public class MenuBar {
	public static Scanner scan = new Scanner(System.in);
	static FigureController fgcon = new FigureController();
	static int inputone;
	static int inputtwo;
	
	public static void menuSee() {
		System.out.println("==================");
		System.out.println("1.�Է��ϱ� 2.��ȸ�ϱ�  3.�����ϱ�");
		System.out.println("����: ");
		inputone = scan.nextInt();
	}
	public static void menuFigure(){
		System.out.println("==================");
		System.out.println("1.�����Է� 2.��ȸ�ϱ� 3.�ڷΰ���");
		System.out.println("�Է�: ");
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
			System.out.println("���α׷��� �����մϴ�.");
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
