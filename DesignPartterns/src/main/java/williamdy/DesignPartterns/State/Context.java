package williamdy.DesignPartterns.State;

public class Context {
	State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Context(State state) {
		super();
		this.state = state;
	}
	
	public void request(){
		state.handle(this);
	}
}
