package pucrs.qp.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

import pucrs.qp.exercicio.Reader;;

public class ReaderTest {

	@Test
	public void sumStringLineTest() {
		Reader reader = new Reader();
		String line = "1;1;1";
		int result = reader.sumStringLine(line);
		assertEquals(1, result);
	}

}
