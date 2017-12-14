package williamdy.DesignPatterns.Factory;

public class ProductA extends Product {

	ProductA(String station){
		setStation(station);
		System.out.println("product A is making in " + station + "!");
	}
	
	@Override
	public void show() {
		
		System.out.println("this is product A made in " + getStation() + "!");

	}

}
