package jsp.springcore.constructors;

public class Product {
	
		public int id;
		public String name;
		public double price;
		public Product(int id, String name, double price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
		
		
	}
