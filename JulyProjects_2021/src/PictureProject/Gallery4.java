package PictureProject;

public class Gallery4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_WIDTH = 720;
		final int PICTURES = 20;
		final int GAP = 10;
		
		Picture pic = new Picture();
		pic.load("picture1.jpg");
		int x = 0;
		for(int i = 2; i <= PICTURES; i++) {
			Picture previous = pic;
			pic = new Picture();
			pic.load("picture" + i + ".jpg");
			x = x + previous.getWidth() + GAP;
			pic.move(x, 0);
		}
		

	}

}
