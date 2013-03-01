package tp_agile_exo_1_exo_2;

public class RomanComputer {
	
	private NumeralToRomanConverter converter = new NumeralToRomanConverter();
	private Result result = new Result();

	public String compute(String string) {
		String str = converter.convert(result.calculate(string));
		System.out.println(string.concat(" = " + str));
		return str;
	}

}
