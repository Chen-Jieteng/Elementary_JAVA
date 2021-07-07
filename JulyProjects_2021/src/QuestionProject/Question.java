package QuestionProject;
import java.util.ArrayList;
//当用户要增加选择题的选项
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private ArrayList<String> choices;
	public Question() {
		choices = new ArrayList<String>();
	}
	public void add(String option) {
		choices.add(option);
	}
	

}
