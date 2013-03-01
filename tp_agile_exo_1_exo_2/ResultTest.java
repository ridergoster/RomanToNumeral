package tp_agile_exo_1_exo_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultTest {
	
	Result res = new Result();
	
	@Test
	public void testRes2() {
		assertEquals(2 , res.calculate("I + I"));
	}


	@Test
	public void testRes5() {
		assertEquals(5 , res.calculate("IV + I"));
	}
	
	@Test
	public void testRes15() {
		assertEquals(15 , res.calculate("XVI-I"));
	}

}
