package williamdy.DesignPartterns.Strategy;

public class Client {
	public static void main(String[] args) {
		Strategy strategy = new StrategyA();
		Integer[] params = {new Integer(1),2};
		Context context = new Context(strategy);
		System.out.println(context.contextInterface(params));
		strategy = new StrategyB();
		context = new Context(strategy);
		System.out.println(context.contextInterface(params));
		
		Object[] objects = new Object[3];
		objects[0] = new Integer(6);
		objects[1] = "English";
		objects[2] = strategy;
		System.out.println(context.contextInterface(objects));
	}
}
