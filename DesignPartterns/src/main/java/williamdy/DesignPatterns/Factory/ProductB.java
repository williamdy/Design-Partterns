package williamdy.DesignPatterns.Factory;

public class ProductB extends Product {

	ProductB(){
		System.out.println("product B is making!");
	}
	
	@Override
	public void show() {

		System.out.println("this is product B!");
	}

}
