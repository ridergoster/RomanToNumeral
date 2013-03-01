package tp_agile_exo_1_exo_2;

public class Operand {
	
	private Operator operator = new Operator();
	private String str [];
	
	public Operand () {
		
	}

	public String getLeftOp(String string) {
		str = string.split("\\" + operator.getOperator(string));
		return str[0].trim();
	}

	public String getRightOp(String string) {
		str = string.split("\\" + operator.getOperator(string));
		return str[1].trim();
	}

}
