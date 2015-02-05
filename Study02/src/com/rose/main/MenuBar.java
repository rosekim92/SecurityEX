package com.rose.main;

import java.util.Scanner;

import com.rose.control.FigureController;

public class MenuBar {
	public static Scanner scan = new Scanner(System.in);
	static FigureController fgcon = new FigureController();
	static int inputone;
	static int inputtwo;
	static int inputsear;
	//static�ʱ�ȭ
	static{
		inputone=0;
		inputtwo=0;
		inputsear=0;
	}
	
	
	//���� �޴�
	public static void menuSee() {
		System.out.println("========================");
		System.out.println("1.�Է��ϱ� 2.��ȸ�ϱ�  3.�����ϱ�");
		System.out.println("����: ");
		inputone = scan.nextInt();
	}
	//�Է�,��ȸ,���� �����ϱ�
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
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
	}
	//���������� �����Ͽ� �Է��ϱ�	
	public static void menuFigure(){
		System.out.println("==========================");
		System.out.println("1.���� 2.�ﰢ�� 3.�簢�� 4.�ڷΰ���");
		System.out.println("�Է�: ");
		inputtwo = scan.nextInt();
	}
	//������ ��� �Է��ϱ�
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
	
	//�������� �Է��ϱ�
	public static void inputCircle(){
		System.out.println("�������� �Է��Ͻÿ�");
		double cirinput=scan.nextDouble();
		fgcon.addCircle(cirinput);
		menuFigure();
		menuFigKey();
	}
	//�ﰢ������ �Է��ϱ�
	public static void inputTriangle(){
		System.out.println("�ﰢ���� �غ��� �Է��Ͻÿ�");
		double tribottom=scan.nextDouble();
		System.out.println("�ﰢ���� ���̸� �Է��Ͻÿ�");
		double triheight=scan.nextDouble();
		fgcon.addTriangle(tribottom, triheight);
		menuFigure();
		menuFigKey();
	}
	//�簢������ �Է��ϱ�
	public static void inputRect(){
		System.out.println("�簢���� �غ��� �Է��Ͻÿ�");
		double retbottom=scan.nextDouble();
		System.out.println("�簢���� ���̸� �Է��Ͻÿ�");
		double retheight=scan.nextDouble();
		fgcon.addRect(retbottom, retheight);
		menuFigure();
		menuFigKey();
	}
	//���������� �����Ͽ� ��ȸ�ϱ�	
	public static void searchKey(){
		System.out.println("==========================");
		System.out.println("1.���� 2.�ﰢ�� 3.�簢�� 4.�ڷΰ���");
		System.out.println("�Է�: ");
		inputsear = scan.nextInt();
	}
	//������ ��� �Է��ϱ�
	public static void searchFigure(){
		switch(inputsear){
		case 1:
			System.out.println("�������� �Է��ϼ���.");
			System.out.println("�Է�:");
			double seaCir=scan.nextDouble();
			fgcon.searchCir(seaCir);
			break;
		case 2:
			System.out.println("�غ��� �Է��ϼ���.");
			System.out.println("�Է�:");
			double seatribot=scan.nextDouble();
			System.out.println("���̸� �����ϼ���");
			System.out.println("�Է�:");
			double seatrihei=scan.nextDouble();
			fgcon.searchTri(seatribot, seatrihei);
			break;
		case 3:
			System.out.println("�غ��� �Է��ϼ���.");
			System.out.println("�Է�:");
			double searetbot=scan.nextDouble();
			System.out.println("���̸� �����ϼ���");
			System.out.println("�Է�:");
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






























