package jsp.springcore.collection;

import java.util.List;


public class Course {
	private String name;
	private int duration;
	private List <String> subjects;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", subjects=" + subjects + "]";
	}
	
}
