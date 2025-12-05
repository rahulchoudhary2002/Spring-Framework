package jsp.springcore.constructors;

import java.util.List;

public class School {
	
	
	String name;
	String location;
	List <String> students;
	public School(String name, String location, List<String> students) {
		super();
		this.name = name;
		this.location = location;
		this.students = students;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", location=" + location + ", students=" + students + "]";
	}
	
	
		
		
	}
