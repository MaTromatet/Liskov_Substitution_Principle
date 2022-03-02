package fr.afpa.cda;

public class Rectangle {

	//propriété
	private int height;
	private int width;
	
	//getter Setter
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	//méthode
	public int GetSurface() {
		return height * width;
	}
	
}
