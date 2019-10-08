package pucrs.qp.exercicio;

import static org.junit.Assert.*;

import java.util.List;

import pucrs.qp.exercicio.Writer;

import org.junit.Test;

public class WriterTest {

	@Test
	public void mountNumbersTest() {
		Writer writer = new Writer();
		List<String> test = writer.mountNumbers();
		assertEquals(10, test.size());
	}

}
