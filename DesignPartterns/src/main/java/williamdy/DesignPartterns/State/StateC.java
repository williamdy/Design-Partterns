package williamdy.DesignPartterns.State;

public class StateC extends State {

	@Override
	public void handle(Context context) {
		System.out.println(this.getClass() + " handle");
		context.state = new StateA();
	}

}
