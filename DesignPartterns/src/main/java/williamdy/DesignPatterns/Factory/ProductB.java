package williamdy.DesignPatterns.Factory;

public class ProductB extends Product {
	ProductB(String station){
		setStation(station);
		System.out.println("product B is making in " + station + "!");
	}
	
	@Override
	public void show() {

		System.out.println("this is product B made in " + getStation() + "!");
	}

}
