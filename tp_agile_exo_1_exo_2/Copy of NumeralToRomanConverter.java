package tp_agile_exo_1_exo_2;

public class NumeralToRomanConverter {

	private String romanNumber = "";
	
    private static final String[] romanValue    = {"M", "CM", "D", "CD", "C", "XC", "L",
         										        "XL", "X", "IX", "V", "IV", "I"};
    
    private static final int[]    numeralValue  = {1000, 900, 500, 400,  100,   90,  50,
         										         40,   10,    9,   5,   4,    1};
	
	
	public String convert(int n) {
		
		for (int index = 0; index < romanValue.length; index++) {
			while (n >= numeralValue[index]) {
				n -= numeralValue[index];
				romanNumber  += romanValue[index];
			}
		}
		
		return romanNumber;
	}

}
