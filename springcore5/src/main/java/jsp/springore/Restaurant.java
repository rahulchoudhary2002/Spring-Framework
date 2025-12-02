package jsp.springore;

import java.util.Map;

public class Restaurant {
	private String name;
	private String location;
	private Map<Integer,String> dish;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Map<Integer, String> getDish() {
		return dish;
	}


	public void setDish(Map<Integer, String> dish) {
		this.dish = dish;
	}


	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", location=" + location + ", dish=" + dish + "]";
	}
}
