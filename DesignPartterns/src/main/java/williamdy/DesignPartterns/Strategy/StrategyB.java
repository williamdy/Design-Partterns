package williamdy.DesignPartterns.Strategy;

public class StrategyB extends Strategy {

	@Override
	public String AlgorithmInterface(Object... params) {
		String result = "";
		for (Object object : params) {
			result += "[" + object.getClass() + ":" + object.toString() + "] ";
		}
		return result;
	}

}
