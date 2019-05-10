package test01;

public class Test {

	public static void main(String[] args) {

		// set model
		Model model = new Model();
		model.setNickName("Jacob");
		
		Jacob jacob = new Jacob("Volodymyr", 44, model);
		System.out.println(jacob);
		
	}

}
