package com.codegnan;

public class Triangle extends Figure{

	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
			}
	
	public double area() {
		System.out.println("inside area of a trainagle");
		return (dim1*dim2)/2;
	}

}
