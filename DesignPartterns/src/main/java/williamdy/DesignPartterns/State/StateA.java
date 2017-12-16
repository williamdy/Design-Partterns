package williamdy.DesignPartterns.State;

public class StateA extends State {

	@Override
	public void handle(Context context) {
		System.out.println(this.getClass() + " handle");
		context.state = new StateB();
	}

}
