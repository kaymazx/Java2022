package oopWithNLayeredAppKodlamaio.entities;

public class Instructor {

	private int instructorId;
	private String instructorName;
	private String lastinstructorLastName;

	public Instructor() {

	}

	public Instructor(int instructorId, String instructorName, String lastinstructorLastName) {
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.lastinstructorLastName = lastinstructorLastName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getLastinstructorLastName() {
		return lastinstructorLastName;
	}

	public void setLastinstructorLastName(String lastinstructorLastName) {
		this.lastinstructorLastName = lastinstructorLastName;
	}

}
