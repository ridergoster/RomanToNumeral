package tp_agile_exo_1_exo_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToNumeralTest {
	
	RomanToNumeralConverter converter = new RomanToNumeralConverter();

	@Test
	public void test1() {
			assertEquals(1, converter.convert("I"));
	}
	
	@Test
	public void test2() {
			assertEquals(2, converter.convert("II"));
	}
	
	@Test
	public void test3() {
			assertEquals(3, converter.convert("III"));
	}
	
	@Test
	public void test4() {
			assertEquals(4, converter.convert("IV"));
	}
	
	@Test
	public void test5() {
			assertEquals(5, converter.convert("V"));
	}
	
	@Test
	public void test9() {
			assertEquals(9, converter.convert("IX"));
	}
	
	@Test
	public void test10() {
			assertEquals(10, converter.convert("X"));
	}
	
	@Test
	public void test6() {
			assertEquals(6, converter.convert("VI"));
	}
	
	@Test
	public void test14() {
			assertEquals(14, converter.convert("XIV"));
	}
	
	@Test
	public void test20() {
			assertEquals(20, converter.convert("XX"));
	}
	
	
	@Test
	public void test37() {
			assertEquals(37, converter.convert("XXXVII"));
	}
	
	@Test
	public void testRien() {
			assertEquals(0, converter.convert(""));
	}
	
	@Test
	public void testHello() {
			assertEquals(0, converter.convert("Hello=&é-ç$$"));
	}
}
