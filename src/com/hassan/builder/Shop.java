package com.hassan.builder;

public class Shop {
	public static void main(String[] args)
	{
		Phone p = new PhoneBuilder().setOs("Windows").setRam(0).getPhone();
		System.out.println(p);
	}
}
