package williamdy.DesignPartterns.Proxy;

public class RealSubject implements Subject {

	public void request() {
		System.out.println("Real Subject response");
	}

}
