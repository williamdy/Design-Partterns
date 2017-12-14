package williamdy.DesignPatterns.Factory;

public class FactoryBeiJing extends Factory {

	@Override
	public Product createProduct(Type type) {
		Product product = null;
		switch(type){
			case A: product = new ProductA("Bei Jing");
				break;
			case B: product = new ProductB("Bei Jing");
	        	break;
		}
		return product;
	}

}
