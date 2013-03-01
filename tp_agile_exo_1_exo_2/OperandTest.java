package tp_agile_exo_1_exo_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperandTest {
	
	Operand operand = new Operand();

	@Test
	public void testLeftOp() {
		assertEquals("XI", operand.getLeftOp("XI + II"));
	}
	
	@Test
	public void testRightOp() {
		assertEquals("II", operand.getRightOp("IX - II"));
	}
	
	@Test
	public void testLeftOp2() {
		assertEquals("XI", operand.getLeftOp("XI+II"));
	}
	
	@Test
	public void testRightOp2() {
		assertEquals("II", operand.getRightOp("IX- II"));
	}

}
