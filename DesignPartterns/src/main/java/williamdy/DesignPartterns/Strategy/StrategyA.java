package williamdy.DesignPartterns.Strategy;

public class StrategyA extends Strategy {

	@Override
	public String AlgorithmInterface(Object... params) {
		String result = "";
		for (Object object : params) {
			result += "[" + object.toString() + "] ";
		}
		return result;
	}

}
