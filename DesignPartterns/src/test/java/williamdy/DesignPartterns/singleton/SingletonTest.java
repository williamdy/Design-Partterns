package williamdy.DesignPartterns.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton_Eager s1 = Singleton_Eager.getInstance();
		Singleton_Eager s2 = Singleton_Eager.getInstance();
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println(s1 == s2);

		Singleton_Lazy s3 = Singleton_Lazy.getInstance();
		Singleton_Lazy s4 = Singleton_Lazy.getInstance();
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println(s3 == s4);
	}
}
