package williamdy.DesignPatterns.Factory;

public enum Type {
	
	A("ProductA"),B("ProductB");
	
	private Type(String type) {
		this.type = type;
	}
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}