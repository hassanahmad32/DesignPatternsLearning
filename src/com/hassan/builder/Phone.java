package com.hassan.builder;
//Builder Design Patter
public class Phone {
	
	private String os;
	private String name;
	private int ram;
	private String camera;
	private String processor;
	
	public Phone(String os, String name, int ram, String camera, String processor)
	{
		super();
		this.os = os;
		this.name = name;
		this.ram = ram;
		this.camera = camera;
		this.processor = processor;
	}
	
	@Override
	public String toString()
	{
		return "OS = " + os + ", Name = " + name + ", RAM = " + ram + ", Camera = " + camera + ", Processor = " + processor; 
	}
}
