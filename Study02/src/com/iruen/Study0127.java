package com.iruen;

import java.util.Scanner;

class MenuBar {
	public static Scanner scan = new Scanner(System.in);
	static FigureController fgcon = new FigureController();
	static String input;

	public static void menuSee() {
		System.out.println("==================");
		System.out.println("������ �Է��ϼ���(1.�Է� 2.��ȸ  3.����)");
		System.out.println("�Է� : ");
		input = MenuBar.scan.next();
	}

	public static void menuKey() {
		switch (input) {
		case "1":
			fgcon.figureInput();
			break;
		case "2":
			fgcon.searchFigure();
			break;
		case "3":
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
	}
}

public class Study0127 {

	public static void main(String[] args) {
		MenuBar.menuSee();
		MenuBar.menuKey();
	}
}
