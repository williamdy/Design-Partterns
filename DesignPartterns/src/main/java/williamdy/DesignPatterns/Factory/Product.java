package williamdy.DesignPatterns.Factory;

public abstract class Product {
	private String station;
	
	public abstract void show();

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}
	
}
