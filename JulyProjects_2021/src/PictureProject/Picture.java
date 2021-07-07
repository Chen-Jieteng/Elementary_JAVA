package PictureProject;

public class Picture {
	String picture;
	int height;
	int width;
	
	public void load(String src) {
		picture = src;
	}
	public void move(int dx, int dy) {
		width = width + dx;
		height = height + dy;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}
