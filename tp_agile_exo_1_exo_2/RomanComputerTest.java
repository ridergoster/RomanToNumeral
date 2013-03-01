package tp_agile_exo_1_exo_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanComputerTest {

	RomanComputer computer = new RomanComputer ();
	
	@Test
	public void testASum2() {
		assertEquals("II", computer.compute("I + I"));
	}

	
	@Test
	public void testASum11() {
		assertEquals("XI", computer.compute("IX + II"));
	}

	@Test
	public void testASum5() {
		assertEquals("VI", computer.compute("XII - VI"));
	}
	
	@Test
	public void testASum6() {
		assertEquals("VI", computer.compute("X - IV"));
	}
	
	@Test
	public void testA4Sub4() {
		assertEquals("", computer.compute("IV - IV"));
	}
	
	@Test
	public void test50() {
		assertEquals("LXXIII", computer.compute("CXI - XXXVIII"));
	}
}
