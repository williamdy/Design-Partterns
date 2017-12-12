package williamdy.DesignPartterns.singleton;

public class Singleton_Lazy {
	
	private final static Singleton_Lazy instance = new Singleton_Lazy();
	
	//constructor
	private Singleton_Lazy(){
		System.out.println("step in constructor of singleton_lz");
	}
	
	//only one path to getInstance
	public static Singleton_Lazy getInstance(){
		System.out.println("step in getInstance of singleton_lz");
		return instance;
	}
}