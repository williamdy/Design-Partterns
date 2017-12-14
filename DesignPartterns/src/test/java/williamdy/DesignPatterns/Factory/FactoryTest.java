package williamdy.DesignPatterns.Factory;

public class FactoryTest {
	public static void main(String[] args) {
		Factory factory1 = new FactoryBeiJing();
		Factory factory2 = new FactoryTianjin();
		Product A = factory1.createProduct(Type.A);
		Product B = factory2.createProduct(Type.B);
		A.show();
		B.show();
		
	}
}
