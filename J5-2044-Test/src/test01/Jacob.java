package test01;

public class Jacob extends Person{

	Model model;
	
	public Jacob(String name, int age, Model model) {
		super(name, age);
		this.model = model;
	}

	@Override
	protected void speak() {
		System.out.println(model.getNickName() + " speaks!!!");
	}
	
}
