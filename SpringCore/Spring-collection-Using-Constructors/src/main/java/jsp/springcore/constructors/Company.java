package jsp.springcore.constructors;

import java.util.List;

public class Company {
	
	
	String name;
	String location;
	List <String> employees;
	public Company(String name, String location, List<String> employees) {
		super();
		this.name = name;
		this.location = location;
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", employees=" + employees + "]";
	}
	
		
		
	}
