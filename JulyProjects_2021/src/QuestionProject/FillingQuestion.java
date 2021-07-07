package QuestionProject;

import java.util.Scanner;

public class FillingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		FillingQuestion q1 = new FillingQuestion();
		q1.setText("1 + 1 = ?");
		q1.setAnswer("2");
		
		q1.display();
		System.out.print("Your answer");
		String response = in.nextLine();
		System.out.println(q1.checkAnswer(response));
	}
	
	private String text;
	private String answer;
	
	public FillingQuestion() {
		text = "";
		answer = "";
	}
	public void setText(String questionText) {
		text = questionText;
	}
	public void setAnswer(String answerText) {
		answer = answerText;
	}
	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	public void display() {
		System.out.println(text);
	}

}
