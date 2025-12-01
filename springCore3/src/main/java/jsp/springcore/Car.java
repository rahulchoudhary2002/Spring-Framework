package jsp.springcore;

class Engine {
	public void run() {
		System.out.println("engine is running");

	}

}

public class Car {
	private Engine engine;
	public void start() {
		engine.run();
		System.out.println("car is starting");

	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
