package entities;

import entities.enums.Colors;

public class Rectagle extends Shape {

	private double width;
	private double heigh;
    
	public Rectagle() {
		super();
	}
	
	
	
	public Rectagle(Colors color, double width, double heigh) {
		super(color);
		this.width = width;
		this.heigh = heigh;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeigh() {
		return heigh;
	}



	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}



	@Override
	public double area() {
		return width*heigh;
	}
}
