package PictureProject;

public class Gallery3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_WIDTH = 720;
		final int GAP = 20;
		final int PICTURES = 20;
		
		Picture pic = new Picture();
		pic.load("Picture.jpg");
		Picture pic2 = new Picture();
		pic2.load("Picture.jpg");
		int x = pic2.getWidth() + GAP;
		pic2.move(x, 0);
	}

}
