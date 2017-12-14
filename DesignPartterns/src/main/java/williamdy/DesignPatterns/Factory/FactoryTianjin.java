package williamdy.DesignPatterns.Factory;

public class FactoryTianjin extends Factory {

	@Override
	public Product createProduct(Type type) {
		Product product = null;
		switch(type){
			case A: product = new ProductA("Tian Jin");
				break;
			case B: product = new ProductB("Tian Jin");
	        	break;
		}
		return product;
	}

}
