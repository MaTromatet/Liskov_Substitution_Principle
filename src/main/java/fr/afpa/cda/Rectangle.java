package fr.afpa.cda;

public class Rectangle {

	//propri�t�
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

	//m�thode
	public int GetSurface() {
		return height * width;
	}
	
}
