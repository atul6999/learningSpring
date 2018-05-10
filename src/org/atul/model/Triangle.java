package org.atul.model;

import org.atul.dao.Shape;

public class Triangle implements Shape{
	private int id;
	private String name;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	@Override
	public void draw() {
		System.out.println("Draw method for Traingle");
	}
	@Override
	public String toString() {
		return "Triangle [id=" + id + ", name=" + name + ", pointA=" + pointA.toString() + ", pointB=" + pointB.toString() + ", pointC="
				+ pointC.toString() + "]";
	}

}
