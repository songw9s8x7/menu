package com.android.frankmenu;

public class SelecedMenu {
	private String menumsg;
	public SelecedMenu(){
		this.menumsg = " ";
	}
	public SelecedMenu(String msg){
		this.menumsg = msg;
	}
	@Override
	public String toString() {
		return menumsg;
	}
	
}
