package StudentProject;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String name;
	private int id;
	
	public Student(int anId) {
		id = anId;
	}
	
	public void setName(String newName) {
		if(newName.length() > 0) {
			name = newName;
		}
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
