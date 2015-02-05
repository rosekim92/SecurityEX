package com.rose.vo;

public class RectInfoVO {
	public double retX;
	public double retY;
	
	public double getRetX() {
		return retX;
	}
	public void setRetX(double retX) {
		this.retX = retX;
	}
	public double getRetY() {
		return retY;
	}
	public void setRetY(double retY) {
		this.retY = retY;
	}
	public double getArea(){
		return retX*retY;
	}
}
