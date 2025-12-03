package jsp.springcore.constructors;

class Mobile {

	public void ring() {
		System.out.println("Mobile is ringing");
	}
}

public class Person {
	Mobile mobile;

	public void use() {
		mobile.ring();
		System.out.println("person is using mobile");
	}

	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

}
