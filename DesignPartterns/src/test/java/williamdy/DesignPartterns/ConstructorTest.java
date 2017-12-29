package williamdy.DesignPartterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import williamdy.DesignPartterns.Proxy.ProxyTest;
import williamdy.DesignPartterns.State.StateTest;

public class ConstructorTest {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class moClass = StateTest.class;
		Constructor<?> constructor = moClass.getConstructor();
		StateTest appTest = (StateTest) constructor.newInstance();
		appTest.main(null);
	}
}
