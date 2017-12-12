package williamdy.DesignPartterns.singleton;

public class Singleton_Eager {
	private static Singleton_Eager instance = null;
	
	//constructor
	private Singleton_Eager() {
		System.out.println("step in constructor of Singleton_Eager");
	}
	
	//only one path to getInstance
		public static Singleton_Eager getInstance(){
			System.out.println("step in getInstance of Singleton_Eager");
			if(instance == null){
				synchronized (Singleton_Eager.class) {
					if(instance == null){
						instance = new Singleton_Eager();
					}
				}
			}
			return instance;
		}
}
