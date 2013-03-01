package tp_agile_exo_1_exo_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperatorTest {
	
	Operator operator = new Operator();

	@Test
	public void testAdd() {
		assertEquals("+", operator.getOperator("I + I"));
		
	}
	
	@Test
	public void testSub() {
		assertEquals("-", operator.getOperator("I - I"));
		
	}
	
	@Test
	public void testAdd2() {
		assertEquals("+", operator.getOperator("I+VI"));
		
	}
	
	@Test
	public void testSub2() {
		assertEquals("-", operator.getOperator("I-I"));
		
	}

}
