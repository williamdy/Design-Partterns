package williamdy.DesignPartterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class forThread {
     public static void main(String[] args) throws InterruptedException {
    	 ArrayList<String> cc = new ArrayList<String>();
    	 List<String> result = Collections.synchronizedList( new ArrayList<String>());
    	
    	for(int i = 0;i<10000;i++){
    		String cp = i + "s";
			cc.add(cp);
		}
    	System.out.println(cc.size()); 
		System.out.println(System.currentTimeMillis());
		for (String cx : cc ) {
			System.out.println(cx);
			Thread thread = new Thread(){
				@Override 
				public void run() { 
					try {
						sleep(1000);
						result.add(cx + "in"+ System.currentTimeMillis());
//						System.out.println(1 + ":" + result);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
			}
			;
			thread.start();
		}
		System.out.println(System.currentTimeMillis());
		
//		Thread.sleep(1000);
		while(result.size() != cc.size()){
			Thread.sleep(100);
		}
		System.out.println(result.size()); 
		for (String string : result) {
			 	System.out.println(string);
			}
	}
}
