package jsp.springcore.constructors;

import java.util.Map;

public class Shop {
	
	public String name;
	public String location;
	Map<Integer,String>product;
	public Shop(String name, String location, Map<Integer, String> product) {
		super();
		this.name = name;
		this.location = location;
		this.product = product;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", location=" + location + ", product=" + product + "]";
	}
	
		
		
	}
