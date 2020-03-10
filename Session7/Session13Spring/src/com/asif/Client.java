package com.asif;

public class Client {

	public static void main(String[] args) {
		
		Performer p = new Performer(new Gymnast());
		Performer p1 = new Performer(new Dancer());

		Performer p2 = new Performer(new Singer());
		
		p.setArt(new Painter());
		
		
		p.showArt();
		p1.showArt();
		p2.showArt();
		
	}
}
