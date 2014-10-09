package com.android.menu;

public class SelecedMenu {
	private String name;
	private int price;
	public SelecedMenu(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + ", " + price;
	}
	
}
