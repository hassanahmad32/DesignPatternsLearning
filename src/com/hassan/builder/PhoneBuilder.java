package com.hassan.builder;

public class PhoneBuilder {

	private String os;
	private String name;
	private int ram;
	private String camera;
	private String processor;
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setCamera(String camera) {
		this.camera = camera;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(os, name, ram, camera, processor);
	}
}
