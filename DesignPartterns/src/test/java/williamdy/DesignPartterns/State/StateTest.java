package williamdy.DesignPartterns.State;

public class StateTest {
	public static void main(String[] args) {
		State state = new StateA(); 
		Context context = new Context(state);
		context.request();
		context.request();
		context.request();
		context.request();
	}
}
