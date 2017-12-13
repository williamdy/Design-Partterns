package williamdy.DesignPatterns.Factory;

public class ProductA extends Product {

	ProductA(){
		System.out.println("product A is making!");
	}
	
	@Override
	public void show() {
		
		System.out.println("this is product A!");

	}

}
