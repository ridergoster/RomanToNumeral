package tp_agile_exo_1_exo_2;

public class Result {
	
	private String leftOp;
	private String rightOp;
	private String operator;
	
	private RomanToNumeralConverter converter = new RomanToNumeralConverter();
	
	private int result;

	public int calculate(String string) {
		leftOp = new String (new Operand().getLeftOp(string));
		rightOp = new String (new Operand().getRightOp(string));
		operator = new String (new Operator().getOperator(string));
		
		if (operator.charAt(0) == '+')
			result = converter.convert(leftOp) + converter.convert(rightOp);
		else
			result = converter.convert(leftOp) - converter.convert(rightOp);
		
		return result;
	}

}
