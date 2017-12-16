package williamdy.DesignPartterns.Strategy;

public class Context {
	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public <T>T contextInterface(Object ...objects ){
		return strategy.AlgorithmInterface(objects);
	}
	
}
