package pucrs.qp.exercicio;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
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
	
	@Test
	public void writeListStringInFileTest() {
		Writer writer = new Writer();
		List<String> stringList = new ArrayList<>();
		stringList.add("Teste");
		stringList.add("Outro teste");
		writer.writeListStringInFile(stringList);
		File file = new File("numbers.txt");
		assertTrue(file.exists());
	}

	@Test
	public void powerTest() {
		Writer writer = new Writer();
		List<String> test = writer.mountNumbers();
		assertEquals("3:9:27", test[2]);
	}
}
