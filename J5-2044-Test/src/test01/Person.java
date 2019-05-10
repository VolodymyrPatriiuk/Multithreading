package test01;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		speak();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	protected void speak() {
		System.out.println("Person doesn't speak");
	}
	
	@Override
	public String toString() {
		return getName() + ": " + getAge();
	}
	
}
