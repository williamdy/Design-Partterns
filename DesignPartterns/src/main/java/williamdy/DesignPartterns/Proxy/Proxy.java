package williamdy.DesignPartterns.Proxy;

public class Proxy implements Subject{

	RealSubject realSubject;
	
	public void request() {
		
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		
		realSubject.request();
		System.out.println("proxy Subject response");
	}

}
