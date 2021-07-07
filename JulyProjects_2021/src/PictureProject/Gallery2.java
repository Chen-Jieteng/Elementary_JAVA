package PictureProject;

public class Gallery2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int GAP =10;
		final int MAX_WIDTH = 720;
		final int PICTURE = 20;
		
		Picture pic = new Picture();
		pic.load("picture1.jpg");
		
		Picture pic2 = new Picture();
		pic.load("picture2.jpg");
		pic.move(pic.getWidth(), 0);
	}

}
