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
	}
}
