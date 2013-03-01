package tp_agile_exo_1_exo_2;

public class Operator {

	public String getOperator(String string) {
		for (int i = 0 ; i < string.length() ; i++) {
			if (string.charAt(i) == '+') return "+";
			if (string.charAt(i) == '-') return "-";
		}
		return null;
	}

}
