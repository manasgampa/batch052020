package com.antra;

public class Bike implements Vechile{
	
	Float f=new Float(34.56);
	
	@Override
	public boolean isFourWheeler() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isToWheeler() {
		// TODO Auto-generated method stub
		return true;
	}
}
