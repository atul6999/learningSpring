package org.atul.model;

import org.atul.dao.Shape;

public class Circle implements Shape{
	private int id;
	private String name;
	private Point center;
	
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
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	@Override
	public void draw() {
		System.out.println("Draw method for circle");
	}
	public Circle(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Circle() {
		
	}
	
}
