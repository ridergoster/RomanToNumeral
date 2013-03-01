package tp_agile_exo_1_exo_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeralToRomanConverterTest {
	
	NumeralToRomanConverter converter = new NumeralToRomanConverter();

	@Test
	public void test() {
		assertEquals("I",converter.convert(1));
	}
	
	@Test
	public void test14() {
		assertEquals("XIV",converter.convert(14));
	}
	
	@Test
	public void test20() {
		assertEquals("XX",converter.convert(20));
	}

}
