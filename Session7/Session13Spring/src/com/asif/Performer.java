package com.asif;

public class Performer {

//	Dancer dance;
//	Singer sing;
//	Painter paint;
	
	IArt art;
	
	public Performer(IArt art) {
		// TODO Auto-generated constructor stub
		
	//	dance = new Dancer();
	//	sing = new Singer();
	//	paint = new Painter();
		this.art = art;
	}
	
	public void setArt(IArt art) {
		this.art = art;
	}
	
	public IArt getArt() {
		return art;
	}
	
	void showArt() {
		// TODO Auto-generated method stub
	//	dance.doArt();
	//	sing.doArt();
	//	paint.doArt();
		
		art.doArt();
	}
	
	
}
